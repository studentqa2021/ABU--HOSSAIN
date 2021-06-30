package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	static String login(){
	     System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");

		return "name";
	}
	public static void main(String[] args) {
		login();
	}

}
