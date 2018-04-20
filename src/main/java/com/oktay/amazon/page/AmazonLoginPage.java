package com.oktay.amazon.page;

import org.openqa.selenium.WebDriver;

import com.oktay.amazon.constants.AmazonLoginPage_Constants;
import com.oktay.amazon.utils.BasePageUtil;

/**
 * @author oktay
 *
 */
public class AmazonLoginPage extends BasePageUtil implements AmazonLoginPage_Constants{

	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}

	public void successfulLogin() {
		setText(emailTextField, email);
		click(continueButton);
	}


}
