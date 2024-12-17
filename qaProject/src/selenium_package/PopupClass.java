package selenium_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://omayo.blogspot.com/");
		
		String pw= browserObject.getWindowHandle();
		
		browserObject.findElement(By.linkText("Open a popup window")).click();
		
		Set<String>windows = browserObject.getWindowHandles();
		
		for(String win: windows)
		{
			browserObject.switchTo().window(win);
			
			if(browserObject.getTitle().equals("New Window"))
			{
				browserObject.manage().window().maximize();
				Thread.sleep(5000);
				browserObject.close();
			}
		}
	}

}
