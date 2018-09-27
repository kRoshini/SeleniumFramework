package com.VtigerCRM.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	public Properties getPropertyFileObject() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");
		Properties pObj= new Properties();
		pObj.load(fis);
		return pObj;	
	}
	public String getExcelData(String SheetName, int rowNum, int colNum) throws Throwable
	{
		FileInputStream fiis = new FileInputStream("./TestData/TestData.xlsx");
		Workbook WB= WorkbookFactory.create(fiis);
		Sheet sh=WB.getSheet(SheetName);
		Row rw=sh.getRow(rowNum);
		String data=rw.getCell(colNum).getStringCellValue();
		WB.close();
		return data;
		
	}
    
