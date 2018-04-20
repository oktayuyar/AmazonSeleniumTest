package com.oktay.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.*;

import com.oktay.amazon.constants.General_Constants;
import com.oktay.amazon.utils.BasePageUtil;

/**
 * @author oktay
 *
 */
public class AmazonHomePage extends BasePageUtil implements General_Constants{

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}
	
    public AmazonLoginPage callLoginPage() {
        clickElement(loginPage);
        return new AmazonLoginPage(driver);
    }

}
