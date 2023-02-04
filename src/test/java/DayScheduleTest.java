import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DayScheduleTestPage;

public class DayScheduleTest extends Main {

    @BeforeMethod
        public void addTaskConsoleInfo(){
            System.out.println("Kolejny test:");
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
        System.out.println("Usunięto" + " " + "zadanie");
    }

    @Test(priority = 5)
    public void changeTask() {
        DayScheduleTestPage dayScheduleTestPage = new DayScheduleTestPage(driver);
        dayScheduleTestPage.changeTaskPage();
    }

}
