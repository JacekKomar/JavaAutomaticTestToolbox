import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.css.model.Value;
import org.testng.annotations.Test;
public class WeatherTest {





    @Test
    public void findWeatherPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jacekkomar.github.io/toolbox/#/");
        driver.findElement(By.xpath("//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'rounded border border-dark brightenedDark')])[2]")).click();
        WebElement cityName = driver.findElement(By.xpath("(//input[@placeholder=' Wpisz nazwę miejscowości'])"));
        cityName.sendKeys("Warszawa");
        System.out.println("Miasto to:" + " " +  cityName.getAttribute ( "value"));
        cityName.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    WebElement actualWeather = driver.findElement(By.xpath("//p[contains(.,'°C')]"));
        System.out.println("Temperatura to:" + " " +  actualWeather.getAttribute ( "value"));

//     driver.quit();
    }
}