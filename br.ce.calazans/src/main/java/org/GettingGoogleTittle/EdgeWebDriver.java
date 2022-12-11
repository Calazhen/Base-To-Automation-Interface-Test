package org.GettingGoogleTittle;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeWebDriver {


    @Test
    public void quandoEntrarNoSiteGoogle_EntaoDevo_Ver_O_Titulo_Google() {

        System.setProperty("webdriver.edge.driver", "/Users/calaz/MicrosoftEdgeWebDriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); //Browser Maximizado
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Google",driver.getTitle());


        driver.close();

    }

}
