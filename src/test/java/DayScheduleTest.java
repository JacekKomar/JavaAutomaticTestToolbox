import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DayScheduleTestPage;
import pages.WeatherPage;
import java.util.logging.Logger;

public class DayScheduleTest extends Main {

    Logger logger = Logger.getLogger(WeatherPage.class.getName());

    @BeforeMethod
        public void addTaskConsoleInfo(){
            logger.info("Kolejny test:");
        }

    @Test(priority = 1)
    public void addFirstTaskOne() {
          DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
          dayScheduleTestPage.addTaskOne();
          dayScheduleTestPage.displayTask();
          dayScheduleTestPage.clickAddTask();
}

    @Test(priority = 2)
    public void addSecondTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskTwo();
        dayScheduleTestPage.displayTask();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 3)
    public void addThirdTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskThree();
        dayScheduleTestPage.displayTask();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 4)
    public void deleteTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.deleteTask();
        logger.info("Usunięto" + " " + "zadanie");
    }

    @Test(priority = 5)
    public void changeTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.changeTaskPage();
    }

}
