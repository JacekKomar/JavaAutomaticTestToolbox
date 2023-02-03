import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class DayScheduleTest extends Main {

    @BeforeMethod
        public void addTaskConsoleInfo(){
            System.out.println("Dodano zadanie:");
        }

    @Test(priority = 1)
    public void findDaySchedulePage() {
        driver.findElement(By.xpath("(//div[@class='ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])[2]")).click();
    }

    @Test(priority = 2)
    public void addFirstTask() {
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Napisanie Cv.");
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();

}

    @Test(priority = 3)
    public void addSecondTask() {
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Nauka robienia testów automatycznych w Javie.");
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();

    }

    @Test(priority = 4)
    public void addThirdTask() {
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Czytanie książki.");
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();

    }

    @Test(priority = 5)
    public void deleteTask() {
        WebElement deleteOneTask = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[5]"));
        deleteOneTask.click();
    }

    @Test(priority = 6)
    public void changeTask() {
       WebElement changeOneTask = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[4]"));
       changeOneTask.click();
       WebElement writeChangeTask = driver.findElement(By.xpath("(//input[contains(@placeholder,'Update your item')])[1]"));
        writeChangeTask.click();
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.ARROW_RIGHT);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(Keys.BACK_SPACE);
        writeChangeTask.sendKeys(" Pythonie");
        driver.findElement(By.xpath("(//h3[contains(text(),'Zamień')])")).click();
    }
}
