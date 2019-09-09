package com.pageobject.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

@FindBy(xpath = "//span[text()='Sign Up Now']")
private WebElement signup_btn;
@FindBy(xpath="//a[@title='Order Tracking']")
private WebElement order_tracking_lnk;
@FindBy(id="shopByDepartmentLabelText")
private WebElement shopdepartment_option;
public WebElement getSignup_btn() {
	return signup_btn;
}
public WebElement getOrder_tracking_lnk() {
	return order_tracking_lnk;
}
public WebElement getShopdepartment_option() {
	return shopdepartment_option;
}











}
