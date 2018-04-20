package com.oktay.amazon.page;

import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.*;

import com.oktay.amazon.constants.AmazonHomePage_Constants;
import com.oktay.amazon.utils.BasePageUtil;

/**
 * @author oktay
 *
 */
public class AmazonHomePage extends BasePageUtil implements AmazonHomePage_Constants{

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}
	
    public AmazonLoginPage callLoginPage() {
    		assertThat(getTitle()).isEqualTo(homePageTitle);
        clickElement(loginPage);
        assertThat(getTitle()).isEqualTo(loginPageTitle);
        return new AmazonLoginPage(driver);
    }

}
