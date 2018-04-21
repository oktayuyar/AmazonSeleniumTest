package com.oktay.amazon.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.*;

import java.awt.Desktop.Action;

import com.oktay.amazon.constants.AmazonHomePage_Constants;
import com.oktay.amazon.utils.BasePageUtil;

/**
 * @author oktay
 *
 */
public class AmazonHomePage extends BasePageUtil implements AmazonHomePage_Constants {

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	public AmazonLoginPage callLoginPage() {

		assertThat(getTitle()).isEqualTo(homePageTitle);
		clickElement(loginPage);
		assertThat(getTitle()).isEqualTo(loginPageTitle);
		return new AmazonLoginPage(driver);
	}

	public AmazonHomePage searchProduct() {

		setText(productSearchTextBox, product);
		find(productSearchTextBox).sendKeys(Keys.ENTER);
		assertThat(getTitle()).isEqualTo(searchResult);
		clickElement(nextPageButton);
		controlSearchPage(secondPage);
		clickElement(selectedProduct);
		clickElement(selectedProduct2);
		assertThat(getTitle()).containsSequence(selectedProductPage);
		return this;
	}

	public AmazonHomePage addToListProduct() {

		clickElement(addToListButton);
		assertThat(getText(addToListPopupTitle)).isEqualTo("Add to List");
		waitAndClickElement(continueShoppingButton);
		return this;
	}

}
