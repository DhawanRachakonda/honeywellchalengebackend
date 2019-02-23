package com.stockticker.dao;

import com.stockticker.documents.Stock;
import com.stockticker.exceptions.StockerTickerExceptions;

public interface DataAccess {

	public default Stock addStock(Stock stock) {
		throw StockerTickerExceptions.MethodNotImplemented.returnInstance();
	}
	
	public default Stock updateStock(Stock stock) {
		throw StockerTickerExceptions.MethodNotImplemented.returnInstance();
	}
	
	public default Stock deleteStock(Stock stock) {
		throw StockerTickerExceptions.MethodNotImplemented.returnInstance();
	}
	
}
