import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verification {

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
        
       
        
        SignUpTestCase.signUp(driver, "Ahmedelmasry@live.com", "Nadamasry88a");
        
        
        
        String Massage = driver.findElement(By.xpath("/html//div[@id='app']/div/div[2]//form/div[1]/div/div[.='User is already registered with this e-mail address.']")).getText();
        System.out.println(Massage);
        Assert.assertEquals("User is already registered with this e-mail address.",Massage );
        
        
        
        


        

        
	}

}
