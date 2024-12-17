package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://demoqa.com/accordian/");
		browserObject.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,300)");
		browserObject.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
		
		browserObject.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();
		
		
	}

}