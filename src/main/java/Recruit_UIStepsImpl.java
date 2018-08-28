import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Recruit_UIStepsImpl  extends Utilities {
    WebDriver driver = getDriver();

    public void navigateToPplHum() {
        driver.navigate().to("https://beta.peoplehum.qa/login");
    }

    public void loginToPplHum(String username, String password) throws Exception {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/input")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/p/button")).click();
    }


    public void validUser() throws Exception {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement recruitButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/left-nav/aside/div/div/div/ul/li[3]/a"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(recruitButton));
        recruitButton.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/left-nav/aside/div/div/div/ul/li[3]/ul/li[2]/a")).click();
    }

    public void displayApplications() throws Exception {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.close();

    }

    public void uploadResume() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement newAppButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/div/div/div/div[1]/div/button/span[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(newAppButton));
        newAppButton.click();
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"applicantForm\"]/div[2]/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div"));

        wait.until(ExpectedConditions.elementToBeClickable(upload));
        upload.click();
        Robot robot = new Robot();
        robot.setAutoDelay(2000);
        StringSelection stringSelection = new StringSelection("/Users/venkatkarthi/Downloads/Venkata Karthi Resume.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


}