package com.oktay.amazon.utils;

import org.openqa.selenium.WebDriver;

import com.oktay.amazon.constants.General_Constants;

/**
 * @author oktay
 *
 */
public class BasePageUtil implements General_Constants {

	protected WebDriver driver;

	public BasePageUtil(WebDriver driver) {
		this.driver = driver;
	}

}
