package com.oktay.amazon.constants;

import org.openqa.selenium.By;

/**
 * @author oktay
 *
 */
public interface AmazonHomePage_Constants extends General_Constants{
	
	public String homePageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	public String loginPageTitle = "Amazon Sign In";
	public String product = "samsung";
	public String searchResult = "Amazon.com: samsung";
	public String secondPage = "2";
	public String selectedProductPage = "Amazon.com: Official Galaxy S8/S8+ In-Ear Headphones";
	
    public By loginPage = By.id("nav-link-accountList");
    public By productSearchTextBox = By.id("twotabsearchtextbox");
    public By nextPageButton = By.id("pagnNextString");
    public By productList = By.cssSelector("[id$=result_]");
    public By selectedProduct = By.id("result_18");
    public By selectedProduct2 = By.xpath("//*[text()='Official Galaxy S8/S8+ In-Ear Headphones [EO-IG955BSEGWW], Fone-Stuff – Tuned by AKG, Remote + Mic Hands-free Earphones – Titanium Grey  (No Retail Packaging)']");
    public By addToListButton = By.id("add-to-wishlist-button-submit");
    public By addToListPopupTitle = By.id("a-popover-header-7");
    public By continueShoppingButton = By.id("WLHUC_continue");
}
