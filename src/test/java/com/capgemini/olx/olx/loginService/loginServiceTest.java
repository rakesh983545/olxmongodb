package com.capgemini.olx.olx.loginService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import com.capgemini.olx.olx.LoginRepository.LoginRepository;
import com.capgemini.olx.olx.LoginService.LoginService;
import com.capgemini.olx.olx.loginpojo.LoginPojo;

//import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class loginServiceTest {
	@Mock
	LoginRepository loginrepository;
	
	@InjectMocks
	LoginService loginservice;
	
	@Test
	public void ByEmail1()
	{
		LoginPojo loginpojo=new LoginPojo();
		loginpojo.setEmailId("tamu@gmail.com");
		
		Mockito.when(loginrepository.findByEmailId("tamu@gmail.com")).thenReturn(loginpojo);
		assertEquals(loginservice.findByEmailId("tamu@gmail.com").getEmailId(),"tamu@gmail.com");
	}
	
	public void ByPhone1()
	{
		LoginPojo loginpojo2=new LoginPojo();
		loginpojo2.setPhoneNo("9845");
		
		Mockito.when(loginrepository.findByPhoneNo("9845")).thenReturn(loginpojo2);
		assertEquals(loginservice.findByPhoneNo("9845").getPhoneNo(),"9845");
	}
	
	

}
