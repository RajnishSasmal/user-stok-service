package com.microservices.service;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.microservices.controller.UserServiceController;
import com.microservices.entity.StockMasterEntity;
import com.microservices.entity.UserMasterEntity;
import com.microservices.model.StockMasterBean;
import com.microservices.model.UserStockModel;
import com.microservices.repository.IStockMasterRepository;
import com.microservices.repository.IUserMasterRepository;
import com.microservices.repository.UserAndStockRepository;

@Service
public class UserMasterService {
	@Autowired
	 private IUserMasterRepository userMasterRepository;
	@Autowired
	 private IStockMasterRepository stockMasterRepository;
	@Autowired
	private UserAndStockRepository userAndStockRepository;
	
	 @Autowired
	  private Environment environment;
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);
	
	public UserMasterEntity  getUserById(final Long userId){
		return userMasterRepository.findById(userId).orElse(new UserMasterEntity());
		
	}
	
	public UserMasterEntity saveUser(UserMasterEntity userMasterEntity){
		if(null != userMasterEntity){
			userMasterEntity.setCreationTime(new Timestamp(System.currentTimeMillis()));
		}
		return userMasterRepository.save(userMasterEntity);
		
	}
	

	public StockMasterEntity  getStockById(final Long stockId){
		return stockMasterRepository.findById(stockId).orElse(new StockMasterEntity());
		
	}
	
	public StockMasterEntity saveStock(StockMasterEntity stockMasterEntity){
		if(null != stockMasterEntity){
			stockMasterEntity.setCreationTime(new Timestamp(System.currentTimeMillis()));
		}
		return stockMasterRepository.save(stockMasterEntity);
		
	}
	
	public StockMasterEntity updateStock(StockMasterEntity stockMasterEntity){
		
		if(null != stockMasterEntity){
			if(null!= stockMasterEntity.getStockId()){
				StockMasterEntity stockMasterEntityUpdated = stockMasterRepository.findById(stockMasterEntity.getStockId()).orElse(null);
				if(stockMasterEntityUpdated == null)
					return null;
				if(null!= stockMasterEntity.getStockName()) stockMasterEntityUpdated.setStockName(stockMasterEntity.getStockName());
				if(null!= stockMasterEntity.getStockPrice()) stockMasterEntityUpdated.setStockPrice(stockMasterEntity.getStockPrice());
				if(null!= stockMasterEntity.getCurrency()) stockMasterEntityUpdated.setCurrency(stockMasterEntity.getCurrency());
				stockMasterEntityUpdated.setUpdatedBy("Rajnish");
				stockMasterEntityUpdated.setUpdationTime(new Timestamp(System.currentTimeMillis()));
				return stockMasterRepository.save(stockMasterEntityUpdated);
			}
			
		}
		
		return null;
	}
	
/*	public UserStockModel saveUserStock(final String firstName, final String lastName,
			final String stockName, final String stockPrice, final String currency,final Integer numberOfStock){
		
		 UserMasterEntity userMasterEntity = new UserMasterEntity();
		  userMasterEntity.setFirstName(firstName);
		  userMasterEntity.setLastName(lastName);
		  userMasterEntity.setCreatedBy("Rajnish");
		  userMasterEntity.setCreationTime(new Timestamp(System.currentTimeMillis()));
		 StockMasterEntity stockMasterEntity = new StockMasterEntity();
		  stockMasterEntity.setStockName(stockName);
		  stockMasterEntity.setStockPrice(stockPrice);
		  stockMasterEntity.setCurrency(currency);
		 
		return userAndStockRepository.saveUserAndStockRepository(stockMasterEntity, userMasterEntity, numberOfStock);
	}*/
	
	public List<StockMasterBean> findStockByName(final String stockName){
		List<StockMasterEntity> stockMasterEntityList =  stockMasterRepository.findByStockName(stockName);
		List<StockMasterBean> stockMasterBeanList = null;
		
		if(stockMasterEntityList!=null && stockMasterEntityList.size()>0){
			stockMasterBeanList = new ArrayList<StockMasterBean>();
		StockMasterBean stockMasterBean = new StockMasterBean();
		logger.info("Stock Info::::**************    " + stockMasterEntityList.get(0).toString());
		stockMasterBean.setStockId(stockMasterEntityList.get(0).getStockId());
		stockMasterBean.setStockName(stockMasterEntityList.get(0).getStockName());
		stockMasterBean.setStockPrice(stockMasterEntityList.get(0).getStockPrice());
		stockMasterBean.setCurrency(stockMasterEntityList.get(0).getCurrency());
		stockMasterBean.setPort(Integer.parseInt(environment.getProperty("server.port")));
		stockMasterBeanList.add(stockMasterBean);
		
		}
		return stockMasterBeanList;
	}
}
