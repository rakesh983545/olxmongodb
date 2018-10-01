package com.capgemini.olx.olx.LoginRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.olx.olx.loginpojo.LoginPojo;


@Repository
public interface LoginRepository extends MongoRepository<LoginPojo, String>{
	
	LoginPojo findByPhoneNo(String phoneNo);

	LoginPojo findByEmailId(String emailId);
	
	
}
