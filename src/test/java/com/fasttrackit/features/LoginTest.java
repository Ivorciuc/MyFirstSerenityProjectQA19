package com.fasttrackit.features;


import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;


    private String email = "aadriaan2@yahoo.com";
    private String pass = "123456789";

    @Test
    public void validLoginTest(){
        loginSteps.login(email, pass);
        loginSteps.verifyLoggedIn("Adrian Adriann");
    }

    @Test
    public void invalidEmailTest(){
        loginSteps.login("aadriaan2@yahoocom", pass);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassLoginTest(){
        loginSteps.login(email, "123123");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyPasswrodTest(){
        loginSteps.login(email,"");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailTest(){
        loginSteps.login("", pass);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailAndPasswordTest(){
        loginSteps.login("", "");
        loginSteps.verifyNotLoggedIn();
    }



}
