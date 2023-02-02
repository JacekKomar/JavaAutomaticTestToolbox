import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.css.model.Value;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class WeatherTest extends Main {



@BeforeMethod
    public void nextWeather(){
    driver.findElement(By.xpath("//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")).click();
        System.out.println("Pogoda dla kolejnego miasta:");
    }

    @Test
    public void findWeatherPage() throws InterruptedException {
        driver.findElement(By.xpath("(//button[contains(@class,'rounded border border-dark brightenedDark')])[2]")).click();
        WebElement cityName = driver.findElement(By.xpath("(//input[@placeholder=' Wpisz nazwę miejscowości'])"));
        cityName.sendKeys("Warszawa");
        System.out.println("Miasto to:" + " " + cityName.getAttribute("value"));
        cityName.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement actualWeather = driver.findElement(By.xpath("//div[@class='temp']//h2//p"));
        Thread.sleep(2000);
//      System.out.println("Temperatura to:" + " " +  actualWeather.getAttribute("value"));
    }

@Test
public void findWeatherPageTwo() throws InterruptedException {
        driver.findElement(By.xpath("(//button[contains(@class,'rounded border border-dark brightenedDark')])[1]")).click();
        WebElement cityNameTwo = driver.findElement(By.xpath("(//input[@placeholder=' Wpisz nazwę miejscowości'])"));
        cityNameTwo.sendKeys("Poznań");
        System.out.println("Miasto to:" + " " +  cityNameTwo.getAttribute ( "value"));
        cityNameTwo.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement actualWeatherTwo = driver.findElement(By.xpath("//div[@class='temp']//h2//p"));
        Thread.sleep(2000);
//        System.out.println("Temperatura to:" + " " +  actualWeatherTwo.getAttribute("value"));
    }
    @Test
    public void calendarTest() throws InterruptedException {
    driver.findElement(By.xpath("(//div[@class=' ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='»'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='»'])")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'›')])")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'›')])")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'‹')])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='«'])")).click();
        driver.findElement(By.xpath("(//abbr[@aria-label='14 marca 2024'])")).click();
        Thread.sleep(3000);
        System.out.println("Wybrano datę:");
    }

}