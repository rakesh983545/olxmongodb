package com.capgemini.olx.olx.loginPojo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.capgemini.olx.olx.loginpojo.LoginPojo;

import junit.framework.Assert;

//@RunWith(MockitoJUnitRunner.class)
public class LoginPojoTest {
	
	@Test
	public void Test1()
	{
		LoginPojo loginpojo=new LoginPojo();
		//setters
		loginpojo.setName("4dfsfs");
		loginpojo.setAddress("Mobile");
		loginpojo.setPassword("Mobiles");
		loginpojo.setEmailId("Used Lenovo mobile...");
	
		loginpojo.setPhoneNo("8974353640");
		loginpojo.setUserId("Dhruba");
		loginpojo.setUserType("free");
		loginpojo.setActivated(true);
        //getters
        Assert.assertEquals("4dfsfs", loginpojo.getName());
        Assert.assertEquals("Mobile", loginpojo.getAddress());
        Assert.assertEquals("Mobiles", loginpojo.getPassword());
        Assert.assertEquals("Used Lenovo mobile...", loginpojo.getEmailId());
        Assert.assertEquals("8974353640", loginpojo.getPhoneNo());
        Assert.assertEquals("Dhruba", loginpojo.getUserId());
        Assert.assertEquals("free", loginpojo.getUserType());
        Assert.assertEquals(true, loginpojo.isActivated());
	}
	

}


