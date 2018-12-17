package org.hameister;


import org.hameister.Inventory;
import org.hameister.InventoryRepository;
import org.hameister.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	//one
	@RequestMapping(value = "/api/inventory/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Inventory> getInventory(@PathVariable("id") int id) {
 
		Inventory inventory =inventoryService.findById(id);
 
        if(inventory == null) {
 
            return new ResponseEntity<Inventory>(HttpStatus.NOT_FOUND);
        }
 
        return new ResponseEntity<Inventory>(inventory, HttpStatus.OK);
    }
	//update
	@RequestMapping(value = "/api/persons/{id}", method = RequestMethod.PUT, consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Inventory> updatePerson (@RequestBody Inventory inventory) {
 
        if (inventory.getId() == 0) {
            return  new ResponseEntity<Inventory>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
 
        Inventory updated = inventoryService.update(inventory);
 
        if (updated==null){
            return  new ResponseEntity<Inventory>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  new ResponseEntity<Inventory>(updated, HttpStatus.OK);
    }
}
