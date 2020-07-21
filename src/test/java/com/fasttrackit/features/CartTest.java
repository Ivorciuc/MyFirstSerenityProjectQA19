package com.fasttrackit.features;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductPage;
import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.steps.ProductSteps;
import com.fasttrackit.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class CartTest extends BaseTest {

    int qty = 1;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private ProductSteps productSteps;




    @Test
    public void addToCartTest(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.addToCart("Chelsea Tee was added to your shopping cart.");
    }

    @Test
    public void removeFromCartTest(){
        cartSteps.removeFromCart( "Chelsea Tee was added to your shopping cart.","1");
    }


    @Test
    public void temaEx1Lab19(){
        searchSteps.typeInSearchBar("necklace");
        searchSteps.clickForSearch();

    }

    @Test
    public void temaEx2Lab19(){

        searchSteps.typeInSearchBar("shirts");
        searchSteps.clickForSearch();


    }

    @Test
    public void temaEx3Lab19(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.cartEmptyError();
        searchSteps.searchPants();
        searchSteps.clickOnKhakiBoweryPRDCT();
        productSteps.addKhakiBowery();
        searchSteps.searchPants();
        searchSteps.clickOnParkAvenuePRDCT();
        productSteps.addParkAvenue();
        searchSteps.searchPants();
        searchSteps.clickOnFlatFrontTrousersPRDCT();
        productSteps.addFlatTrousers();
        cartSteps.sumOfProducts();

    }
}

