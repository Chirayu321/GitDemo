package kavach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c:\\Drivers\\GeckoDriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Rows :"+driver.findElements(By.cssSelector(".table-display td")).size());
	
		System.out.println("Columns :"+driver.findElements(By.cssSelector(".table-display tr")).size());
		
		List<WebElement> secondrow=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());

		
		
		
		
		
	}

}
