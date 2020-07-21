package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckOutPage extends PageObject {

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade billingInformationButton;

    @FindBy(css = "#s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingOption;

    @FindBy(css = "#checkout-step-shipping_method button")
    private WebElementFacade shippingButton;

    @FindBy(css = "#payment-buttons-container button")
    private WebElementFacade paymentButton;

    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderBtn;



    public void setBillingInformationButton(){
        clickOn(billingInformationButton);
    }

    public void choosefreeShippingOption(){
        clickOn(freeShippingOption);
    }

    public void clickShippingButton(){
        clickOn(shippingButton);
    }

    public void clickPaymentButton(){
        clickOn(paymentButton);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderBtn);
    }





}
