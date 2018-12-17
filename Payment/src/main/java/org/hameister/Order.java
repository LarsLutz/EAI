package org.hameister;


import java.util.Date;
public class Order {
private long id;
private long amount;
private Date dateOrder;
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public long getAmount() {
return amount;
}
public void setAmount(long amount) {
this.amount = amount;}
public Date getDateOrder() {
return dateOrder;
}
public void setDateOrder(Date dateOrder) {
this.dateOrder = dateOrder;
}

}