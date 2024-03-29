package com.productservice.inventory.service.repository;

import com.productservice.inventory.service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

    List<Inventory> findBySkucodeIn(List<String> skucode);
}
