package com.stockticker.documents;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UserPurchasedStocks extends UserStocks {

	private LocalDateTime boughtAt;
	private BigDecimal purchasePrice;
	protected LocalDateTime getBoughtAt() {
		return boughtAt;
	}
	protected void setBoughtAt(LocalDateTime boughtAt) {
		this.boughtAt = boughtAt;
	}
	protected BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	protected void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	@Override
	public String toString() {
		return "UserPurchasedStocks [boughtAt=" + boughtAt + ", purchasePrice=" + purchasePrice + "]";
	}
}
