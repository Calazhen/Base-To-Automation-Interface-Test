package org.GettingGoogleTittle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxGheckoDriver {

    @Test
    public void quandoEntrarNoSiteGoogle_EntaoDevo_Ver_O_Titulo_Google() {
        System.setProperty("webdriver.gecko.driver", "/Users/calaz/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //Browser Maximizado
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Google",driver.getTitle());


        driver.quit();

    }

}