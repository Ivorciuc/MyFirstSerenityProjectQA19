package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".logo")
    private WebElementFacade toHomePage;

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = ".skip-active a[title='My Account']")
    private WebElementFacade myAccountOption;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Log Out']")
    private WebElementFacade logoutLink;

    @FindBy(css = ".item  .product-info a[title='Chelsea Tee']")
    private WebElementFacade chelseaTeePrdct;

    @FindBy(css = "#search")
    private WebElementFacade searchBar;

    @FindBy(css = "button[title='Search']")
    private WebElementFacade searchButton;

    @FindBy(css = ".header-minicart .icon")
    private WebElementFacade cartButton;

    @FindBy(css = ".cart-link")
    private WebElementFacade viewShoppingCart;


    public void navigateToHomePage(){
        clickOn(toHomePage);
    }

    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickMyAccountOption(){
        clickOn(myAccountOption);
    }

    public void clickLogin(){
        clickOn(loginLink);
    }

    public void clickLogOut(){
        clickOn(logoutLink);
    }

    public void clickChelseaTeePrdct(){
        clickOn(chelseaTeePrdct);
    }

    public void hoverOver(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(loginLink).perform();
    }

    public void setSearchBar(String product){
        typeInto(searchBar, product);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void clickCartButton(){
        clickOn(cartButton);
    }

    public void clickViewShoppCart(){
        clickOn(cartButton);
        clickOn(viewShoppingCart);
    }









}
