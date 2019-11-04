/*package com.microservices.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserStokIdEntity implements java.io.Serializable{
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	@ManyToOne(cascade = CascadeType.ALL)
	private StockMasterEntity stockMasterEntity;
	@ManyToOne(cascade = CascadeType.ALL)
	private UserMasterEntity userMasterEntity;
	
	
	public StockMasterEntity getStockMasterEntity() {
		return stockMasterEntity;
	}
	public void setStockMasterEntity(StockMasterEntity stockMasterEntity) {
		this.stockMasterEntity = stockMasterEntity;
	}
	
	public UserMasterEntity getUserMasterEntity() {
		return userMasterEntity;
	}
	public void setUserMasterEntity(UserMasterEntity userMasterEntity) {
		this.userMasterEntity = userMasterEntity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stockMasterEntity == null) ? 0 : stockMasterEntity.hashCode());
		result = prime * result + ((userMasterEntity == null) ? 0 : userMasterEntity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserStokIdEntity other = (UserStokIdEntity) obj;
		if (stockMasterEntity == null) {
			if (other.stockMasterEntity != null)
				return false;
		} else if (!stockMasterEntity.equals(other.stockMasterEntity))
			return false;
		if (userMasterEntity == null) {
			if (other.userMasterEntity != null)
				return false;
		} else if (!userMasterEntity.equals(other.userMasterEntity))
			return false;
		return true;
	}
	
	

}
*/