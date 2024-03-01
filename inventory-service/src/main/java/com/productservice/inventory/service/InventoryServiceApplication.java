package com.productservice.inventory.service;

import com.productservice.inventory.service.model.Inventory;
import com.productservice.inventory.service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	//Loads the data once the application starts(to insert the data into the database)
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args ->{
			Inventory inventory=new Inventory();
			inventory.setSkucode("Iphone_13");
			inventory.setQuantity(100);


			Inventory inventory1=new Inventory();
			inventory1.setSkucode("Iphone_13_red");
			inventory1.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};

	}


}
