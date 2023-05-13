package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Maven {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com");
        WebElement userNameButonu= driver.findElement(By.id("user-name"));
        userNameButonu.sendKeys("standard_user");
        WebElement paswordButonu=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        paswordButonu.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
       Thread.sleep(5000);
       WebElement element=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
       String urunIsmi= element.getText();

        System.out.println("urunIsmi = " + urunIsmi);
       element.click();

       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
       Thread.sleep(5000);

        WebElement sepettekiUrun=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String sepettekIUrun=sepettekiUrun.getText();
        System.out.println("sepettekIUrun = " + sepettekIUrun);

        if(urunIsmi.equals(sepettekIUrun)){
            System.out.println("Dogru urun sepete eklemistir- PASSED");
        }else {
            System.out.println("Dogru urun sepete eklenmeistir- FAILED");
        }
      driver.quit();
    }

}
