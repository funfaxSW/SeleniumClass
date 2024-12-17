package selenium_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LoginClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://demo.itlearn360.com/");
		
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		browserObject.findElement(By.id("user_login")).sendKeys("Demo");
		browserObject.findElement(By.id("user_pass")).sendKeys("Test123456$");
		browserObject.findElement(By.id("wp-submit")).click();
		
		File sc= ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
		Files.copy(sc, new File("C:\\Users\\shell\\Desktop\\test\\username.jpg"));
	}

}
