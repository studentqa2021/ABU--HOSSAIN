package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginExpedia {
public static void getLogin() {
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.expedia.com/");
driver.manage().window().maximize();
WebElement signbtn=driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[2]"));
signbtn.click();
}
}
/////WebElement signbtn=driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[1]"));
//signbtn.click();
