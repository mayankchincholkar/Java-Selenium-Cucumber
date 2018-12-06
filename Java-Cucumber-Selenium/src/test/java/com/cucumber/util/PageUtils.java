package com.cucumber.util;

import com.cucumber.steps.E2ESteps;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class PageUtils {
    private static Logger logger = Logger.getLogger(PageUtils.class.getName());
    private static WebDriver driver;

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void openUrl(String url) {
        driver.get(url);
    }

    public static WebDriver returnDriver() {
        logger.info(System.getProperty("os.name"));
        if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
            System.setProperty("webdriver.chrome.driver", "./resources/drivers/chrome-driver/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "./resources/drivers/chrome-driver/chromedriver.exe");
        }
        return driver = new ChromeDriver();
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static void click(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public static void selectFromDropDown(String locator,String value){
       WebElement selectElement = driver.findElement(By.cssSelector(locator));
       new Select(selectElement).selectByVisibleText(value);
    }

    public static void enterInputByCss(String locator,String value){
        WebElement selectElement = driver.findElement(By.cssSelector(locator));
        selectElement.sendKeys(value);
    }

    public static void enterInputById(String locator,String value){
        WebElement selectElement = driver.findElement(By.id(locator));
        selectElement.sendKeys(value);
    }

    public static boolean getElementTextAfterWait(String locator,String value){
        WebDriverWait wait = new WebDriverWait(driver,5);
        return wait.until(ExpectedConditions.textToBe(By.cssSelector(locator),value));
    }
    public static String getElementText(String locator){
        logger.info(driver.findElement(By.cssSelector(locator)).getText());
        return driver.findElement(By.cssSelector(locator)).getText();
    }
    public static String getInputFieldValueByCss(String locator){
        logger.info(driver.findElement(By.cssSelector(locator)).getAttribute("value"));
        return driver.findElement(By.cssSelector(locator)).getText();
    }
    public static String getSelectFieldValue(String locator){
        logger.info(new Select(driver.findElement(By.cssSelector(locator))).getFirstSelectedOption().getText());
        return new Select(driver.findElement(By.cssSelector(locator))).getFirstSelectedOption().getText();
    }
    public static String getInputFieldValueById(String locator){
        logger.info(driver.findElement(By.id(locator)).getAttribute("value"));
        return driver.findElement(By.id(locator)).getText();
    }


}
