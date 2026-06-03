package com.microservice.inventory.ecominventoryservice.repo;

import com.microservice.inventory.ecominventoryservice.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {
}
