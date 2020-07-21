package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SearchSteps {

    private HomePage homePage;
    private SearchPage searchResultsPage;

    @Step
    public void typeInSearchBar(String product){
        homePage.setSearchBar(product);
    }

    @Step
    public void clickForSearch(){
        homePage.clickSearchButton();
    }

    @Step
    public void clickOnRetroEyeGlasses(){
        searchResultsPage.retroChicEyeGlasses();
    }

    @Step
    public void clickOnVIP(){
        searchResultsPage.clickOnVIP();
    }

    @Step
    public void clickOnDumboBoyfriendJeanPRDCT(){
        searchResultsPage.clickOnDumboJean();
    }

    @Step
    public void clickOnKhakiBoweryPRDCT(){
        searchResultsPage.clickOnKhakiBowery();
    }

    @Step
    public void clickOnParkAvenuePRDCT(){
        searchResultsPage.clickOnParkAvenueTrousers();
    }

    @Step
    public void clickOnFlatFrontTrousersPRDCT(){
        searchResultsPage.clickOnFlatFrontTrousers();
    }

    @Step
    public void searchPants(){
        typeInSearchBar("pants");
        clickForSearch();
    }

}
