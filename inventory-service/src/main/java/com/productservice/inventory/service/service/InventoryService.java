package com.productservice.inventory.service.service;


import com.productservice.inventory.service.dto.InventoryResponse;
import com.productservice.inventory.service.repository.InventoryRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {


    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> skucode){
    log.info("wait Started");
    Thread.sleep(10000);
    log.info("Wait Ended");
      return inventoryRepository.findBySkucodeIn(skucode).stream()
              .map(inventory ->
                  InventoryResponse.builder()
                          .skucode(inventory.getSkucode())
                          .isInStock(inventory.getQuantity()>0)
                          .build()
              ).toList();

    }


}
