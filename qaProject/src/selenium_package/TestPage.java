package selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://training.qaonlinetraining.com/testPage.php");
		browserObject.manage().window().maximize();
		
		browserObject.findElement(By.name("name")).sendKeys("Shelley");
		browserObject.findElement(By.name("email")).sendKeys("Shelley@mail.com");
		browserObject.findElement(By.name("website")).sendKeys("www.shelley.com");
		browserObject.findElement(By.name("comment")).sendKeys("testing test");
		
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[9]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[8]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[10]")).click();
		
		WebElement cn=browserObject.findElement(By.name("country"));
		
		Select coun=new Select(cn);
		coun.selectByVisibleText("India");
		
		WebElement jk=browserObject.findElement(By.name("skill"));
		
		Select skills=new Select(jk);
		skills.selectByVisibleText("Database");
		skills.selectByVisibleText("Programming");
		
		
		
	
	
		
		browserObject.findElement(By.name("submit")).click();
		//browserObject.close();
		
		browserObject.findElement(By.id("alert")).click();
		Alert alert1=browserObject.switchTo().alert();
		alert1.accept();
		Thread.sleep(4000);
		browserObject.findElement(By.id("confirm")).click();
		Alert confirm1=browserObject.switchTo().alert();
		confirm1.dismiss();
		
		browserObject.findElement(By.id("prompt")).click();
		Alert prompt1=browserObject.switchTo().alert();
		prompt1.sendKeys("test");
		prompt1.accept();
		}

}
