package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/forgotpassword/")

public class ForgotPassPage extends PageObject {

    @FindBy ( css = ".fieldset h2")
    private WebElementFacade passMessage;

    public Boolean isOnForgotPassPage(){
        return passMessage.isDisplayed();
    }

    @FindBy ( css = "#email_address")
    private WebElementFacade emailLink;

    public void setEmailLink(String email){
        typeInto(emailLink, email);
    }

    @FindBy ( css = ".buttons-set .button")
    private WebElementFacade submitButton;

    public void setSubmitButton(){
        clickOn(submitButton);
    }

    @FindBy ( css = ".success-msg span")
    private WebElementFacade successMsg;

    public Boolean isOnSuccessMsg(){
        return successMsg.isDisplayed();
    }

    @FindBy ( css = ".back-link a")
    private WebElementFacade backToLoginButton;

    public void setBackToLoginButton(){
        clickOn(backToLoginButton);
    }



}
