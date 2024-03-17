package Selenium_16MAR2024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {

    // Open app.vwo.com
    // Print the title and get the Current URL
    // VerIfy the Current URL is app.vwo.com


    @Test(groups = "QA")
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //Email address textbox
        //<input type="email" class="text-input W(100%)" name="username" id="login-username"
        // data-qa="hocewoqisi">
        WebElement elementEmailusername = driver.findElement(By.id("login-username"));
        elementEmailusername.sendKeys("syedrehna@gmail.com");
        //Password textbox
        WebElement elementPassword =driver.findElement(By.name("password"));
        elementPassword.sendKeys("Roohi786");
        WebElement submitbutton =driver.findElement(By.id("js-login-btn"));
        submitbutton.click();

        Thread.sleep(5000); //it wait for 3 sec

        WebElement error_popup = driver.findElement(By.id("js-notification-box"));
        String error_popup_text =error_popup.getText();
        System.out.println(error_popup_text);


        driver.quit();
    }




    }



