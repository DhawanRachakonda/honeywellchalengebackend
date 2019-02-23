package com.stockticker.documents;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class Stock {

	@Id
	private Integer id;
	@JsonProperty("stockName")
	private String stockName;
	@JsonProperty("stockSymbol")
	private String stockSymbol;
	@JsonProperty("stockHistory")
	private List<StockHistory> stockHistory;
	@JsonProperty("currentPrice")
	private BigDecimal currentPrice;
	@JsonProperty("isUpward")
	private boolean isUpward;
	@JsonProperty("openPrice")
	private BigDecimal openPrice;
	
	public Stock(@JsonProperty("stockName") String stockName, @JsonProperty("stockSymbol") String stockSymbol,
			@JsonProperty("currentPrice") BigDecimal currentPrice, @JsonProperty("isUpdard") boolean isUpdard,
			@JsonProperty("openPrice") BigDecimal openPrice, @JsonProperty("stockHistory") List<StockHistory> stockHistory) {
		this.stockName = stockName;
		this.stockSymbol = stockSymbol;
		this.currentPrice = currentPrice;
		this.isUpward = isUpdard;
		this.openPrice = openPrice;
		this.stockHistory = stockHistory;
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public List<StockHistory> getStockHistory() {
		return stockHistory;
	}
	public void setStockHistory(List<StockHistory> stockHistory) {
		this.stockHistory = stockHistory;
	}
	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}
	public boolean isUpward() {
		return isUpward;
	}
	public void setUpward(boolean isUpward) {
		this.isUpward = isUpward;
	}
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockName=" + stockName + ", stockSymbol=" + stockSymbol + ", stockHistory="
				+ stockHistory + ", currentPrice=" + currentPrice + ", isUpward=" + isUpward + ", openPrice="
				+ openPrice + "]";
	}
	
}
