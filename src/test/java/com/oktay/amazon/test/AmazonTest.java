package com.oktay.amazon.test;

import org.junit.Test;

import com.oktay.amazon.base.BaseTest;
import com.oktay.amazon.page.AmazonHomePage;

/**
 * @author oktay
 *
 */
public class AmazonTest extends BaseTest {

	@Test
	public void successLoginTest() {

		new AmazonHomePage(driver)
				.callLoginPage()
				.successfulLogin()
				.searchProduct()
				.addToListProduct();
	}

}
