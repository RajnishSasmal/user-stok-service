package com.microservices.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.microservices.entity.StockMasterEntity;
//import com.microservices.entity.UserMasterEntity;
//import com.microservices.entity.UserStockDetailsEntity;
import com.microservices.model.UserStockModel;

@Repository
@Transactional
public class UserAndStockRepository {
	@Autowired
	EntityManager em;
	
/*	public UserStockModel saveUserAndStockRepository(final StockMasterEntity stockMasterEntity, final UserMasterEntity userMasterEntity, final Integer numberOfStock){
		
		UserStockDetailsEntity userStockDetailsEntity = new UserStockDetailsEntity();
		userStockDetailsEntity.setUserMasterEntity(userMasterEntity);
		userStockDetailsEntity.setStockMasterEntity(stockMasterEntity);
		userStockDetailsEntity.setNumberOfStcok(numberOfStock);
		em.persist(userStockDetailsEntity);
		return getUserStockDetailsEntityTOUserStockModelConversion(userStockDetailsEntity);
		
	}
	
	public UserStockModel findByUserIdAndStockId(final Long userId,final Long stockId){
		UserStockModel userStockModel = new UserStockModel();
		
		Query q = em.createNativeQuery("SELECT u t_user_stock_details u WHERE u.user_id = :user_id && u.stock_id = :stock_id");
		q.setParameter("user_id", userId);
		q.setParameter("stock_id", stockId);
		List<UserStockDetailsEntity> userStockDetailsEntity = q.getResultList();
		if(null!=userStockDetailsEntity && userStockDetailsEntity.size()>0)
			userStockModel.setNumberOfStcok(userStockDetailsEntity.get(0).getNumberOfStcok());
		return userStockModel;
	}
	
	
	
	private UserStockModel getUserStockDetailsEntityTOUserStockModelConversion(final UserStockDetailsEntity userStockDetailsEntity ){
		UserStockModel userStockModel = new UserStockModel();
		userStockModel.setName(userStockDetailsEntity.getUserMasterEntity().getFirstName()+ " "+ userStockDetailsEntity.getUserMasterEntity().getLastName());
		userStockModel.setStockName(userStockDetailsEntity.getStockMasterEntity().getStockName());
		userStockModel.setNumberOfStcok(userStockDetailsEntity.getNumberOfStcok());
		userStockModel.setStockPrice(userStockDetailsEntity.getStockMasterEntity().getStockPrice());
		userStockModel.setTotalStockPrice(Integer.parseInt(userStockDetailsEntity.getStockMasterEntity().getStockPrice())*userStockDetailsEntity.getNumberOfStcok());
		return userStockModel;
	}*/
	
	
	
}
