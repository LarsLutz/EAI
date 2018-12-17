package org.hameister;

public class Product {

	private int productId;
	private String productName;
	private int amount;
	
	
	public Product() {
		
	}
	public Product (int productId, String productName, int amount) {
		this.productId = productId;
		this.productName = productName;
		this.amount = amount;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
