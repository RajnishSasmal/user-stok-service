package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entity.StockMasterEntity;
import com.microservices.entity.UserMasterEntity;
import com.microservices.model.StockMasterBean;
import com.microservices.model.UserStockModel;
import com.microservices.service.UserMasterService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/rest/user-service")
public class UserServiceController {
	
	@Autowired
	private UserMasterService userMasterService;
	 @Autowired
	  private Environment environment;	 

	private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);

	@GetMapping("/Hello/{userId}")
    public String getHellowWorld(@PathVariable("userId") final Long userId) {

        return "Helleo World, Mr. " + userId ;
    }

	
	  @GetMapping("/userMaster/{userId}")
	    public UserMasterEntity getUser(@PathVariable("userId") final Long userId) throws Exception {
		  try{
			  logger.info("User Id in controller****** "+userId);
	        return userMasterService.getUserById(userId);
		  }catch(Exception ex){
	          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
			  throw new Exception(ex.getMessage());
	        }
	    }
	  
	   @PostMapping("/userMaster/createUser")
	    public UserMasterEntity createUser(@RequestBody UserMasterEntity userMasterEntity) throws Exception {
		   try{
				  logger.info("User First Name in controller****** "+ userMasterEntity.getFirstName());
				  return userMasterService.saveUser(userMasterEntity);

		   }catch(Exception ex){
		          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
				  throw new Exception(ex.getMessage());
		        }
	    }
	   

		  @GetMapping("/stockMaster/{stockId}")
		    public StockMasterEntity getStock(@PathVariable("stockId") final Long stockId) throws Exception {
			  try{
				  logger.info("stock id in controller****** "+stockId);
		        return userMasterService.getStockById(stockId);
			  }catch(Exception ex){
		          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
				  throw new Exception(ex.getMessage());
		        }
		    }
		  
		   @PostMapping("/stockMaster/createStock")
		    public StockMasterEntity createStock(@RequestBody StockMasterEntity stockMasterEntity) throws Exception {
			   try{
					  logger.info("User Stock Name in controller****** "+ stockMasterEntity.getStockName());
					  return userMasterService.saveStock(stockMasterEntity);

			   }catch(Exception ex){
			          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
					  throw new Exception(ex.getMessage());
			        }
		    }
		   
		   @PutMapping("/stockMaster/updateStock")
		    public StockMasterEntity updateStock(@RequestBody StockMasterEntity stockMasterEntity) throws Exception {
			   try{
					  logger.info("User Stock info in controller****** "+ stockMasterEntity.toString());
					  return userMasterService.updateStock(stockMasterEntity);

			   }catch(Exception ex){
			          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
					  throw new Exception(ex.getMessage());
			        }
		    }
		   
		   
		   @GetMapping("/stockByName/{stockName}")
		    public List<StockMasterBean> getStockByName(@PathVariable("stockName") final String stockName) throws Exception {
			  try{
				  logger.info("stock Name in controller****** "+stockName);
				  logger.info("{--------->}"+stockName);
		        return userMasterService.findStockByName(stockName);
			  }catch(Exception ex){
		          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
				  throw new Exception(ex.getMessage());
		        }
		    }
		   
		   
		   @SuppressWarnings("unchecked")
		@GetMapping("/stockByNameFaultTolerance/{stockName}")
		   @HystrixCommand(fallbackMethod = "faultTollerance")
		    public List<StockMasterBean> getStockByNameWhenFaultTolerance(@PathVariable("stockName") final String stockName) throws Exception {
			  try{
				  logger.info("stock Name in controller****** "+stockName);
				  logger.info("{--------->}"+stockName);
		        return (List<StockMasterBean>) new RuntimeException("Service bot avaialble");
			  }catch(Exception ex){
		          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
				  throw new Exception(ex.getMessage());
		        }
		    }
		   
		   public List<StockMasterBean> faultTollerance(final String stockName) throws Exception {
				  try{
					  
					  List<StockMasterBean>  stockMasterBeanList = new ArrayList<StockMasterBean>();
					  StockMasterBean stockMasterBean = new StockMasterBean("E","No Data available",Integer.parseInt(environment.getProperty("server.port")));
					   stockMasterBeanList.add(stockMasterBean);
					   return stockMasterBeanList;
				  }catch(Exception ex){
			          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
					  throw new Exception(ex.getMessage());
			        }
			    }
			   
		   
		    /*@PostMapping("/userStockMaster/saveUserStock/{firstName}/{lastName}/{stockName}/{stockPrice}/{currency}/{numberOfStock}")
		    public UserStockModel saveUserStock(@PathVariable("firstName") final String firstName,@PathVariable("lastName")final String lastName,
		    		@PathVariable("stockName")final String stockName,@PathVariable("stockPrice") final String stockPrice,
		    		@PathVariable("currency") final String currency, @PathVariable("numberOfStock") final Integer numberOfStock) throws Exception {
				  try{
					  
					  logger.info("User Id in controller****** "+firstName);
			        return userMasterService.saveUserStock(firstName, lastName, stockName, stockPrice,currency,numberOfStock);
				  }catch(Exception ex){
			          logger.error("Error Occurred in controller *********** "+ex.getMessage());	
					  throw new Exception(ex.getMessage());
			        }
			    }*/
		
	
}
