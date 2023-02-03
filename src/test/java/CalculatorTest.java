import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest extends Main{

    @AfterMethod
    public void deleteScore(){
        driver.findElement(By.xpath("(//button[normalize-space()='AC'])")).click();
    }
    @BeforeMethod
    public void informationAboutCalculating(){
        System.out.println("Kolejne Obliczenie:");
    }

    @Test(priority = 1)
    public void addition() {
        driver.findElement(By.xpath("(//h1[normalize-space()='Wybierz: Kalkulator'])[1]")).click();
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
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }

    @Test(priority = 2)
    public void subtraction() {
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
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }

    @Test(priority = 3)
    public void multiplication() {
        driver.findElement(By.xpath("(//button[normalize-space()='2'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='*'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }
    @Test(priority = 4)
    public void split() {
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='5'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='/'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='9'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='='])")).click();
        WebElement score = driver.findElement(By.xpath("(//div[contains(@class,'current-operant')])"));
        System.out.println(score);
    }
    @Test(priority = 5)
    public void delete() {
        driver.findElement(By.xpath("(//button[normalize-space()='1'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='7'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='3'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='DEL'])")).click();
    }
    }



