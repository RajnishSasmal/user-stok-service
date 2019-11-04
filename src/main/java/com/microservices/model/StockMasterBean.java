package com.microservices.model;

import javax.persistence.Column;

public class StockMasterBean {
	
		private Long stockId;
		private String stockName;
		private String stockPrice;
		private String currency;
		private int port;
		
		private String errorCode;
		private String errorMessage;
		
		
		public StockMasterBean(){
			
		}
		
		public StockMasterBean( String stockName, String stockPrice, String currency, int port) {
			super();

			this.stockName = stockName;
			this.stockPrice = stockPrice;
			this.currency = currency;
			this.port = port;
		}
		
		
		public StockMasterBean(String errorCode,String errorMessage,int port) {
			super();

			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
			this.port = port;
		}
		
		public Long getStockId() {
			return stockId;
		}
		public void setStockId(Long stockId) {
			this.stockId = stockId;
		}
		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public String getStockPrice() {
			return stockPrice;
		}
		public void setStockPrice(String stockPrice) {
			this.stockPrice = stockPrice;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		
}
