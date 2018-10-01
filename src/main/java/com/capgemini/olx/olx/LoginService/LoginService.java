package com.capgemini.olx.olx.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.olx.olx.LoginRepository.LoginRepository;
import com.capgemini.olx.olx.loginpojo.LoginPojo;

@Service
public class LoginService {
	
	@Autowired
	public LoginRepository loginrepository;

	public LoginPojo findByPhoneNo(String phoneNo) {
		// TODO Auto-generated method stub
		return loginrepository.findByPhoneNo(phoneNo) ;
	}

	public LoginPojo findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return loginrepository.findByEmailId(emailId);
	}
	

}
