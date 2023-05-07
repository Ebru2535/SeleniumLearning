package MyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement montıneElementi= driver.findElement(By.id("pid10_thumb"));
        WebElement amsterdamElementi= driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).toLeftOf(montıneElementi));
        System.out.println("amsterdamElementi.getAttribute(\"id\") = " + amsterdamElementi.getAttribute("id"));


    }

}
