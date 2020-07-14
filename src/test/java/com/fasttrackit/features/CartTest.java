package com.fasttrackit.features;

import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class CartTest {

    @Managed(uniqueSession = false)
    private WebDriver driver;

    String email = "aadriaan2@yahoo.com";
    String pass = "123456789";

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCartTest(){
        cartSteps.addToCart(email, pass);
    }

}

