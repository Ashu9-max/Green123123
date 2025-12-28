package testComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CartPage1;

public class BaseTest1 {

	public WebDriver driver;
	public CartPage1 cp1;
	
	public WebDriver initializeDriver1() throws IOException
	{
		
		//properties class 
		
		Properties prop1 = new Properties();	
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\Globaldata.properties");  //what user.dir does is it gives project path dynamically so that it can be run in any other system as well. SO now we are dynamically getting the path from the system where it is executed.
		prop1.load(fi);
		String browserName = prop1.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
}

	@BeforeMethod
	public void launch1() throws IOException {
		driver = initializeDriver1();
		cp1 = new CartPage1(driver);
		cp1.goto1();
	}
	
	
	//@AfterMethod
	//public void teardown1() {
		//driver.quit();
	//}
	
}