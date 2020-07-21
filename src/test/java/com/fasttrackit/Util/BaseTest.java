package com.fasttrackit.Util;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = false)
    private WebDriver driver;

    @Before
    public void maximise() {
        driver.manage().window().maximize();
    }
}