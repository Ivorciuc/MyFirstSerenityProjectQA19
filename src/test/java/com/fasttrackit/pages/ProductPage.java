package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/linen-blazer-580.html")
public class ProductPage extends PageObject {

    @FindBy(css = "a[title='Black'] .swatch-label")
    private WebElementFacade prdctColorBlack;

    public void setPrdctColorBlack(){
        clickOn(prdctColorBlack);
    }

    @FindBy(css = "a[title='White'] .swatch-label")
    private WebElementFacade prdctColorWhite;

    public void setPrdctColorWhite(){
        clickOn(prdctColorWhite);
    }

    @FindBy(css = "#swatch80 .swatch-label")
    private WebElementFacade prdctSizeSS;

    public void setPrdctSizeSS(){
        clickOn(prdctSizeSS);
    }

    @FindBy(css = ".add-to-cart-buttons button[title='Add to Cart']")
    private WebElementFacade addToCartButton;

    public void clickAddToCart(){
        clickOn(addToCartButton);
    }


    @FindBy(css = "[title='Qty']")
    private WebElementFacade prdctQuantity;

    public boolean setPrdctQuantity(int qty) {
        try {
            return prdctQuantity.containsValue(String.valueOf(1));
        } catch ( AssertionError error ) {
            clickOn(prdctQuantity);
            prdctQuantity.clear();
            typeInto(prdctQuantity, String.valueOf(qty));
        }
        return true;
    }
}
