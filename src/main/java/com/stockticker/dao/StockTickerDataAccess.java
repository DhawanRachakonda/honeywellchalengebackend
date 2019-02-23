package com.stockticker.dao;

import org.springframework.stereotype.Repository;

import com.stockticker.documents.Stock;
import com.stockticker.repositories.StockRepository;

@Repository
public class StockTickerDataAccess implements DataAccess {

	private final StockRepository stockRepository;
	
	public StockTickerDataAccess(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	
	@Override
	public Stock addStock(Stock stock) {
		return this.stockRepository.save(stock);
	}
	
}
