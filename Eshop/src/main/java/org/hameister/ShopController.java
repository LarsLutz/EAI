package org.hameister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.hameister.SendingOrder;
import org.hameister.Ordermessage;

import java.util.UUID;

@Controller
public class ShopController {

	@Autowired private SendingOrder sendingOrder;

	@GetMapping(path = "/checkout", produces = "text/plain")
	public ResponseEntity<String> getCheckout(){
		
		
        Ordermessage orderMessage = new Ordermessage(UUID.randomUUID().toString(), "Nesquik", "1", 17, true);
        sendingOrder.doCheckout(orderMessage);
        return ResponseEntity.ok(orderMessage.toString());
    }
}
