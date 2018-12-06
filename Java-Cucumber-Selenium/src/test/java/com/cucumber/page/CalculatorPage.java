package com.cucumber.page;

import com.cucumber.util.PageUtils;
import com.cucumber.util.ReadLocatorJson;
import cucumber.api.DataTable;
import javafx.scene.chart.PieChart;
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

    public static void selectBuyType(String locator) throws IOException, ParseException {
        PageUtils.click(ReadLocatorJson.getLocatorValue(locator));
    }

    public static void selectDependents(DataTable dropDownOptions)  throws IOException, ParseException{
       List<List<String>> selectOption = dropDownOptions.raw();
        PageUtils.selectFromDropDown(ReadLocatorJson.getLocatorValue(selectOption.get(0).get(0)),selectOption.get(0).get(1));
    }

    public static void enterIncome(DataTable income)  throws IOException,ParseException{
        List<List<String>> yourIncome = income.raw();
        PageUtils.enterInputByCss(ReadLocatorJson.getLocatorValue(yourIncome.get(0).get(0)),yourIncome.get(0).get(1));
    }

    public static void enterOtherIncome(DataTable income)  throws IOException,ParseException{
        List<List<String>> yourIncome = income.raw();
        PageUtils.enterInputByCss(ReadLocatorJson.getLocatorValue(yourIncome.get(0).get(0)),yourIncome.get(0).get(1));
    }

    public static void enterExpense(DataTable expense)  throws IOException,ParseException{
        List<List<String>> yourExpense = expense.raw();
        PageUtils.enterInputById(ReadLocatorJson.getLocatorValue(yourExpense.get(0).get(0)),yourExpense.get(0).get(1));
    }

    public static void enterHomeLoan(DataTable homeLoan)  throws IOException,ParseException{
        List<List<String>> yourHomeLoan = homeLoan.raw();
        PageUtils.enterInputById(ReadLocatorJson.getLocatorValue(yourHomeLoan.get(0).get(0)),yourHomeLoan.get(0).get(1));
    }

    public static void enterOtherLoan(DataTable otherLoan)  throws IOException,ParseException{
        List<List<String>> yourOtherLoan = otherLoan.raw();
        PageUtils.enterInputById(ReadLocatorJson.getLocatorValue(yourOtherLoan.get(0).get(0)),yourOtherLoan.get(0).get(1));
    }

    public static void enterOtherCommitment(DataTable otherComms)  throws IOException,ParseException{
        List<List<String>> yourOtherComms = otherComms.raw();
        PageUtils.enterInputByCss(ReadLocatorJson.getLocatorValue(yourOtherComms.get(0).get(0)),yourOtherComms.get(0).get(1));
    }

    public static void enterCreditLimit(DataTable creditLimit)  throws IOException,ParseException{
        List<List<String>> yourCreditLimit = creditLimit.raw();
        PageUtils.enterInputById(ReadLocatorJson.getLocatorValue(yourCreditLimit.get(0).get(0)),yourCreditLimit.get(0).get(1));
    }

    public static void clickBorrowButton(String locator) throws IOException, ParseException {
        PageUtils.click(ReadLocatorJson.getLocatorValue(locator));
    }

    public static void verifyBorrowAmount(String result, String locator) throws IOException, ParseException {
        Assert.assertEquals(true, PageUtils.getElementText(ReadLocatorJson.getLocatorValue(locator),result));
    }
}
