package com.stockticker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.stockticker.configuration.DataAccessConfiguration;
import com.stockticker.dao.DataAccess;
import com.stockticker.documents.Stock;

@Service
public class StockTickerServices {

	@Autowired
	@Qualifier(DataAccessConfiguration.DataAccessConstants.STOCK_TICKER_BEAN)
	private DataAccess stockTickerDataAccess;
	@Autowired
	private NextSequenceServices nextSequenceServices;
	
	public Stock addStock(Stock stock) {
		stock.setId(this.nextSequenceServices.getNextSequence("stockSequence"));
		return this.stockTickerDataAccess.addStock(stock);
	}
}
