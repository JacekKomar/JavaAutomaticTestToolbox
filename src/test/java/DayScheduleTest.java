import org.testng.annotations.Test;
import pages.DayScheduleTestPage;


public class DayScheduleTest extends Main {

    @Test(priority = 1)
    public void addFirstTaskOne() {
          DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
          dayScheduleTestPage.addTaskOne();
          dayScheduleTestPage.clickAddTask();
}

    @Test(priority = 2)
    public void addSecondTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskTwo();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 3)
    public void addThirdTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskThree();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 4)
    public void deleteTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.deleteTask();
    }

    @Test(priority = 5)
    public void changeTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.changeTaskPage();
    }

}
