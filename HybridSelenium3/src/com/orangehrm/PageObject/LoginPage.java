package com.orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement us;
	@FindBy(name="password")
	private WebElement ps;
	@FindBy(xpath ="//button[.=' Login ']")
	private WebElement lg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return us;
	}
	public WebElement password()
	{
		return ps;
	}
	public WebElement loginbutton()
	{
		return lg;
	}
}
