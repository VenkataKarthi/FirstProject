
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.awt.*;
        import java.awt.datatransfer.StringSelection;
        import java.awt.event.KeyEvent;
        import java.util.concurrent.TimeUnit;

public class Referral_UIStepsImpl  extends Utilities {
    WebDriver driver = getDriver();
    //static int count=0;

    public void navigateToPplHum() {
        driver.navigate().to("https://beta.peoplehum.qa/login");
    }

    public void loginToPplHum(String username, String password) throws Exception {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[1]/input")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/input")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/p/button")).click();
    }

    public void referralUser() throws Exception {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement referralButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/left-nav/aside/div/div/div/ul/li[4]/a"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(referralButton));
        referralButton.click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/left-nav/aside/div/div/div/ul/li[4]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/input")).sendKeys("HelloWorld");
        driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[2]/div[1]/div[1]/div/div/div[3]/div/input")).sendKeys("some6fwd5mail14@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[2]/div[1]/div[1]/div/div/div[6]/div/div/div/div[1]/span/i")).click();
        driver.findElement(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[1]")).click();


    }

    void uploadReferralResume() throws Exception {
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div/p"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
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
        driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div/ul/li/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"referralForm\"]/div[1]/div/button[2]/span")).click();
        //count++;
    }

}
