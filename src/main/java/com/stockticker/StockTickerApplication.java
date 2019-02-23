package com.stockticker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.stockticker.*")
public class StockTickerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockTickerApplication.class, args);
	}

}
