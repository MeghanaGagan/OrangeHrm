package com.orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbtn;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clkLogo()
	{
		return logo;
	}
	public WebElement clkLogOut()
	{
		return logoutbtn;
	}
}
