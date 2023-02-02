import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalculatorTest extends Main{

    @AfterMethod
    public void deleteScore(){
        driver.findElement(By.xpath("(//button[normalize-space()='AC'])")).click();
    }
    @AfterMethod
    public void informationAboutCalculating(){
        System.out.println("Kolejne Obliczenie:");
    }

    @Test
    public void addition() throws InterruptedException {
        driver.findElement(By.xpath("(//h1[normalize-space()='Wybierz: Kalkulator'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='2'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='3'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='4'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='+'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='6'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='8'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        Thread.sleep(3000);
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }

    @Test
    public void subtraction() throws InterruptedException {
        driver.findElement(By.xpath("(//button[normalize-space()='0'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='.'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='3'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='4'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='-'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='6'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='8'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        Thread.sleep(3000);
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }

    @Test
    public void multiplication() throws InterruptedException {
        driver.findElement(By.xpath("(//button[normalize-space()='2'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='*'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        Thread.sleep(3000);
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }
    @Test
    public void split() throws InterruptedException {
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='/'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        Thread.sleep(3000);
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }
    @Test
    public void delete() throws InterruptedException {
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='3'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
        Thread.sleep(3000);
    }
    }



