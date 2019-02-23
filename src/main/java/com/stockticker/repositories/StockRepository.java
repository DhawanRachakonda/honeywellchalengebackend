package com.stockticker.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stockticker.documents.Stock;

public interface StockRepository extends MongoRepository<Stock, Integer>{

}
