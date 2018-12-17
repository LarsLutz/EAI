package org.hameister;

import org.hameister.Inventory;
import org.hameister.InventoryRepository;
import org.hameister.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ini {
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	@Autowired
    InventoryService inventoryService;
	
	 @Autowired
	    public Ini(InventoryRepository repository, InventoryService service) {
	        this.inventoryRepository = repository;
	        this.inventoryService = service;
	        
	        Inventory inventory1 = new Inventory(1, "Nesquik", 50);
	        
	        Inventory newInventory = inventoryService.addInventory(inventory1);
	        
	 }

}


