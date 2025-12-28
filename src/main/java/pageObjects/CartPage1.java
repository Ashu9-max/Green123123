package pageObjects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage1  {

WebDriver driver;

public CartPage1 (WebDriver driver) {
	this.driver=driver;
}

public void selectitems(){
	
	List<WebElement> allproducts = driver.findElements(By.className("product"));
	
	
	for ( WebElement product : allproducts) {
		String productname = product.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(productname);
		if (productname.equalsIgnoreCase("Cauliflower")) {
			product.findElement(By.tagName("button")).click();	
			break;
		}
		
		
	}
	
	WebElement carticon = driver.findElement(By.className("cart-icon"));
    carticon.click();
	
    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
    
	}
	
	public void goto1() {
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	System.out.println("I am the best");
	System.out.println("Priyanka");
}

}



	


