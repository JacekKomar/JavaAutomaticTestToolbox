import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WeatherPage;
import java.util.logging.Logger;

public class WeatherTest extends Main {

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
    }

}