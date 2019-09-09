package com.pageobject.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.generic.webdrivercommonlib;

public class signuppage extends webdrivercommonlib  {

	@FindBy(name="FIRST_NAME")
	private WebElement first_name;
	@FindBy(name="LAST_NAME")
	private WebElement last_name;
	@FindBy(name="EMAIL_ADDRESS_")
	private WebElement email_address;
	@FindBy(id="country")
	private WebElement country_drop;
	@FindBy(id="optIn")
	private WebElement checkbox_clk;
	@FindBy(id="submitBtn")
	private WebElement submit_button;
	
	@FindBy(xpath ="//h3[text()='Thanks for signing up!']")
	private WebElement successfull_msg;
	public void first_name(String firstname) {
		first_name.sendKeys(firstname);
	}
	public void last_name(String lastname) {
	last_name.sendKeys(lastname);	
	}
	public void email_id(String email) {
		email_address.sendKeys(email);	
		}
	public void select_country(String country) {
		
	Select sel=new Select(country_drop);
	sel.selectByVisibleText(country);
	}
	
	public void checkbox_signup() {
		checkbox_clk.click();
	}
	public void submit_button() {
		submit_button.click();
	}
	
	public void signupmessage(String ExpectedMsg) {
		verifytest(successfull_msg, ExpectedMsg);
		
		
		
	}
	}
	
	
	
	
	
	
	
	
	
	

