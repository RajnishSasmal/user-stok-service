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
@Table(name = "t_user_master")
public class UserMasterEntity implements java.io.Serializable{
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
	private Long userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "creation_time")
	private Timestamp creationTime;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updation_time")
	private Timestamp updationTime;
  /*  @OneToMany(fetch = FetchType.LAZY,mappedBy = "primaryKey.userMasterEntity",
            cascade = CascadeType.ALL)
	private Set<UserStockDetailsEntity> userStockDetailsEntityList = new HashSet<UserStockDetailsEntity>();*/
	
	public UserMasterEntity() {
    }

    public UserMasterEntity(String firstName, String lastName,String createdBy,Timestamp creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdBy = createdBy;
        this.createdBy = createdBy;
    }
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	/*public Set<UserStockDetailsEntity> getUserStockDetailsEntityList() {
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
		return "UserMaster [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", createdBy="
				+ createdBy + ", creationTime=" + creationTime + ", updatedBy=" + updatedBy + ", updationTime="
				+ updationTime + "]";
	}
	
	
}
