package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    public static void main(String[] args) throws InterruptedException {
        /*....Exercise-1:...
        Create a new class with main method
                Set Path
                Create a chrome driver
                Maximize window
                Open google home page https://www.google.com
        On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        Wait about 4 sn
        Navigate forward to amazon
        Refresh page
        Close/quit the browser
        And Last step print "All is well" on console

 *////  Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //   Create a chrome driver
        WebDriver driver = new ChromeDriver();
        //   Maximize window
        driver.manage().window().maximize(); // açılan pencereyi maksimum boyota ulaştırdık
        //Open google home page https://www.google.com
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");  //  gideceğimiz adresi belirttik

        // Get ile navigate komutlarıını kullanırken  get  komutu daha
        // hızlı çalıştığı için tercih edilir.
        // Navigate komutu ise daha çok bağımlı durumlarda tercih edilir

        //On the same class, navigate to amazon home page https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        //and navigate back to google
        driver.navigate().back();
        Thread.sleep(4000);

        // Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(2000);

        //  Refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Close/quit the browser
        driver.quit(); // Close dersek son açık  sayfayı kapatır. guit ise tüm sayfaları kapatır.

        // And Last step print "All is well" on console

        System.out.println("All is well");



    }
}
