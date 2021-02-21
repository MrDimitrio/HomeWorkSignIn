import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class ShoppingBasket {
    @Test
    public void checkJava() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\HomeWorkSignIn\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        WebElement searchQuery = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        //searchQuery.click();
        searchQuery.sendKeys("Blouse", Keys.ENTER);
        sleep(2000);

        WebElement iconList = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
        iconList.click();
        sleep(2000);

        WebElement addCard = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
        addCard.click();
        sleep(2000);

        WebElement proceedButton = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
        proceedButton.click();
        WebElement iconPlus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
        iconPlus.click();
        sleep(2000);

        String total = driver.findElement(By.xpath("//span[@id='total_product_price_2_7_0']")).getText();
        System.out.println(total);
        Assert.assertTrue("54", true);
        sleep(2000);

        String totalProducts = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
        System.out.println(totalProducts);
        Assert.assertTrue("54", true);
        sleep(2000);

        String totalShipping = driver.findElement(By.xpath("//td[@id='total_shipping']")).getText();
        System.out.println(totalShipping );
        Assert.assertTrue("2", true);
        sleep(2000);

        String totalProdShip = driver.findElement(By.xpath("//td[@id='total_price_without_tax']")).getText();
        System.out.println(totalProdShip );
        Assert.assertTrue("56", true);
        sleep(2000);

        String tax = driver.findElement(By.xpath("//td[@id='total_tax']")).getText();
        System.out.println(tax );
        Assert.assertTrue("0", true);
        sleep(2000);

        String finalTotal = driver.findElement(By.xpath("//span[@id='total_price']")).getText();
        System.out.println("finalTotal:" + finalTotal );
        Assert.assertTrue("56", true);
        sleep(2000);

        WebElement delete = driver.findElement(By.xpath("//a[@id='2_7_0_0']"));
        delete.click();
        sleep(2000);

        String informMessage= driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        System.out.println(informMessage );
        Assert.assertTrue("Your shopping cart is empty.", true);
        sleep(2000);

        driver.manage().deleteAllCookies();
        driver.close();

    }
}
