package MyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test6 {
    // 1- bir class olusturun
    //2- https://www.amazon.com/ adresine gidin

    //3- Browseri tam sayfa yapin
    //4- Sayfayi “refresh” yapin
    //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
    //6- Gift Cards sekmesine basin
    //7- Birthday butonuna basin
    //8- Best Seller bolumunden ilk urunu tiklayin
    //9- Gift card details’den 25 $’i secin
    //10-Urun ucretinin 25$ oldugunu test edin
    //11-Sayfayi kapatin
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://www.amazon.com/");

        //4- Sayfayi “refresh” yapin
         driver.navigate().refresh();

        //5- Sayfa basliginin “Amazon.com. Spend less. Smile more.” ifadesi icerdigini test edin
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        // System.out.println("actualTitle = " + actualTitle);
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }
        //6- Gift Cards sekmesine basin
        WebElement giftCardElementi= driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
        giftCardElementi.click();

        //7- Birthday butonuna basin
        WebElement birthDayElementi= driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']"));
        birthDayElementi.click();

        //8- Best Seller bolumunden 3. urunu tiklayin
        WebElement bestSellerElementi=driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[3]"));
        bestSellerElementi.click();

        //9- Gift card details’den 25 $’i secin

        WebElement detalistElementi=driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
        System.out.println(detalistElementi.getText());
        detalistElementi.click();

        //10-Urun ucretinin 25$ oldugunu test edin

        String expectedUcret = "$25";
        String actualUcret = detalistElementi.getText();

        if(expectedUcret.equals(actualUcret)){
            System.out.println("Ucret testi PASSED");
        }else {
            System.out.println("Ucret testi FAILED");
        }
           //11-Sayfayi kapatin

        Thread.sleep(2000);
        driver.close();



    }
}
