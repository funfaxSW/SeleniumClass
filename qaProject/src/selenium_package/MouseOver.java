package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://www.amazon.com/");
		WebElement mouse= browserObject.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions mo  = new Actions(browserObject);
		mo.moveToElement(mouse).build().perform();
	}

}
