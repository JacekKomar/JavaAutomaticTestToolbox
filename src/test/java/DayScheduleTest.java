import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class DayScheduleTest extends Main {

    @BeforeMethod
        public void addTaskConsoleInfo(){
            System.out.println("Kolejny test:");
        }

    @Test(priority = 1)
    public void addFirstTask() {
        driver.findElement(By.xpath("(//div[@class='ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])[2]")).click();
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Napisanie Cv.");
        System.out.println("Zadanie to:" + " " + addTask.getAttribute("value"));
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();
}

    @Test(priority = 2)
    public void addSecondTask() {
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Nauka robienia testów automatycznych w Javie.");
        System.out.println("Zadanie to:" + " " + addTask.getAttribute("value"));
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();
    }

    @Test(priority = 3)
    public void addThirdTask() {
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));
        addTask.click();
        addTask.sendKeys("Czytanie książki.");
        System.out.println("Zadanie to:" + " " + addTask.getAttribute("value"));
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();
    }

    @Test(priority = 4)
    public void deleteTask() {
        WebElement deleteOneTask = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[5]"));
        deleteOneTask.click();
        System.out.println("Usunięto:" + "" + "zadanie");
    }

    @Test(priority = 5)
    public void changeTask() {
        WebElement changeOneTask = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[4]"));
        changeOneTask.click();
        WebElement writeChangeTask = driver.findElement(By.xpath("(//input[contains(@placeholder,'Update your item')])[1]"));
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
        System.out.println("Zmienione zadanie to:" + " " + writeChangeTask.getAttribute("value"));
        driver.findElement(By.xpath("(//h3[contains(text(),'Zamień')])")).click();
    }

}
