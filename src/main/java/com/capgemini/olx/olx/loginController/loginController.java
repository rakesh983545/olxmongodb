package com.capgemini.olx.olx.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.olx.olx.LoginService.LoginService;
import com.capgemini.olx.olx.loginpojo.LoginPojo;

@RestController
public class loginController {
	
	@Autowired
 	public LoginService loginservice;
	@RequestMapping(value = "/phone/{phoneNo}", method = RequestMethod.GET)
	  public 	LoginPojo getPhoneNo(@PathVariable("phoneNo") String phoneNo) {
	    return loginservice.findByPhoneNo(phoneNo);
	  }
	@RequestMapping(value = "/email/{emailId}", method = RequestMethod.GET)
	  public  LoginPojo getEmailId(@PathVariable("emailId") String emailId) {
	    return loginservice.findByEmailId(emailId);
	}

}
