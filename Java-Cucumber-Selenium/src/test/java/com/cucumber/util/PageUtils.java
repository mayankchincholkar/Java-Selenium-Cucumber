package com.cucumber.util;

import com.cucumber.steps.E2ESteps;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
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
}
