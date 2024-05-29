package com.orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath ="//span[.='PIM']")
	private WebElement pim;
	
	@FindBy(xpath ="//a[.='Add Employee']")
	private WebElement addemp;
	
	@FindBy(name ="firstName")
	private WebElement fntf;
	
	@FindBy(name ="middleName")
	private WebElement mntf;
	
	@FindBy(name ="lastName")
	private WebElement lntf;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement savebtn;
	
	@FindBy(xpath = "//span[.='Leave']")
	private WebElement leavebtn;
	
	@FindBy(xpath = "//a[.='Apply']")
	private WebElement apply;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	private WebElement leaveType;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clkPim()
	{
		return pim; 
	}
	public WebElement clkAddEmp()
	{
		return addemp;
	}
	public WebElement enterfn()
	{
		return fntf;
	}
	public WebElement entermn()
	{
		return mntf;
	}
	public WebElement enterln()
	{
		return lntf;
	}
	public WebElement clkSave()
	{
		return savebtn;
	}
}
