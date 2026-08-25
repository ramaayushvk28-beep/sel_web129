package app1234;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AppTest {
 
    public static void main(String[] args) throws InterruptedException {
 
        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();
 
        driver.get("https://the-internet.herokuapp.com/login");
 Thread.sleep(3000);
 
        driver.findElement(By.id("username"))
              .sendKeys("tomsmith");
 Thread.sleep(3000);
 
        driver.findElement(By.id("password"))
              .sendKeys("SuperSecretPassword!");
 Thread.sleep(3000);
 
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();
 Thread.sleep(3000);
 
        String message =
                driver.findElement(By.id("flash")).getText();
 
        if(message.contains("You logged into a secure area!")) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
 Thread.sleep(3000);
 
        driver.quit();
    }
}