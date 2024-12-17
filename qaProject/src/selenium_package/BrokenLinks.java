package selenium_package;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://demo.itlearn360.com/");
		int count =0;
		List<WebElement> link=browserObject.findElements(By.tagName("a"));
		
		for(WebElement links:link)
		{
			String url=links.getAttribute("href");
		//	System.out.println(url);
			count++;
			VerifyLink(url);
		}
		
		System.out.println(count);
	}
	
	public static void VerifyLink(String newurl) {
		
		try {
			URL link=new URL(newurl);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();
			
			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(newurl + " - " + httpURLConnection.getResponseMessage());
				} else {
				System.out.println(newurl + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				}
		}
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
