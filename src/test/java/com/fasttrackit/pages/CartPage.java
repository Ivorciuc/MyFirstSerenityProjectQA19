package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = "#shopping-cart-table td:nth-child(6) a")
    private WebElementFacade removeFromCartButton;

    @FindBy(css = ".page-title h1")
    private WebElementFacade emptyCartMsg;

    @FindBy(css = ".success-msg span")
    private  WebElementFacade successMsg;

    @FindBy(css = "#shopping-cart-totals-table + ul li button")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = "tr[class='first odd'] .product-cart-total .price")
    private WebElementFacade khakiBowePrice;

    @FindBy(css = ".even .product-cart-total .price")
    private WebElementFacade parkAvenuePrice;

    @FindBy(css = "tr[class='last odd'] .product-cart-total .price")
    private WebElementFacade flatFrontPrice;

    @FindBy(css = "button[title='Empty Cart']")
    private WebElementFacade emptyCartButton;

    @FindBy(css = "#shopping-cart-totals-table .a-right strong > .price")
    private WebElementFacade totalprice;



    public void clickRemoveFromCart(){
        clickOn(removeFromCartButton);
    }

    public Boolean checkEmptyCartMsg(){
        return emptyCartMsg.containsText("SHOPPING CART IS EMPTY");
    }

    public Boolean checkSuccessMsgCart(String text){
        return successMsg.containsOnlyText(text);
    }

    public void clickProceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public String setKhakiBowePrice(){
        return khakiBowePrice.getTextContent();
    }

    public String setParkAvenuePrice(){
        return parkAvenuePrice.getTextContent();
    }

    public String setFlatFrontPrice(){
        return flatFrontPrice.getTextContent();
    }

    public void clickEmptyCart(){
        clickOn(emptyCartButton);
    }

    public WebElementFacade setTotalprice(int number){
        return totalprice;
    }











}
