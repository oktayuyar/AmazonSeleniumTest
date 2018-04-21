package com.oktay.amazon.page;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import com.oktay.amazon.constants.AmazonLoginPage_Constants;
import com.oktay.amazon.utils.BasePageUtil;

/**
 * @author oktay
 *
 */
public class AmazonLoginPage extends BasePageUtil implements AmazonLoginPage_Constants {

	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}

	public AmazonHomePage successfulLogin() {
		setText(emailTextField, email);
		clickElement(continueButton);
		setText(passwordTextField, password);
		clickElement(signInButton);
		assertThat(getTitle()).isEqualTo(homePageTitle);
		return new AmazonHomePage(driver);
	}

}
