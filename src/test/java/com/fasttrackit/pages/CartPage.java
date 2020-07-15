package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = "#shopping-cart-table td:nth-child(6) a")
    private WebElementFacade removeFromCartButton;

    public void clickRemoveFromCart(){
        clickOn(removeFromCartButton);
    }

    @FindBy(css = ".page-title h1")
    private WebElementFacade emptyCartMsg;

    public Boolean checkEmptyCartMsg(){
        return emptyCartMsg.containsText("SHOPPING CART IS EMPTY");
    }

    @FindBy(css = ".success-msg span")
    private  WebElementFacade successMsg;

    public Boolean checkSuccessMsgChelseaTee(){
        return successMsg.containsOnlyText("Chelsea Tee was added to your shopping cart.");
    }



}
