package com.fasttrackit.steps;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends LoginSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private ProductPage productPage;


    @Step
    public void addToCart(String email, String pass){
        login(email, pass);
        homePage.clickLinenBlazerPrdct();
        productPage.setPrdctColor();
        productPage.setPrdctSize();
        productPage.clickAddToCart();
        Assert.assertTrue(productPage.checkSuccessMsgLinenBlazer());

    }

}
