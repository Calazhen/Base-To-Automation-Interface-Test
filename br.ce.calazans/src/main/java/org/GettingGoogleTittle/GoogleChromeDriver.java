package org.GettingGoogleTittle;

import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleChromeDriver {

    @Test
    public void quandoEntrarNoSiteGoogle_EntaoDevo_Ver_O_Titulo_Google() {

        System.setProperty("webdriver.chrome.driver", "/Users/calaz/chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         /*driver.manage().window().setPosition(new Point(100, 100));*/ //Browser com tamanho específico
        driver.manage().window().maximize(); //Browser Maximizado

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Google",driver.getTitle());


        driver.quit();

    }

}
