package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.yecht.Data;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class MyDashboardPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeText;

    @FindBy(css = ".block-content ul li:nth-child(2)")
    private  WebElementFacade accountInformationLink;

    @FindBy(css = ".page-title h1")
    private WebElementFacade editMessage;

    @FindBy(css = "#current_password")
    private WebElementFacade currentPass;

    @FindBy(css = "#change_password")
    private WebElementFacade changePassButton;

    @FindBy(css = "#password")
    private WebElementFacade newPass;

    @FindBy(css = "#confirmation")
    private WebElementFacade confirmNewPass;

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade confirmNewPassButton;

    @FindBy(css = ".success-msg span")
    private WebElementFacade passChangedMsg;

    @FindBy(css = "div.block-content li:nth-child(4) a")
    private WebElementFacade myOrders;

    @FindBy(css = ".first .nobr a:first-child")
    private WebElementFacade checkLastOrder;

    @FindBy(css = "td h3")
    private WebElementFacade findOrderPrdctName;

    @FindBy(css = ".current strong")
    private WebElementFacade myWishList;

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMsgWishList;


    public boolean verifyLoginText(String userName){
        return welcomeText.containsOnlyText("Hello, "+userName +"!");
    }

    public void setAccountInformationLink(){
        clickOn(accountInformationLink);
    }

    public boolean isOnEditAccount(){
        return  editMessage.isDisplayed();
    }

    public void setCurrentPass(String pass){
        typeInto(currentPass, pass);
    }

    public void setChangePassButton(){
        clickOn(changePassButton);
    }

    public void setNewPass(String newPassString){
        typeInto(newPass, newPassString);
    }


    public void setConfirmNewPass(String newPassString){
        typeInto(confirmNewPass, newPassString );
    }

    public void setConfirmNewPassButton(){
        clickOn(confirmNewPassButton);
    }

    public Boolean setPassChangedMsg(){
        return passChangedMsg.containsOnlyText("The account information has been saved.");
    }

    public void openMyOrders(){
        clickOn(myOrders);
    }

    public void checkLastOrder(){
        clickOn(checkLastOrder);
    }

    public boolean checkOrderPrdctName(String text){
       return findOrderPrdctName.containsOnlyText(text);
    }

    public void clickMyWishList(){
        clickOn(myWishList);
    }

    public boolean checkMyWishList(String text){
        return successMsgWishList.containsOnlyText(text);
    }





}
