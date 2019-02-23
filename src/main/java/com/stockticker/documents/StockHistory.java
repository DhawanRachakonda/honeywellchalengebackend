package com.stockticker.documents;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockHistory {

	private LocalDateTime time;
	private BigDecimal pricedAt;
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public BigDecimal getPricedAt() {
		return pricedAt;
	}
	public void setPricedAt(BigDecimal pricedAt) {
		this.pricedAt = pricedAt;
	}
	@Override
	public String toString() {
		return "StockHistory [time=" + time + ", pricedAt=" + pricedAt + "]";
	}
	
}
