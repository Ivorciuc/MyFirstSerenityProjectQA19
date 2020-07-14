package com.fasttrackit.steps;

import com.fasttrackit.pages.ForgotPassPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ForgotPassSteps extends LoginSteps{

    private LoginPage loginPage;
    private ForgotPassPage forgotPassPage;
    private HomePage homePage;
    private MyDashboardPage myDashboardPage;



    @Step
    public void forgotPassStep(String email){
        navigateToLoginPage();
        loginPage.forgotPassButton();
        Assert.assertTrue(forgotPassPage.isOnForgotPassPage());
        forgotPassPage.setEmailLink(email);
        forgotPassPage.setSubmitButton();
        Assert.assertTrue(forgotPassPage.isOnSuccessMsg());
    }

    @Step
    public void fromForgotPassToLogin(){
        navigateToLoginPage();
        loginPage.forgotPassButton();
        Assert.assertTrue(forgotPassPage.isOnForgotPassPage());
        forgotPassPage.setBackToLoginButton();
        verifyNotLoggedIn();
    }

}
