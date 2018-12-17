package org.hameister;


public class Ordermessage {

	private String orderId;
	private String item;
	private String customerId;
	private int amount;
	private boolean loyalty;



public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isLoyalty() {
		return loyalty;
	}

	public void setLoyalty(boolean loyalty) {
		this.loyalty = loyalty;
	}

public Ordermessage() {
}

public Ordermessage (String orderId, String item, String customerId, int amount, boolean loyalty) {
	this.orderId = orderId;
	this.item = item;
	this.customerId = customerId;
	this.amount = amount;
	this.loyalty = loyalty;

}

public String getOrderId() {
	return orderId;
}

public void setOrderId(String orderId) {
	this.orderId = orderId;
}

public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
}
