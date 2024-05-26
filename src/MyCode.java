import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyCode {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
        driver.manage().window().maximize();
        driver.findElement(By.className("RoundedButton_RoundedButton__label__QMXsT")).click();
        
        String winHandleBefore = driver.getWindowHandle();
        
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        
        // Perform operations on the new window
        
        SignUpTestCase.signUp(driver, "Ahmedelmasry@live.com", "Nadamasry88a");
        
        
        
        
        driver.quit();
    }
}
