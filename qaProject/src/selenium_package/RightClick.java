package selenium_package;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement right= browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions rc= new Actions(browserObject);
		rc.contextClick(right).build().perform();
	}

}
