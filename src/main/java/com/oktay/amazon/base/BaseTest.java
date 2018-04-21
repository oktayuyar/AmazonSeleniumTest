package com.oktay.amazon.base;

import com.oktay.amazon.constants.General_Constants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author oktay
 *
 */
public class BaseTest implements General_Constants {

	public WebDriver driver;

	@Before
	public void setup() {
		System.setProperty(DRIVER_NAME, DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to(URL_AMAZON);
	}

//	@After
//	public void close() {
//		driver.close();
//	}
}
