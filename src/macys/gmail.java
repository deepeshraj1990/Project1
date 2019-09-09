package macys;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Excellib;

public class gmail {
	Excellib elib;
@Test
public void gmail() throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin?sacu=1#identifier");
	//String data=elib.getExceldata();
	//System.out.println(data);
	
	
}
}
