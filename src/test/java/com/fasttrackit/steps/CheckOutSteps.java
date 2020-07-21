package com.fasttrackit.steps;

import com.fasttrackit.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;

import java.util.NoSuchElementException;

public class CheckOutSteps {

    private HomePage homePage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private SearchPage searchResultsPage;
    private CheckOutPage checkOutPage;


    @Step
    public void checkout() throws InterruptedException {
        checkOutPage.setBillingInformationButton();
        try {
            checkOutPage.choosefreeShippingOption();
            checkOutPage.clickShippingButton();
        } catch ( ElementShouldBeEnabledException error ){
            checkOutPage.clickShippingButton();
        } catch ( NoSuchElementException error ){
            checkOutPage.clickShippingButton();
        }
        checkOutPage.clickPaymentButton();
        Thread.sleep(3000);
        checkOutPage.clickPlaceOrderButton();




    }
}
