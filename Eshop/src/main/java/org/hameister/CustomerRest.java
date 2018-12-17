package org.hameister;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hameister.Customer;

@Named
@Path("/restcustomer")
public class CustomerRest {
	

private static List<Customer> customer = new ArrayList<Customer>();
static {
Customer customer1 = new Customer(1, true , "5000 1234 1234 1234");


customer.add(customer1);

}

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Customer> getCustomer() {
return customer;
}
@GET
@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public Customer getCustomer(int i) {
	Customer cust = null;
	for (Customer p : customer) {
	if (p.getCustomerId() == i)
	cust = p;
	}
	return cust;
}

}
