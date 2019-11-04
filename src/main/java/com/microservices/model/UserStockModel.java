package com.microservices.model;

public class UserStockModel {
	
	private String name;
	private String stockName;
	private String currency;
	private String stockPrice;
	private Integer numberOfStcok;
	private Integer totalStockPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Integer getNumberOfStcok() {
		return numberOfStcok;
	}
	public void setNumberOfStcok(Integer numberOfStcok) {
		this.numberOfStcok = numberOfStcok;
	}
	public Integer getTotalStockPrice() {
		return totalStockPrice;
	}
	public void setTotalStockPrice(Integer totalStockPrice) {
		this.totalStockPrice = totalStockPrice;
	}
	
	@Override
	public String toString() {
		return "UserStockModel [name=" + name + ", stockName=" + stockName + ", currency=" + currency + ", stockPrice="
				+ stockPrice + ", numberOfStcok=" + numberOfStcok + ", totalStockPrice=" + totalStockPrice + "]";
	}
	

	
}
