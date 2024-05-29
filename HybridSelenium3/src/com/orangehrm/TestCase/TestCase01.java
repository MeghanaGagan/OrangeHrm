package com.orangehrm.TestCase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.BasicTest.BaseTest;
import com.orangehrm.BasicTest.ReadExcel;

public class TestCase01 extends BaseTest
{
	@Test
	public void addEmp1() throws Exception
	{
		EW.until(ExpectedConditions.visibilityOf(hp.clkPim()));
		hp.clkPim().click();
		EW.until(ExpectedConditions.visibilityOf(hp.clkAddEmp()));
		hp.clkAddEmp().click();
		EW.until(ExpectedConditions.visibilityOf(hp.enterfn()));
		hp.enterfn().sendKeys(ReadExcel.ReadData("Sheet3", 0, 0));
		EW.until(ExpectedConditions.visibilityOf(hp.entermn()));
		hp.entermn().sendKeys(ReadExcel.ReadData("Sheet3", 0, 1));
		EW.until(ExpectedConditions.visibilityOf(hp.enterln()));
		hp.enterln().sendKeys(ReadExcel.ReadData("Sheet3", 0, 2));
		EW.until(ExpectedConditions.visibilityOf(hp.clkSave()));
		hp.clkSave().click();
		Assert.fail();
	}
}
