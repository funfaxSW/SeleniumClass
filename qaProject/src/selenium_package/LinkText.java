package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	ChromeDriver  browserObject = new ChromeDriver();
	browserObject.get("https://www.google.com/");
	WebElement link=browserObject.findElement(By.linkText("Gmail"));
	
	if(link.isDisplayed())
	{
		System.out.println("The link is displayed");
	}
	else
		
	{
		System.out.println("The link is not displayed");
	}
}
}
