import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest extends Main{

    @AfterMethod
        public void deleteScore(){
        driver.findElement(By.xpath("(//button[normalize-space()='AC'])")).click();
    }

    public void tapButton(String label){
        driver.findElement(By.xpath("(//button[normalize-space()='"+label+"'])")).click();
    }

    @Test(priority = 1)
    public void testAdditionNumbers() {
        driver.findElement(By.xpath("(//h1[normalize-space()='Wybierz: Kalkulator'])[1]")).click();
            tapButton("1");
            tapButton("2");
            tapButton("3");
            tapButton("4");
            tapButton("+");
            tapButton("5");
            tapButton("6");
            tapButton("7");
            tapButton("8");
            tapButton("9");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "58023");
    }

    @Test(priority = 2)
    public void testSubtractionNumbers() {
            tapButton("0");
            tapButton(".");
            tapButton("3");
            tapButton("4");
            tapButton("-");
            tapButton("5");
            tapButton("6");
            tapButton("7");
            tapButton("8");
            tapButton("9");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "-56788.66");
    }

    @Test(priority = 3)
    public void testMultiplicationNumbers() {
            tapButton("2");
            tapButton("7");
            tapButton("*");
            tapButton("5");
            tapButton("1");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "1377");
    }

    @Test(priority = 4)
    public void testSplitNumbers() {
            tapButton("9");
            tapButton("5");
            tapButton("1");
            tapButton("/");
            tapButton("7");
            tapButton("9");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "12.037974683544304");
    }

    @Test(priority = 5)
    public void testDeleteNumbers() {
        tapButton("1");
        tapButton("7");
        tapButton("3");
        tapButton("0");
        tapButton("DEL");
        tapButton("DEL");
        tapButton("DEL");
        tapButton("DEL");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "");
    }

    static ExtentTest test;
    static ExtentReports report;

    @BeforeTest
    public static void startTest()
    {
        report = new ExtentReports(System.getProperty("user.dir")+"CalculatorTestExtentReportResults.html");
        test = report.startTest("CalculatorTest");
    }

    @AfterTest
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }

    }
