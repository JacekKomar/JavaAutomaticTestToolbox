package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherPage {

    @FindBy(xpath = "//div[@class='ChooseSite col-sm mr-1 p-4 border border-dark rounded brightened']")
            private WebElement chooseWeatherPage;

    @FindBy(xpath = "(//button[contains(@class,'rounded border border-dark brightenedDark')])[2]")
            private WebElement weatherApiButtonClick;

    @FindBy(xpath = "(//input[@placeholder=' Wpisz nazwę miejscowości'])")
            private WebElement cityName;

    @FindBy(xpath = "(//button[contains(@class,'rounded border border-dark brightenedDark')])[1]")
            private WebElement openWeatherApiButtonClick;

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

    public WeatherPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void nextWeatherPage() {
        chooseWeatherPage.click();

    }

    public void findWeatherPageOnePage() {
        weatherApiButtonClick.click();
        cityName.sendKeys("Warszawa");
    }

    public void findWeatherPageTwoPage() {
        openWeatherApiButtonClick.click();
        cityName.sendKeys("Poznań");
    }

    public void enterCity() {
        cityName.sendKeys(Keys.ENTER);
    }

    public void showCity() {
        System.out.println("Miasto to:" + " " +  cityName.getAttribute ( "value"));
    }

    public void calendarTestPage() {
        chooseCalendarPage.click();
        nextYear.click();
        nextMonth.click();
        previousMonth.click();
        previousYear.click();
    }

}
