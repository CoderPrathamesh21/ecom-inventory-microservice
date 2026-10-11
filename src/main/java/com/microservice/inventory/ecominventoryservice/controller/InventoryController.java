package com.microservice.inventory.ecominventoryservice.controller;

import com.microservice.inventory.ecominventoryservice.entity.Inventory;
import com.microservice.inventory.ecominventoryservice.service.InventoryService;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    //@SneakyThrows
    @GetMapping("/{productId}")
    public Inventory checkInventory(@PathVariable Long productId) throws Exception {
        //Thread.sleep(7000); // Simulate delay
        //throw new Exception("Inventory service is down"); // Simulate service failure(retry implementation)
        return inventoryService.checkStock(productId);
    }

    @PostMapping
    public String addProduct(@RequestBody Inventory inventory) {
        return inventoryService.addProduct(inventory);
    }

}
