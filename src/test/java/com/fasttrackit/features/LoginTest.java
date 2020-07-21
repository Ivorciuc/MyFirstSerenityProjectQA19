package com.fasttrackit.features;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.ForgotPassSteps;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ForgotPassSteps forgotPassSteps;


    @Test
    public void validLoginTest(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifyLoggedIn("Adrian Adriann");
    }

    @Test
    public void invalidEmailTest(){
        loginSteps.login("aadriaan2@yahoocom", Constants.USER_PASS);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassLoginTest(){
        loginSteps.login(Constants.USER_EMAIL, "123123");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyPasswrodTest(){
        loginSteps.login(Constants.USER_EMAIL,"");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailTest(){
        loginSteps.login("", Constants.USER_PASS);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailAndPasswordTest(){
        loginSteps.login("", "");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void forgotPassOption(){
        loginSteps.navigateToLoginPage();
        forgotPassSteps.forgotPassStep(Constants.USER_EMAIL);
    }

    @Test
    public void fromForgotPassToLogin(){
        loginSteps.navigateToLoginPage();
        forgotPassSteps.fromForgotPassToLogin();
        loginSteps.verifyNotLoggedIn();
    }



}
