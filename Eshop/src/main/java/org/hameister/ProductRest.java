package org.hameister;


import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hameister.Product;

@Named
@Path("/restproduct")
public class ProductRest {
	

private static List<Product> products = new ArrayList<Product>();
static {
Product product1 = new Product(1, "Nesquik", 17);
Product product2 = new Product(2,"Frostys",27);
Product product3 = new Product(3,"Frootloops",37);

products.add(product1);
products.add(product2);
products.add(product3);
}

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Product> getProducts() {
return products;
}
@GET
@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public Product getProduct(String name) {
	Product prod = null;
	for (Product p : products) {
	if (p.getProductName() == name)
	prod = p;
	}
	return prod;
}

}
