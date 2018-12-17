package org.hameister;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Product")
public class Inventory {
	
	@Id
    @GeneratedValue
    int id;
	
	@Column(name = "name")
    String name;
	
	@Column(name = "stock")
    Long stock;
	
	public Inventory(){
		
	}

	public Inventory(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	

	
}
