package com.fasttrackit.steps;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.junit.Assert;
import org.yecht.Data;

public class CartSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private ProductPage productPage;


    @Step
    public void addToCart(String text){
        homePage.open();
        homePage.clickChelseaTeePrdct();
        productPage.setPrdctColorBlack();
        productPage.setPrdctSizeSS();
        productPage.clickAddToCart();
        Assert.assertTrue(cartPage.checkSuccessMsgCart(text));
    }

    @Step
    public void removeFromCart(String text, String number){
        homePage.open();
        homePage.clickChelseaTeePrdct();
        productPage.setPrdctColorBlack();
        productPage.setPrdctSizeSS();
        productPage.typePrdctQuantity("1");
        productPage.clickAddToCart();
        Assert.assertTrue(cartPage.checkSuccessMsgCart(text));
        cartPage.clickRemoveFromCart();
        Assert.assertTrue(cartPage.checkEmptyCartMsg());
    }

    @Step
    public void checkSuccessMsgCart(String text){
        cartPage.checkSuccessMsgCart(text);
    }

    @Step
    public void proceedToCheckout(){
        cartPage.clickProceedToCheckoutButton();
    }

    @Step
    public void deleteAllProductsFromCart(){
        cartPage.clickEmptyCart();
    }


    @Step
    public void cartEmptyError(){
        try{
            homePage.clickViewShoppCart();
            deleteAllProductsFromCart();
            cartPage.checkEmptyCartMsg();
        } catch ( ElementShouldBeEnabledException error ) {
            homePage.navigateToHomePage();
        }
    }


    @Step
    public String sumOfProducts(){
        String  prdct1 = cartPage.setKhakiBowePrice();
        String  prdct2 = cartPage.setParkAvenuePrice();
        String  prdct3 = cartPage.setFlatFrontPrice();
        String sum = prdct1 + prdct2 + prdct3;
        return sum;

    }




}
