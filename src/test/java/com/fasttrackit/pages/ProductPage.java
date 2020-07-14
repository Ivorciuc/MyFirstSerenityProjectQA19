package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/linen-blazer-580.html")
public class ProductPage extends PageObject {

    @FindBy(css = "a[title='White'] .swatch-label")
    private WebElementFacade prdctColor;

    public void setPrdctColor(){
        clickOn(prdctColor);
    }

    @FindBy(css = "#swatch81")
    private WebElementFacade prdctSize;

    public void setPrdctSize(){
        clickOn(prdctSize);
    }

    @FindBy(css = ".add-to-cart-buttons button[title='Add to Cart']")
    private WebElementFacade addToCartButton;

    public void clickAddToCart(){
        clickOn(addToCartButton);
    }

    @FindBy(css = ".success-msg span")
    private  WebElementFacade successMsg;

    public Boolean checkSuccessMsgLinenBlazer(){
        return successMsg.containsOnlyText("Linen Blazer was added to your shopping cart.");
    }


}
