package com.productservice.inventory.service.service;


import com.productservice.inventory.service.repository.InventoryRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {


    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    public boolean isInStock(String skucode){

      return inventoryRepository.findBySkucode(skucode).isPresent();

    }
}
