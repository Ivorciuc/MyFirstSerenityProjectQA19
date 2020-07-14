package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class MyDashboardPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeText;

    public boolean verifyLoginText(String userName){
        return welcomeText.containsOnlyText("Hello, "+userName +"!");
    }

    @FindBy(css = ".block-content ul li:nth-child(2)")
    private  WebElementFacade accountInformationLink;

    public void setAccountInformationLink(){
        clickOn(accountInformationLink);
    }

    @FindBy(css = ".page-title h1")
    private WebElementFacade editMessage;

    public boolean isOnEditAccount(){
        return  editMessage.isDisplayed();
    }

    @FindBy(css = "#current_password")
    private WebElementFacade currentPass;

    public void setCurrentPass(String pass){
        typeInto(currentPass, pass);
    }

    @FindBy(css = "#change_password")
    private WebElementFacade changePassButton;

    public void setChangePassButton(){
        clickOn(changePassButton);
    }

    @FindBy(css = "#password")
    private WebElementFacade newPass;

    public void setNewPass(String newPassString){
        typeInto(newPass, newPassString);
    }

    @FindBy(css = "#confirmation")
    private WebElementFacade confirmNewPass;

    public void setConfirmNewPass(String newPassString){
        typeInto(confirmNewPass, newPassString );
    }

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade confirmNewPassButton;

    public void setConfirmNewPassButton(){
        clickOn(confirmNewPassButton);
    }

    @FindBy(css = ".success-msg span")
    private WebElementFacade passChangedMsg;

    public Boolean setPassChangedMsg(){
        return passChangedMsg.containsOnlyText("The account information has been saved.");
    }


}
