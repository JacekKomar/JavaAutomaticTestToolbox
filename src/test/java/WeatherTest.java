import org.testng.annotations.Test;
import pages.WeatherPage;

public class WeatherTest extends Main {

    @Test(priority = 1)
    public void testFindWeatherPage() throws InterruptedException {
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.nextWeatherPage();
        weatherPage.findWeatherPageOnePage();
        weatherPage.showCity();
        weatherPage.enterCity();
        Thread.sleep(1000);

    }

    @Test(priority = 2)
    public void testFindWeatherPageTwo() throws InterruptedException {
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.findWeatherPageTwoPage();
        weatherPage.showCity();
        weatherPage.enterCity();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void testInCalendarChooseDate() {
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.calendarTestPage();
    }

}