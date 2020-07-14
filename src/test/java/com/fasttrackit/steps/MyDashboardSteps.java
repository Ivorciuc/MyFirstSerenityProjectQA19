package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class MyDashboardSteps extends LoginSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private MyDashboardPage myDashboardPage;



    @Step
    public void changePass(String userName, String email, String pass, String newPass){
        login(email, newPass);
        verifyLoggedIn(userName);
        myDashboardPage.setAccountInformationLink();
        myDashboardPage.setCurrentPass(newPass);
        myDashboardPage.setChangePassButton();
        myDashboardPage.setNewPass(pass);
        myDashboardPage.setConfirmNewPass(pass);
        myDashboardPage.setConfirmNewPassButton();
        logOut();
        login(email, pass);
        verifyLoggedIn(userName);
        myDashboardPage.setAccountInformationLink();
        myDashboardPage.setCurrentPass(pass);
        myDashboardPage.setChangePassButton();
        myDashboardPage.setNewPass(newPass);
        myDashboardPage.setConfirmNewPass(newPass);
        myDashboardPage.setConfirmNewPassButton();
        logOut();
        login(email, newPass);


    }

}
