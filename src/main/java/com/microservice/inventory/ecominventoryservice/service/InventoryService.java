package com.microservice.inventory.ecominventoryservice.service;

import com.microservice.inventory.ecominventoryservice.entity.Inventory;
import com.microservice.inventory.ecominventoryservice.repo.InventoryRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {

    private final InventoryRepo inventoryRepo;

    public InventoryService(InventoryRepo inventoryRepo) {
        this.inventoryRepo = inventoryRepo;
    }

    public Inventory checkStock(Long productId) {
        Optional<Inventory> inventory = inventoryRepo.findById(productId);
        return inventory.get();
    }

    public String addProduct(Inventory inventory) {
        inventoryRepo.save(inventory);
        return "Product added successfully";
    }

}
