package com.fasttrackit.features;

import com.fasttrackit.steps.ForgotPassSteps;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ForgotPassTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ForgotPassSteps forgotPassSteps;

    @Test
    public void forgotPassOption(){
        forgotPassSteps.forgotPassStep("aadriaan2@yahoo.com");
    }

    @Test
    public void fromForgotPassToLogin(){
        forgotPassSteps.fromForgotPassToLogin();
    }




}
