package macys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.constants;

public class macys {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1#identifier");
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(constants.filepath) );
		  XSSFSheet spreadsheet = workbook.getSheetAt(0);
		System.out.println("navigated to sheet");
		XSSFRow rw=spreadsheet.getRow(0);
		System.out.println("navigated to row");
		XSSFCell cel=rw.getCell(0);
		System.out.println("navigated to cell");
		String data =cel.getStringCellValue();
		System.out.println("navigated to value");
		//System.out.println(data);
		//return data;
		System.out.println("navigated to value");
		System.out.println(data);
	}
	
}
