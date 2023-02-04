package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherPage {

    @FindBy(xpath = "//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")
            private WebElement chooseWeatherPage;

    @FindBy(xpath = "(//button[contains(@class,'rounded border border-dark brightenedDark')])[2]")
            private WebElement weatherApiButtonClick;

    @FindBy(xpath = "(//input[@placeholder=' Wpisz nazwę miejscowości'])")
            private WebElement cityName;

    @FindBy(xpath = "//div[@class='temp']//h2//p")
            private WebElement actualWeather;

    @FindBy(xpath = "(//button[contains(@class,'rounded border border-dark brightenedDark')])[1]")
            private WebElement OpenWeatherApiButtonClick;

    @FindBy(xpath = "(//div[@class=' ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])")
            private WebElement chooseCalendarPage;

    @FindBy(xpath = "(//button[normalize-space()='»'])")
            private WebElement nextYear;

    @FindBy(xpath = "(//button[contains(text(),'›')])")
            private WebElement nextMonth;

    @FindBy(xpath = "(//button[contains(text(),'‹')])")
            private WebElement previousMonth;

    @FindBy(xpath = "(//button[normalize-space()='«'])")
            private WebElement previousYear;

    @FindBy(xpath = "(//abbr[@aria-label='14 marca 2024'])")
            private WebElement seeData;


    public void nextWeather() {
        chooseWeatherPage.click();
    }

    public void findWeatherPage() {
        weatherApiButtonClick.click();
        cityName.sendKeys("Warszawa");
    }

    public void findWeatherPageTwo() {
        OpenWeatherApiButtonClick.click();
        cityName.sendKeys("Poznań");
    }

    public void calendarTest() {
        chooseCalendarPage.click();
        nextYear.click();
        nextMonth.click();
        previousMonth.click();
        previousYear.click();
        seeData.click();
    }

}
