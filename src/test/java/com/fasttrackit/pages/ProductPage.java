package com.fasttrackit.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/linen-blazer-580.html")
public class ProductPage extends PageObject {

    @FindBy(css = "a[title='Black'] .swatch-label")
    private WebElementFacade prdctColorBlack;

    @FindBy(css = "a[title='White'] .swatch-label")
    private WebElementFacade prdctColorWhite;

    @FindBy(css = "a[title='Blue'] .swatch-label")
    private WebElementFacade prdctColorBlue;

    @FindBy(css = ".swatch-label img[alt='Charcoal']")
    private WebElementFacade prdctColorCharcoal;

    @FindBy(css = "a[title='Taupe'] .swatch-label")
    private WebElementFacade prdctColorTaupe;

    @FindBy(css = "a[title='Silver'] .swatch-label")
    private WebElementFacade prdctColorSilver;

    @FindBy(css = "#swatch80 .swatch-label")
    private WebElementFacade prdctSizeSS;

    @FindBy(css = "a[title='30'] .swatch-label")
    private WebElementFacade prdctSize30;

    @FindBy(css = "a[title='29'] .swatch-label")
    private WebElementFacade prdctSize29;

    @FindBy(css = "a[title='28'] .swatch-label")
    private WebElementFacade prdctSize28;

    @FindBy(css = "a[title='2'] .swatch-label")
    private WebElementFacade prdctSize2;

    @FindBy(css = ".add-to-cart-buttons button[title='Add to Cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = "[title='Qty']")
    private WebElementFacade prdctQuantity;

    @FindBy(css = ".add-to-links a[class='link-wishlist']")
    private WebElementFacade addToWishList;



    public void setPrdctColorBlack(){
        clickOn(prdctColorBlack);
    }

    public void setPrdctColorWhite(){
        clickOn(prdctColorWhite);
    }

    public void setPrdctColorBlue(){
        clickOn(prdctColorBlue);
    }

    public void setPrdctColorCharcoal(){
        clickOn(prdctColorCharcoal);
    }

    public void setPrdctColorTaupe(){
        clickOn(prdctColorTaupe);
    }

    public void setPrdctColorSilver(){
        clickOn(prdctColorSilver);
    }

    public void setPrdctSizeSS(){
        clickOn(prdctSizeSS);
    }

    public void setPrdctSize30() {
        clickOn(prdctSize30);
    }

    public void setPrdctSize29(){
        clickOn(prdctSize29);
    }

    public void setPrdctSize28() { clickOn(prdctSize28);}

    public void setPrdctSize2() { clickOn(prdctSize2);}

    public void clickAddToCart(){
        clickOn(addToCartButton);
    }

    public void typePrdctQuantity(String number) {
        typeInto(prdctQuantity, number);
    }

    public void clickAddWishList(){
        clickOn(addToWishList);
    }

    public void optionsForKhakiBowery(){
        clickOn(prdctColorCharcoal);
        clickOn(prdctSize28);
        clickOn(addToCartButton);
    }

    public void optionsForParkAvenue(){
        clickOn(prdctColorTaupe);
        clickOn(prdctSize2);
        clickOn(addToCartButton);
    }

    public void optionsForFlatTrousers(){
        clickOn(prdctColorSilver);
        clickOn(prdctSize30);
        clickOn(addToCartButton);
    }



}
