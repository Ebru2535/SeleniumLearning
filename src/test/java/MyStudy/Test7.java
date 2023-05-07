package MyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        WebElement googlearamaÇubuğu=driver.findElement(By.xpath("//*[@name='q']"));
        googlearamaÇubuğu.sendKeys("Ahmet Kaya"+ Keys.ENTER);
        WebElement ahmetkaya= driver.findElement(By.xpath("//div[@class='title'][1]"));
        ahmetkaya.click();
        driver.findElement(By.xpath("(//span[@class='cHaqb'])[2]")).click();
    }
}
