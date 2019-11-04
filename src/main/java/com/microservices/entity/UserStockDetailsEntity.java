/*package com.microservices.entity;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_user_stock_details")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.userMasterEntity",
        joinColumns = @JoinColumn(name = "user_id")),
    @AssociationOverride(name = "primaryKey.stockMasterEntity",
        joinColumns = @JoinColumn(name = "stock_id")) })

public class UserStockDetailsEntity implements java.io.Serializable{
	
	  *//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	// composite-id key
    private UserStokIdEntity primaryKey = new UserStokIdEntity();
    @Column(name = "no_of_stcok")
    private Integer numberOfStcok;

    @EmbeddedId
	public UserStokIdEntity getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(UserStokIdEntity primaryKey) {
		this.primaryKey = primaryKey;
	}
    
    @Transient
    public UserMasterEntity getUserMasterEntity(){
    	return getPrimaryKey().getUserMasterEntity();
    }
    
    public void setUserMasterEntity(UserMasterEntity userMasterEntity) {
        getPrimaryKey().setUserMasterEntity(userMasterEntity);
    }
    
    @Transient
    public StockMasterEntity getStockMasterEntity(){
    	return getPrimaryKey().getStockMasterEntity();
    }
    
    public void setStockMasterEntity(StockMasterEntity stockMasterEntity) {
        getPrimaryKey().setStockMasterEntity(stockMasterEntity);
    }

	public Integer getNumberOfStcok() {
		return numberOfStcok;
	}

	public void setNumberOfStcok(Integer numberOfStcok) {
		this.numberOfStcok = numberOfStcok;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numberOfStcok == null) ? 0 : numberOfStcok.hashCode());
		result = prime * result + ((primaryKey == null) ? 0 : primaryKey.hashCode());
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
		UserStockDetailsEntity other = (UserStockDetailsEntity) obj;
		if (numberOfStcok == null) {
			if (other.numberOfStcok != null)
				return false;
		} else if (!numberOfStcok.equals(other.numberOfStcok))
			return false;
		if (primaryKey == null) {
			if (other.primaryKey != null)
				return false;
		} else if (!primaryKey.equals(other.primaryKey))
			return false;
		return true;
	}

}
*/