package com.fasttrackit.steps;


import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private ProductPage productPage;

    @Step
    public void clickAddCart(){
        productPage.clickAddToCart();
    }

    @Step
    public void addKhakiBowery(){
        productPage.optionsForKhakiBowery();
    }

    @Step
    public void addParkAvenue(){
        productPage.optionsForParkAvenue();
    }

    @Step
    public void addFlatTrousers(){
        productPage.optionsForFlatTrousers();
    }

    @Step
    public void productColorWhite(){
        productPage.setPrdctColorWhite();
    }

    @Step
    public void productColorBlue(){
        productPage.setPrdctColorBlue();
    }

    @Step
    public void productColorCharcoal(){
        productPage.setPrdctColorCharcoal();
    }

    @Step
    public void productColorTaupe(){
        productPage.setPrdctColorTaupe();
    }

    @Step
    public void productColorSilver(){
        productPage.setPrdctColorSilver();
    }

    @Step
    public void productSize30(){
        productPage.setPrdctSize30();
    }

    @Step
    public void productSize29(){
        productPage.setPrdctSize29();
    }

    @Step
    public void productSize28(){
        productPage.setPrdctSize28();
    }

    @Step
    public void productSize2(){
        productPage.setPrdctSize2();
    }

}
