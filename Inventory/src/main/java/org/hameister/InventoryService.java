package org.hameister;

import org.hameister.Inventory;
import org.hameister.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class InventoryService {
	
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	public int stockChange() {
		
	//	List<Inventory> inventoryList= InventoryRepository.findAll();
				
				
		return 0;
	}
	
	public Inventory addInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}
	
	public Inventory update (Inventory inventory) {
		Inventory presistedInventory = inventoryRepository.findById(inventory.getId());
		
		if(presistedInventory == null) {
			return null;
		}
		return inventoryRepository.save(inventory);
	}

	public Inventory findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
