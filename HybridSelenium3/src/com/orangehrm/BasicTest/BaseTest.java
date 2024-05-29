package com.orangehrm.BasicTest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.PageObject.HomePage;
import com.orangehrm.PageObject.LogOut;
import com.orangehrm.PageObject.LoginPage;

public class BaseTest implements ApplicationConstant {
	public WebDriver driver;
	public Properties pro;
	FileInputStream fis;
	LoginPage lg;
	LogOut lo;
	public HomePage hp;
	public WebDriverWait EW;

	@BeforeClass
	public void openbrowser() throws Exception
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
		pro=new Properties();
		fis=new FileInputStream(TP_path);
		pro.load(fis);
		driver.get(pro.getProperty("url"));
	}
	@BeforeMethod
	public void login()
	{
		lg=new LoginPage(driver);
		String user= pro.getProperty("usn");
		lg.username().sendKeys(user);
		String pass = pro.getProperty("psw");
		lg.password().sendKeys(pass);
		lg.loginbutton().click();
		hp=new HomePage(driver);
		EW= new WebDriverWait(driver, waittime);
	}

	@AfterMethod
	public void logout(ITestResult result) 
	{
		if(result.FAILURE==result.getStatus())
		{
			CaptureDefect.defect(driver, result.getName());
		}
		
		lo=new LogOut(driver);
		lo.clkLogo().click();
		lo.clkLogOut().click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
