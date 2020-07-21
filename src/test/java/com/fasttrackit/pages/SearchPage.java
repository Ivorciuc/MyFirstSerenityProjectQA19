package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q")
public class SearchPage extends PageObject {

    @FindBy(css = ".product-name a[title='Retro Chic Eyeglasses']")
    private WebElementFacade productFindRetroChicEye;

    @FindBy(css = "ol.nav-primary li.level0:nth-child(6) a")
    private WebElementFacade vIPPage;

    @FindBy(css = ".product-name a[title='DUMBO Boyfriend Jean']")
    private WebElementFacade productDumboBoyFriendJean;

    @FindBy(css = ".product-name a[title='Khaki Bowery Chino Pants']")
    private WebElementFacade productKhakiBoweryPants;

    @FindBy(css = ".product-name a[title='Park Avenue Pleat Front Trousers']")
    private WebElementFacade productParkAvenueTrousers;

    @FindBy(css = ".product-name a[title='Flat Front  Trouser']")
    private WebElementFacade productFlatFrontTrousers;

    @FindBy(css = "")
    private WebElementFacade productList;

    public void retroChicEyeGlasses(){
        clickOn(productFindRetroChicEye);
    }

    public void clickOnVIP(){
        clickOn(vIPPage);
    }

    public void clickOnDumboJean(){
        clickOn(productDumboBoyFriendJean);
    }

    public void clickOnKhakiBowery(){
        clickOn(productKhakiBoweryPants);
    }

    public void clickOnParkAvenueTrousers(){
        clickOn(productParkAvenueTrousers);
    }

    public void clickOnFlatFrontTrousers(){
        clickOn(productFlatFrontTrousers);
    }

    public void setProductList(){
        
    }


}
