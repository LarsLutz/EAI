package org.hameister;

public class Customer {
    private int customerId;
    private boolean loyaltyPoints;
    
    public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public boolean getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(boolean loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	private String creditCard;



    public Customer() {
    }

    public Customer(int i, boolean loyaltyPoints, String creditCard) {
        this.customerId = i;
        this.loyaltyPoints = loyaltyPoints;
        this.creditCard = creditCard;
    }
}