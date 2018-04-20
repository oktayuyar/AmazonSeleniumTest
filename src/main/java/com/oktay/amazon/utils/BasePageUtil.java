package com.oktay.amazon.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickElement(By by) {
		find(by).click();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void submit(By by) {
		driver.findElement(by).submit();
	}

	public String getText(By by) {
		return driver.findElement(by).getText();
	}

	public void setText(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public WebElement find(By by) {
		WebElement element = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return element;
	}

	public void sleep(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}