package com.fasttrackit.features;

import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.steps.MyDashboardSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.yecht.Data;

@RunWith(SerenityRunner.class)
public class MyDashBoardTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private MyDashboardSteps myDashboardSteps;

    private String email = "aadriaan2@yahoo.com";
    private String pass = "123456";
    private String newPass = "123456789";
    private String userName = "Adrian Adriann";

    @Test
    public void changePassTest(){
        myDashboardSteps.changePass(userName, email, pass, newPass );
    }


}
