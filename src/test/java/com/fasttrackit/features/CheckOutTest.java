package com.fasttrackit.features;


import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductPage;
import com.fasttrackit.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.aspectj.apache.bcel.classfile.Module;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CheckOutTest extends BaseTest {

      @Steps
      private SearchSteps searchSteps;

      @Steps
      private LoginSteps loginSteps;

      @Steps
      private CheckOutSteps checkOutSteps;

      @Steps
      private ProductSteps productSteps;

      @Steps
      private CartSteps cartSteps;




      @Test
      public void proceedToCheckout() throws InterruptedException {
          loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASS);
          searchSteps.typeInSearchBar("glasses");
          searchSteps.clickForSearch();
          searchSteps.clickOnRetroEyeGlasses();
          productSteps.clickAddCart();
          cartSteps.checkSuccessMsgCart("Retro Chic Eyeglasses was added to your shopping cart.");
          cartSteps.proceedToCheckout();
          checkOutSteps.checkout();
      }


}
