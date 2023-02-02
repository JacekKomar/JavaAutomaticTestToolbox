import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WeatherTest {





    @Test
    public void findWeatherPage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jacekkomar.github.io/toolbox/#/");
        driver.findElement(By.xpath("//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'rounded border border-dark brightenedDark')])[2]")).click();
    }
}