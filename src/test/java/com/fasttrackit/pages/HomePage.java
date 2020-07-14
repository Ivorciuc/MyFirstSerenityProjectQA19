package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    public void clickAccount(){
        clickOn(accountLink);
    }

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    public void clickLogin(){
        clickOn(loginLink);
    }

    @FindBy(css = "a[title='Log Out']")
    private WebElementFacade logoutLink;

    public void clickLogOut(){
        clickOn(logoutLink);
    }

    @FindBy(css = ".product-name a[title='Linen Blazer']")
    private WebElementFacade linenBlazerPrdct;

    public void clickLinenBlazerPrdct(){
        clickOn(linenBlazerPrdct);
    }

    public void hoverOver(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(loginLink).perform();

    }







}
