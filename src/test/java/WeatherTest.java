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
public class WeatherTest {

private WebDriver driver;

@BeforeTest
public void setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jacekkomar.github.io/toolbox/#/");
    driver.findElement(By.xpath("//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")).click();
}

@BeforeMethod
    public void nextWeather(){
        System.out.println("Pogoda dla kolejnego miasta:");
    }

    @AfterTest
    public void quitPageWeather(){
        driver.quit();
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
}