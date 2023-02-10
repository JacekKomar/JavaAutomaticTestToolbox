package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class DayScheduleTestPage {

    Logger logger = Logger.getLogger(DayScheduleTestPage.class.getName());

    @FindBy(xpath = "(//div[@class='ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])[2]")
        private WebElement chooseDaySchedulePage;

    @FindBy(xpath = "//input[@placeholder='Wpisz swoje zadanie']")
        private WebElement addTaskWrite;

    @FindBy(xpath = "(//h3[normalize-space()='Dodaj swoje zadania'])")
        private WebElement addtaskButton;

    @FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[5]")
        private WebElement deleteOneTaskButton;

    @FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[4]")
            private WebElement changeOneTaskButton;

    @FindBy(xpath = "(//input[contains(@placeholder,'Update your item')])[1]")
            private WebElement writeChangeTask;

    @FindBy(xpath = "(//h3[contains(text(),'Zamień')])")
            private WebElement confirmChangeTaskButton;

    @FindBy(xpath = "")
    private WebElement searchTask;

    public DayScheduleTestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addTaskOne() {
        chooseDaySchedulePage.click();
        addTaskWrite.click();
        addTaskWrite.sendKeys("Napisanie Cv.");
        Assert.assertEquals(addTaskWrite.getAttribute("value"), "Napisanie Cv.");
        logger.info(" Poprawnie dodano pierwsze zadanie.");
    }

    public void addTaskTwo() {
        addTaskWrite.click();
        addTaskWrite.sendKeys("Nauka robienia testów automatycznych w Javie.");
        Assert.assertEquals(addTaskWrite.getAttribute("value"), "Nauka robienia testów automatycznych w Javie.");
        logger.info(" Poprawnie dodano drugie zadanie.");
    }

    public void addTaskThree() {
        addTaskWrite.click();
        addTaskWrite.sendKeys("Czytanie książki.");
        Assert.assertEquals(addTaskWrite.getAttribute("value"), "Czytanie książki.");
        logger.info(" Poprawnie dodano trzecie zadanie.");
    }

    public void displayTask() {
        logger.info("Zadanie to:" + " " + addTaskWrite.getAttribute("value"));
    }

    public void clickAddTask() {
        addtaskButton.click();
    }

    public void deleteTask() {
        deleteOneTaskButton.click();
    }

    public void changeTaskPage() {
        changeOneTaskButton.click();
        writeChangeTask.click();
        for (int i = 0; i < 21; i++){
            if (i<21) {
                writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
            }
        }
        for (int i = 0; i < 6; i++){
            if (i<6) {
                writeChangeTask.sendKeys(Keys.BACK_SPACE);
            }
        }
        writeChangeTask.sendKeys(" Pythonie");
        Assert.assertEquals(writeChangeTask.getAttribute("value"), "Nauka robienia testów automatycznych w Pythonie.");
        logger.info("Zmienione zadanie to:" + " " + writeChangeTask.getAttribute("value"));
        confirmChangeTaskButton.click();
    }

}
