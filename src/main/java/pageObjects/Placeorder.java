package pageObjects;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Placeorder {

	WebDriver driver;
	
	public Placeorder(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void clickPlaceOrder() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
}
