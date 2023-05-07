package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) throws InterruptedException {
         /* ...Exercise3...
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        //Click on  Calculater under Micro Apps
        //Type any number in the first input
        //Type any number in the second input
        //Click on Calculate
        //Get the result
        //Print the result
        //      */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("number1")).sendKeys("25");
        Thread.sleep(3000);
        driver.findElement(By.id("number2")).sendKeys("36");
        Thread.sleep(3000);
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(3000);
        WebElement sonuc= driver.findElement(By.xpath("//*[@id='answer']"));
        String result=driver.findElement(By.xpath("//*[@id='answer']")).getText();
        System.out.println("result = " + result);
        driver.quit();

    }
}
