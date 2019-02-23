package com.stockticker.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockticker.documents.Stock;
import com.stockticker.services.StockTickerServices;

@RestController
@RequestMapping("/stockticker")
@CrossOrigin(origins = "*")
public class StockTickerController {

	private final StockTickerServices stockTickerServices;
	
	public StockTickerController(StockTickerServices stockTickerServices) {
		this.stockTickerServices = stockTickerServices;
	}
	
	@PostMapping()
	public Object addStock(@RequestBody Stock stock) {
		return this.stockTickerServices.addStock(stock);
	}
}
