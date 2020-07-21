package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.yecht.Data;

public class MyDashboardSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private MyDashboardPage myDashboardPage;



    @Step
    public void changePass(String pass, String newPass) {
        myDashboardPage.setAccountInformationLink();
        myDashboardPage.isOnEditAccount();
        myDashboardPage.setCurrentPass(pass);
        myDashboardPage.setChangePassButton();
        myDashboardPage.setNewPass(newPass);
        myDashboardPage.setConfirmNewPass(newPass);
        myDashboardPage.setConfirmNewPassButton();
        myDashboardPage.setPassChangedMsg();

    }

    @Step
    public void changePassBackAsItWas(String pass, String newPass){
            myDashboardPage.setAccountInformationLink();
            myDashboardPage.isOnEditAccount();
            myDashboardPage.setCurrentPass(newPass);
            myDashboardPage.setChangePassButton();
            myDashboardPage.setNewPass(pass);
            myDashboardPage.setConfirmNewPass(pass);
            myDashboardPage.setConfirmNewPassButton();
            myDashboardPage.setPassChangedMsg();
        }

    @Step
    public void checkMyOrders(String text){
        myDashboardPage.openMyOrders();
        myDashboardPage.checkLastOrder();
        myDashboardPage.checkOrderPrdctName(text);
    }

    @Step
    public void checkMyWishlist(String text){
        myDashboardPage.checkMyWishList(text);
    }
}


