import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestHome {

    @Test
    public void checkJava() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\HomeWorkSignIn\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        WebElement signButton = driver.findElement(By.xpath("//a[@class='login']"));
        signButton.click();
        WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
        enterEmail.sendKeys("test@test.test2");
        WebElement createButton = driver.findElement(By.xpath("//button[@id = 'SubmitCreate']"));
        createButton.submit();
        sleep(2000);
        WebElement selectGender1 = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        selectGender1.click();
        sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys("Dmitriy");
        sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys("Nahotniuk");
        sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
        password.sendKeys("test");
        sleep(2000);
        WebElement registerButton = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']"));
        registerButton.click();
    }
}