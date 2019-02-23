package com.stockticker.documents;

public abstract class UserStocks {
	
	private Stock stock;

	protected Stock getStock() {
		return stock;
	}

	protected void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "UserStocks [stock=" + stock + "]";
	}
	
}
