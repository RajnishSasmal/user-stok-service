package com.microservices.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_stock_master")
public class StockMasterEntity implements java.io.Serializable{
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
	private Long stockId;
	@Column(name = "stock_name")
	private String stockName;
	@Column(name = "stock_price")
	private String stockPrice;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "creation_time")
	private Timestamp creationTime;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updation_time")
	private Timestamp updationTime;
	@Column(name = "currency")
	private String currency;
	/*@OneToMany(fetch = FetchType.LAZY,mappedBy = "primaryKey.stockMasterEntity",
            cascade = CascadeType.ALL)
	private Set<UserStockDetailsEntity> userStockDetailsEntityList = new HashSet<UserStockDetailsEntity>();
	*/
	public StockMasterEntity() {
    }

    public StockMasterEntity(String stockName, String stockPrice,String createdBy,Timestamp creationTime,String currency) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.createdBy = createdBy;
        this.createdBy = createdBy;
        this.currency = currency;
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

	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Timestamp getUpdationTime() {
		return updationTime;
	}
	public void setUpdationTime(Timestamp updationTime) {
		this.updationTime = updationTime;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

/*	public Set<UserStockDetailsEntity> getUserStockDetailsEntityList() {
		return userStockDetailsEntityList;
	}

	public void setUserStockDetailsEntityList(Set<UserStockDetailsEntity> userStockDetailsEntityList) {
		this.userStockDetailsEntityList = userStockDetailsEntityList;
	}
	
	 public void addStockDetailsEntity(UserStockDetailsEntity userStockDetailsEntity) {
	        this.userStockDetailsEntityList.add(userStockDetailsEntity);
	    }*/

	@Override
	public String toString() {
		return "StockMasterEntity [stockId=" + stockId + ", stockName=" + stockName + ", stockPrice=" + stockPrice
				+ ", createdBy=" + createdBy + ", creationTime=" + creationTime + ", updatedBy=" + updatedBy
				+ ", updationTime=" + updationTime + ", currency=" + currency + "]";
	}



	
}
