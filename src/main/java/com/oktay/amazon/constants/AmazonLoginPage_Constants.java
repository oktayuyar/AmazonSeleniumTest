package com.oktay.amazon.constants;

import org.openqa.selenium.By;

/**
 * @author oktay
 *
 */
public interface AmazonLoginPage_Constants extends General_Constants{
	
	public By emailTextField = By.id("ap_email");
	public By passwordTextField = By.id("ap_password");
	public By continueButton = By.id("continue");
	public By signInButton = By.id("signInSubmit");
	public String homePageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
}