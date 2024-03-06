package com.productservice.inventory.service.service;


import com.productservice.inventory.service.dto.InventoryResponse;
import com.productservice.inventory.service.repository.InventoryRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {


    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skucode){

      return inventoryRepository.findBySkucodeIn(skucode).stream()
              .map(inventory ->
                  InventoryResponse.builder()
                          .skucode(inventory.getSkucode())
                          .isInStock(inventory.getQuantity()>0)
                          .build()
              ).toList();

    }


}
