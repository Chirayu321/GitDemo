package kavach;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","c:\\Drivers\\GeckoDriver.exe"); 
		
		WebDriver driver = new FirefoxDriver();
	
	      
	// Launch website  
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");  
	    int linksPresent =driver.findElements(By.tagName("a")).size();
	    System.out.println("Total Links Present :" +linksPresent);
	    WebElement footer = driver.findElement(By.id("gf-BIG"));
	    System.out.println("Links present in footer :"  +footer.findElements(By.tagName("a")).size());
	    WebElement verticalFooters = footer.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
	    System.out.println("verticals present in 1st footer :"  +verticalFooters.findElements(By.tagName("a")).size());
	    for (int i=1;i<verticalFooters.findElements(By.tagName("a")).size();i++) {
	    	String key =Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	verticalFooters.findElements(By.tagName("a")).get(i).sendKeys(key);
	    }
	    	
	    	Set <String> abc=driver.getWindowHandles();
	    	Iterator<String> it=abc.iterator();
	    	while(it.hasNext()) {
	    		
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    		
	    	}
	    }
	    
	    
	    
	 

	}


