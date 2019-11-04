package com.microservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.UserMasterEntity;
@Repository
public interface IUserMasterRepository extends JpaRepository<UserMasterEntity, Long> {

}
