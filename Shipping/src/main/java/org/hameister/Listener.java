//copied by Robin Widmer for Testing purpose
/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package org.hameister;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.clo
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.hameister.ShippingTrans;
import org.hameister.OrderMessage;
import org.hameister.EventMessage;

//nothing works 
@Component
@EnableCaching(Sink.class)
public class Listener {

    @Autowired
    private ShippingTrans shipmenttrans;

    private static Logger logger = LoggerFactory.getLogger(Listener.class);

    @StreamListener(target = Sink.INPUT,
            condition = "headers['type']=='ShipGoods'")
    @Transactional
    public void payment(@Payload EventMessage<OrderMessage> eventMessage) throws Exception {
        OrderMessage orderMessage = eventMessage.getPayload();
        logger.info("Payload received: " + orderMessage.toString());
        Tracking tracking = shipmenttrans.shipGoods("Robin", "Nesquik", 1,50, 1234);
        orderMessage.setTrackingId(tracking.getTrackingId());
        orderMessage.setStatus("GoodsShipped");
        logger.info(orderMessage.toString());
    }

    @StreamListener(target = Sink.INPUT)
    public void defaultListener() {}
}
}
