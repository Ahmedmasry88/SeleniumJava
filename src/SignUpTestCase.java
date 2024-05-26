import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;
import java.util.List;
public class SignUpTestCase {

    public static void signUp(WebDriver driver, String email, String password) {
        driver.findElement(By.xpath("/html//div[@id='app']/div/div[2]/div/div/div[1]/p[2]/a[@href='/sign-up/']"))
              .click();     
        driver.findElement(By.cssSelector("input[type='email'][name='email'][placeholder='E-mail'][data-testid='Input'].sc-satoz.llPDcM"))
              .sendKeys(email);
        driver.findElement(By.cssSelector("input[type='password'][name='password1'][placeholder='Password'][data-testid='Input'].sc-satoz.llPDcM"))
              .sendKeys(password);
        driver.findElement(By.cssSelector("input[type='password'][name='password2'][placeholder='Confirm password'][data-testid='Input'].sc-satoz.llPDcM\r\n"
        		+ "")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type='checkbox'][name='isAllowedEmailMarketing'][aria-label='I want to receive information about BugBug product updates.'][data-testid='Checkbox.Input'].sc-iXzfSG.bCEzYI"))
              .click();
        driver.findElement(By.cssSelector("div.sc-kdBSHD.iMxwCe.sc-uVWWZ.bbRINz")).click();
        
    }
  
}
