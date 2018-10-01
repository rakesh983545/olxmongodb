package com.capgemini.olx.olx.loginController;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.capgemini.olx.olx.LoginService.LoginService;
import com.capgemini.olx.olx.loginpojo.LoginPojo;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class)
public class loginControllerTest 
{
	@Mock
	LoginService loginservice;
	@InjectMocks
	loginController logincontroller;
	@Test
	 public void addRegister1() 
	{
		LoginPojo loginpojo=new LoginPojo();
		loginpojo.setPhoneNo("9876543210");
		
		 Mockito.when(loginservice.findByPhoneNo("9876543210")).thenReturn(loginpojo);
		 LoginPojo reg1=logincontroller.getPhoneNo("9876543210");
			//System.out.println(product1);
			Assert.assertNotNull(reg1);
			
	 }

}
