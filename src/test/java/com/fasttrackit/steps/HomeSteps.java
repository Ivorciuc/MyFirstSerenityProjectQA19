package com.fasttrackit.steps;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.ProductPage;

public class HomeSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private ProductPage productPage;

    public void goToHomePage(){
        homePage.navigateToHomePage();
    }

    public void clickAccount(){
        homePage.clickAccount();
    }

    public void clickMyAccount(){
        homePage.clickMyAccountOption();
    }

}
