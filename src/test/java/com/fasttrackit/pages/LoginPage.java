package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade userEmailField;

    @FindBy(id = "pass")
    private WebElementFacade userPasswordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = "a[class='f-left']")
    private WebElementFacade forgotPassLink;




    public void setUserEmailField(String email){
        typeInto(userEmailField, email);
    }

    public boolean isOnLoginPage(){
        return userEmailField.isDisplayed();
    }

    public void setUserPasswordField(String pass){
        typeInto(userPasswordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void forgotPassButton(){
        clickOn(forgotPassLink);
    }



}
