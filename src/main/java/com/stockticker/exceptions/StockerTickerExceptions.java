package com.stockticker.exceptions;

public class StockerTickerExceptions {

	private static class MessageConstants {
		static final String MethodNotImplemented = "Method Not Implemented";
	}
	
	public static class MethodNotImplemented extends RuntimeException {

		
		private final String message= MessageConstants.MethodNotImplemented; 
		private static final MethodNotImplemented INSTANCE = new MethodNotImplemented();
		
		@Override
		public String getMessage() {
			return message;
		}

		public static MethodNotImplemented returnInstance() {
			return INSTANCE;
		}
	}
}
