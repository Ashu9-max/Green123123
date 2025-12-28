package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage1;
import pageObjects.Country;
import pageObjects.Placeorder;
import testComponent.BaseTest1;

public class Standalone1 extends BaseTest1 {

	
	@Test
	public void testlaunch() {
		cp1.selectitems();
		Placeorder pc = new Placeorder(driver);
		pc.clickPlaceOrder();
		Country cc = new Country(driver);
		cc.selectcountry();
		Assert.assertTrue(cc.validatemessage(), "Thank you, your order has not been placed successfully");
		System.out.println("Order placed successfully");
	}
	
}
