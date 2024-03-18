package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

public class Class1 extends Main {

    @Test
    public void logIn(){

    WebElement loginCredentials = driver.findElement(By.cssSelector("#login_credentials"));
    String allText = loginCredentials.getText();
    String firstLine = allText.split("\n")[1];

    WebElement userName = driver.findElement(By.cssSelector("#user-name"));
    userName.click();
    userName.sendKeys(firstLine);

    WebElement passwordCredentials = driver.findElement(By.cssSelector(".login_password"));
    String allTextPass = passwordCredentials.getText();
    String firstLinePass = allTextPass.split("\n")[1];


    WebElement password = driver.findElement(By.cssSelector("#password"));
    password.click();
    password.sendKeys(firstLinePass);

    WebElement buttonLogin = driver.findElement(By.cssSelector("#login-button"));
    buttonLogin.click();

    WebElement addToCartLabsBackpack = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
    addToCartLabsBackpack.click();

    WebElement shoppingCart = driver.findElement(By.cssSelector("#shopping_cart_container"));
    shoppingCart.click();

    WebElement removeLabsBackpack = driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
    removeLabsBackpack.click();

    WebElement continueShopping = driver.findElement(By.cssSelector("#continue-shopping"));
    continueShopping.click();

    WebElement findSauceLabsOneSize = driver.findElement(By.cssSelector("#item_2_title_link"));
    findSauceLabsOneSize.click();

    WebElement addToCartSauceLabsOneSize = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie"));
    addToCartSauceLabsOneSize.click();

    WebElement shoppingCart1 = driver.findElement(By.cssSelector("#shopping_cart_container"));
    shoppingCart1.click();

    WebElement checkOut = driver.findElement(By.cssSelector("#checkout"));
    checkOut.click();

    WebElement firstName = driver.findElement(By.cssSelector("#first-name"));
    firstName.click();
    firstName.sendKeys("Alina");

    WebElement secondName = driver.findElement(By.cssSelector("#last-name"));
    secondName.click();
    secondName.sendKeys("Miau");

    WebElement postalCode = driver.findElement(By.cssSelector("#postal-code"));
    postalCode.click();
    postalCode.sendKeys("9000");

    WebElement continueButton = driver.findElement(By.cssSelector("#continue"));
    continueButton.click();

    WebElement finishButton = driver.findElement(By.cssSelector("#finish"));
    finishButton.click();





    }
}
