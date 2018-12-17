package org.hameister;



public class ShippingTrans {
	
	private String shippingReceiverName;
	public int getBestellNr() {
		return bestellNr;
	}

	public void setBestellNr(int bestellNr) {
		this.bestellNr = bestellNr;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}


	//die zwei könnten ein Objekt sein..
	private String product;
	private int menge;
	private int inventar;
	private int bestellNr;
	
	
	public ShippingTrans(String shippingReceiverName, String product, int menge, int inventar, int bestellNr) {
		this.shippingReceiverName = shippingReceiverName;
		this.product = product;
		this.menge = menge;
		this.inventar = inventar;
		this.bestellNr = bestellNr;
	}
	
	public String inventarAbzug() {
		int akutellerBestand = this.inventar - this.menge;
		return "Aktueller Bestand: " +akutellerBestand;
	}
	
	public String sendProduct() {
		return this.shippingReceiverName+" hat sein " +product+ " erhalten.";
	}
	
	

	public String getShippingReceiverName() {
		return shippingReceiverName;
	}
	

	public void setShippingReceiverName(String shippingReceiverName) {
		this.shippingReceiverName = shippingReceiverName;
	}
	

	public String getProduct() {
		return product;
	}
	

	public void setProduct(String product) {
		this.product = product;
	}
	

	public int getMenge() {
		return menge;
	}
	

	public void setPrice(int menge) {
		this.menge = menge;
	}
	

	public int getInventar() {
		return inventar;
	}

	
	public void setInventar(int inventar) {
		this.inventar = inventar;
	}
	
	
	
	
}