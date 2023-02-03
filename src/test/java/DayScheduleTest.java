import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class DayScheduleTest extends Main {

    @BeforeMethod
        public void addTaskConsoleInfo(){
            System.out.println("Dodano zadanie:");
        }

    @Test(priority = 1)
    public void findDaySchedulePage() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='ChooseSite col-sm p-4 mr-1 border border-dark rounded brightened'])[2]")).click();
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void addFirstTask() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']")).sendKeys("ww");
        driver.findElement(By.xpath("(//h3[normalize-space()='Dodaj swoje zadania'])")).click();
        Thread.sleep(2000);
//        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Wpisz swoje zadanie']"));

//        addTask.sendKeys("Napisanie Cv.");
//
//        Thread.sleep(2000);
}










}
