import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WeatherPage;

public class WeatherTest extends Main {

@BeforeMethod
    public void nextWeather(){
        System.out.println("Pogoda dla kolejnego miasta:");
    }

    @Test(priority = 1)
    public void findWeatherPage() throws InterruptedException {
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.nextWeatherPage();
        weatherPage.findWeatherPageOnePage();
        weatherPage.showCity();
        weatherPage.enterCity();
        Thread.sleep(1000);
    }

@Test(priority = 2)
public void findWeatherPageTwo() throws InterruptedException {
    WeatherPage weatherPage = new WeatherPage(driver);
    weatherPage.findWeatherPageTwoPage();
    weatherPage.showCity();
    weatherPage.enterCity();
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void calendarTest() {
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.calendarTestPage();
        System.out.println("Wybrano datę");
    }

}