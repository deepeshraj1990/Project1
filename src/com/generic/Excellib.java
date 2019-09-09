package com.generic;



import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excellib {
	public static String getExceldata(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row rw=sh.getRow(rownum);
		String data=rw.getCell(colnum).getStringCellValue();
		return data;
		}
	public int getRowcount(String sheetname) throws Exception{
		FileInputStream fis=new FileInputStream(constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		int rowcount=sh.getLastRowNum();
		return rowcount;
	}
	public void setexceldata(String sheetname,int rownum,int colnum,String data) throws Exception{
		FileInputStream fis=new FileInputStream(constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cel =row.createCell(colnum);
		cel.setCellType(CellType.STRING);
		FileOutputStream fos=new FileOutputStream(constants.filepath);
		cel.setCellValue(data);
		wb.write(fos);
		wb.close();
	
	}
}
