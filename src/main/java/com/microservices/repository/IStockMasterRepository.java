package com.microservices.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.StockMasterEntity;
@Repository
public interface IStockMasterRepository extends JpaRepository<StockMasterEntity, Long> {
	 List<StockMasterEntity> findByStockName(String stockName);
}
