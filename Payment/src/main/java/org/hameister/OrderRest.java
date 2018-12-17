package org.hameister;


import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.hameister.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


@Named
public class OrderRest {
	
	private long id = 1;
	
	@Autowired
	private RestTemplate restTemplate;
	
	Order order = new Order();
	public Customer  = restTemplate.getForObject(“http:/"+"/localhost:8080/customer”, + Customer.class,idCustomer);
//	
//	Product product = restTemplate.getForObject(
//			“localhost:8080/product?id={id}”, Product.class,
//			idProduct);
	
	
	
	
	
	
}
