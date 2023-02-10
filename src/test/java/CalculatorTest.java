import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WeatherPage;
import java.util.logging.Logger;

public class CalculatorTest extends Main{

    Logger logger = Logger.getLogger(WeatherPage.class.getName());

    SoftAssert softAssert = new SoftAssert();

    @AfterMethod
        public void deleteScore(){
        driver.findElement(By.xpath("(//button[normalize-space()='AC'])")).click();
    }

    @BeforeMethod
        public void informationAboutCalculating(){
        logger.info("Kolejne Obliczenie:");
    }

    public void tapButton(String label){
        driver.findElement(By.xpath("(//button[normalize-space()='"+label+"'])")).click();
    }

    @Test(priority = 1)
    public void addition() {
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
        logger.info("Dodawanie działa");
    }

    @Test(priority = 2)
    public void subtraction() {
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
        logger.info("Odejmowanie działa");
    }

    @Test(priority = 3)
    public void multiplication() {
            tapButton("2");
            tapButton("7");
            tapButton("*");
            tapButton("5");
            tapButton("1");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "1377");
        logger.info("Mnożenie działa");
    }

    @Test(priority = 4)
    public void split() {
            tapButton("9");
            tapButton("5");
            tapButton("1");
            tapButton("/");
            tapButton("7");
            tapButton("9");
            tapButton("=");
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        Assert.assertEquals(score.getText(), "12.037974683544304");
        logger.info("Dzielenie działa");
    }

    @Test(priority = 5)
    public void delete() {
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
        logger.info ("Usuwanie liczb działa");
    }

    }
