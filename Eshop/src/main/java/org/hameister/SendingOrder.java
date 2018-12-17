package org.hameister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.hameister.Ordermessage;

@Component
public class SendingOrder {

	@Autowired
    private RestTemplate restTemplate;

    public void doCheckout(Ordermessage orderMessage){

        restTemplate.postForObject("http://localhost:8080", new HttpEntity<>(orderMessage), Ordermessage.class);

    }
	
}
