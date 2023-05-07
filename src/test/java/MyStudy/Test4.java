package MyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        // arama butonunu bulmak için :
        WebElement arananbutton= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        arananbutton.sendKeys("gardrop");
        arananbutton.submit();
        WebElement arananResim=driver.findElement(By.xpath("//img[@class='s-image'][1]"));
        arananResim.click();
        WebElement arananFiyat= driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));

        int expettedresult=100;
        int actualresult=Integer.parseInt(arananFiyat.getText());
        if(actualresult<=expettedresult){
            System.out.println("ffiyat çok iyi");
        }else {
            System.out.println("fiyat çok pahalı alamam");
        }
        driver.close();


    }
}
