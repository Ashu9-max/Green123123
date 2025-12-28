package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Country {

	WebDriver driver;
	
	public Country(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectcountry() {
		Select sc2 = new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
		sc2.selectByValue("Australia");
		
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}
	
	public String getsmessage() {
	
		WebElement wb = driver.findElement(By.xpath("//span[contains(text(),'Thank you, your order has been placed successfully')]"));
		return wb.getText();
	}
	
	public Boolean validatemessage() {
		 
		return getsmessage().contains("Thank you, your order has been placed successfully");
	}
	
}
