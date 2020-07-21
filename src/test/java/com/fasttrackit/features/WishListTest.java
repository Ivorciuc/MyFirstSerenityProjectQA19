package com.fasttrackit.features;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductPage;
import com.fasttrackit.pages.SearchPage;
import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.steps.MyDashboardSteps;
import com.fasttrackit.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class WishListTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private SearchPage searchPage;

    @Steps
    private ProductPage productPage;

    @Steps
    private MyDashboardSteps myDashboardSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomePage homePage;

    @Test
    public void addToWishList(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.typeInSearchBar("glasses");
        searchSteps.clickForSearch();
        searchPage.retroChicEyeGlasses();
        productPage.clickAddWishList();
        myDashboardSteps.checkMyWishlist("Retro Chic Eyeglasses has been added to your wishlist. Click");
    }



}
