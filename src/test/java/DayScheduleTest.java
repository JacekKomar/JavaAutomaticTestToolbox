import org.testng.annotations.Test;
import pages.DayScheduleTestPage;


public class DayScheduleTest extends Main {

    @Test(priority = 1)
    public void testAddFirstTaskOne() {
          DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
          dayScheduleTestPage.addTaskOne();
          dayScheduleTestPage.clickAddTask();
}

    @Test(priority = 2)
    public void testAddSecondTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskTwo();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 3)
    public void testAddThirdTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.addTaskThree();
        dayScheduleTestPage.clickAddTask();
    }

    @Test(priority = 4)
    public void testDeleteTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.deleteTask();
    }

    @Test(priority = 5)
    public void testChangeTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.changeTaskPage();
    }

}
