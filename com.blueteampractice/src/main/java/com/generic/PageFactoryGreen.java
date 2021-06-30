package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class PageFactoryGreen {
	
	
	public static void pageFactoryCoding(){
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
	 WebDriver driver=new ChromeDriver();
	driver.navigate().to(BaseConfig.getConfigValue("URL"));
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	//HighLighterGreen.addColor(driver, obj.getSigninbtn());
	MasterPageFactory obj=new MasterPageFactory(driver);
	obj.getSigninbtn().click();
	obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));
	obj.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
	obj.getFinalsigninbtn().click();
	
	
	
	}

	
}
