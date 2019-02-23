package com.stockticker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;
import com.stockticker.dao.DataAccess;
import com.stockticker.dao.StockTickerDataAccess;
import com.stockticker.dao.UserDataAccess;
import com.stockticker.repositories.StockRepository;
import com.stockticker.repositories.UserRepository;

@Configuration
public class DataAccessConfiguration {

	public static class DataAccessConstants {
		public static final String STOCK_TICKER_BEAN = "stockTickerDAO", USER_BEAN = "userDAO";
	}
	
	@Bean(DataAccessConstants.STOCK_TICKER_BEAN)
	public DataAccess buildStockerDataAccess(StockRepository stockRepository) {
		return new StockTickerDataAccess(stockRepository);
	}
	
	@Bean(DataAccessConstants.USER_BEAN)
	public DataAccess buildUserDataAccess(UserRepository userRepository) {
		return new UserDataAccess(userRepository);
	}
	
	@Configuration
	public static class SimpleMongoConfig {
	  
	    @Bean
	    public MongoClient mongo() {
	        return new MongoClient("localhost");
	    }
	 
	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        return new MongoTemplate(mongo(), "stockticker");
	    }
	}
}
