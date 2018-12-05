package com.cucumber.page;

import com.cucumber.util.PageUtils;
import com.cucumber.util.ReadLocatorJson;
import cucumber.api.DataTable;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import sun.jvm.hotspot.debugger.Page;

import java.io.IOException;
import java.util.List;

public class CalculatorPage {

    public static void verifyHomePageTitle(String title) {
        Assert.assertEquals(title, PageUtils.getTitle());
    }

    public static void openUrl(String url) {
        PageUtils.openUrl(url);
    }

    public static WebDriver initializeDriver() {
        return PageUtils.returnDriver();
    }

    public static void closeBrowser() {
        PageUtils.closeBrowser();
    }

    public static void selectApplicationType(String locator) throws IOException, ParseException {
        PageUtils.click(ReadLocatorJson.getLocatorValue(locator));
    }

    public static void selectDependents(DataTable dropDownOptions)  throws IOException, ParseException{
       List<List<String>> selectOption = dropDownOptions.raw();
        PageUtils.selectFromDropDown(ReadLocatorJson.getLocatorValue(selectOption.get(0).get(0)),selectOption.get(0).get(1));
    }
}
