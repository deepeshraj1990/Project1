package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browser {
	public static WebDriver driver;
	public static WebDriver getBrowser(){
		if(constants.Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abhas\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
		}else if(constants.Browser.equals("ie")){
			System.setProperty("Webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();
		}else if(constants.Browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		return driver;
					
		}

}
