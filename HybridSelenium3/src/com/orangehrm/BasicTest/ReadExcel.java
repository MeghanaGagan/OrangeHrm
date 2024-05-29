package com.orangehrm.BasicTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements ApplicationConstant{
	public static String ReadData(String sheet,int row, int cell) throws Exception
	{
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook book= WorkbookFactory.create(fis);
		Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
		String value = cel.getStringCellValue().toString();
		return value;
	}
}
