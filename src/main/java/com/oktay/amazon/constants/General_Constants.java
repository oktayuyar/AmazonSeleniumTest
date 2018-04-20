package com.oktay.amazon.constants;

import org.openqa.selenium.By;

/**
 * @author oktay
 *
 */
public interface General_Constants {
    
    String DRIVER_NAME = "webdriver.chrome.driver";
    String DRIVER_PATH= "./driver/chromedriver";
    String URL_AMAZON = "https://www.amazon.com";

    String NAME = "Oktay";
    String SURNAME = "Uyar" ;
    String EMAIL = "oktyuyar@gmail.com";
    String PHONE = "5382003000";
    String PASSWORD = "123" ;
    
    final By loginPage = By.id("nav-link-accountList");

}
