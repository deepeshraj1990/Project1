package macys;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generic.Browser;
import com.generic.Excellib;
import com.generic.constants;
import com.generic.webdrivercommonlib;
import com.pageobject.repo.Homepage;
import com.pageobject.repo.signuppage;

public class testscript {
	
	WebDriver driver;
	Excellib elib;
	webdrivercommonlib wlib;
	Homepage homepge;
	signuppage SignupPages;
	
	@BeforeClass
	public void bfrcls() {
		driver=Browser.getBrowser();
		driver.get(constants.url);
		homepge=PageFactory.initElements(driver, Homepage.class);
		SignupPages=PageFactory.initElements(driver, signuppage.class);
		}
	@BeforeMethod
	public void bfrmtd() {	
	System.out.println("Before method");
	}
	@Test
	public void macysapp()throws EncryptedDocumentException, IOException {
		homepge.getSignup_btn().click();
		//wlib.waitforpagetoload();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parentid=itr.next();
		String childid=itr.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		System.out.println("move to child window");
		String firstname=elib.getExceldata("Sheet1",0,0);
		String lastname=elib.getExceldata("Sheet1", 0, 1);
		String emailid=elib.getExceldata("Sheet1", 0, 2);
		System.out.println(emailid);
		String country=elib.getExceldata("Sheet1", 0, 3);
		SignupPages.first_name(firstname);
		SignupPages.last_name(lastname);
		SignupPages.email_id(emailid);
		SignupPages.select_country(country);
		SignupPages.checkbox_signup();
		SignupPages.submit_button();
		String expectedmsg=elib.getExceldata("Sheet1", 0, 4);
		SignupPages.signupmessage(expectedmsg);
		
		}
}
