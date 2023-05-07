package MyStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

         String title= driver.getTitle();
         String expectedresult= "facebook";
         if(title.contains(expectedresult)){
             System.out.println("Verify");
         }else {
             System.out.println("facebook");
         }


         String url= driver.getCurrentUrl();
         if(url.contains(expectedresult)){
             System.out.println("Url facebook kelimesi içeriyor");
         }else {
             System.out.println(url);
         }
         driver.get("https://www.walmart.com/");
         Thread.sleep(5000);

         String title2= driver.getTitle();
         String expectedresult2="Walmart.com";

         if(title2.contains(expectedresult2)){
             System.out.println("Sayfa başlığı Walmart.com içerir");
         }
         driver.navigate().back();
         Thread.sleep(500);
         driver.navigate().refresh();
         Thread.sleep(5000);
         driver.manage().window().maximize();
         driver.close();
    }
}
