package com.fasttrackit.features;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductPage;
import com.fasttrackit.steps.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MyDashBoardTest extends BaseTest {

    @Steps
    private HomeSteps homeSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private MyDashboardSteps myDashboardSteps;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private CheckOutSteps checkOutSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CartSteps cartSteps;


    @Test
    public void changePassTest(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifyLoggedIn(Constants.USER_USERNAME);
        myDashboardSteps.changePass(Constants.USER_PASS, Constants.USER_NEWPASS );
        loginSteps.logOut();
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_NEWPASS);
        loginSteps.verifyLoggedIn(Constants.USER_USERNAME);
        myDashboardSteps.changePassBackAsItWas(Constants.USER_PASS, Constants.USER_NEWPASS);
        loginSteps.logOut();
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);

    }

    @Test
    public void checkOrder() throws InterruptedException {
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.clickOnVIP();
        searchSteps.clickOnDumboBoyfriendJeanPRDCT();
        productSteps.productColorWhite();
        productSteps.productSize29();
        productSteps.clickAddCart();
        cartSteps.checkSuccessMsgCart("DUMBO Boyfriend Jean was added to your shopping cart.");
        cartSteps.proceedToCheckout();
        checkOutSteps.checkout();
        homeSteps.goToHomePage();
        homeSteps.clickAccount();
        homeSteps.clickMyAccount();
        myDashboardSteps.checkMyOrders("DUMBO BOYFRIEND JEAN");
    }



}
