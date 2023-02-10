import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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

    static ExtentTest test;
    static ExtentReports report;

    @BeforeTest
    public static void startTest()
    {
        report = new ExtentReports(System.getProperty("user.dir")+"DayScheduleTestExtentReportResults.html");
        test = report.startTest("DayScheduleTest");
    }

    @AfterTest
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
