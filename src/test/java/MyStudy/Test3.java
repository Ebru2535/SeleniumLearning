package MyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        /*
       1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
       2- Add Element butonuna basin
       3- Delete butonu’nun gorunur oldugunu test edin
       4- Delete tusuna basin
       5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();


     // 2- Add Element butonuna basin
       WebElement deleteKomutu= driver.findElement(By.xpath("//button[@class='added-manually']"));

      //  3- Delete butonu’nun gorunur oldugunu test edin
        System.out.println(deleteKomutu.isDisplayed());

        // 4- Delete tusuna basin
        deleteKomutu.click();

        Thread.sleep(5000);
        //  5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
      WebElement addRemoveElementi= driver.findElement(By.xpath("//h3"));
        System.out.println("Add/Remove Elementi görünür: " +addRemoveElementi.isDisplayed()); // addRemove görünür mü ona bakar
        driver.close();


    }
}
