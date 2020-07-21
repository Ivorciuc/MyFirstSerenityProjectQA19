package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/forgotpassword/")

public class ForgotPassPage extends PageObject {

    @FindBy ( css = ".fieldset h2")
    private WebElementFacade passMessage;

    @FindBy ( css = "#email_address")
    private WebElementFacade emailLink;

    @FindBy ( css = ".buttons-set .button")
    private WebElementFacade submitButton;

    @FindBy ( css = ".success-msg span")
    private WebElementFacade successMsg;

    @FindBy ( css = ".back-link a")
    private WebElementFacade backToLoginButton;



    public Boolean isOnForgotPassPage(){
        return passMessage.isDisplayed();
    }

    public void setEmailLink(String email){
        typeInto(emailLink, email);
    }

    public void setSubmitButton(){
        clickOn(submitButton);
    }

    public Boolean isOnSuccessMsg(){
        return successMsg.isDisplayed();
    }

    public void setBackToLoginButton(){
        clickOn(backToLoginButton);
    }



}
