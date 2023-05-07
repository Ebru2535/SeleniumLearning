package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

//        1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        2. Navigate to url 'http://automationexercise.com/'
        driver.get("http://automationexercise.com/");
//        3. Verify that home page is visible successfully
        String expected = "Automation Exercise";
        String actualTitle = driver.getTitle();
        if (expected.equals(actualTitle))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");


      //        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

     //        5. Verify 'New User Signup!' is visible
        String expectedButtonName = "New User Signup!";
        WebElement elementButton = driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        String textButton = elementButton.getText();

        if (expectedButtonName.equals(textButton))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

//        6. Enter name and email address
        WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
        nameBox.sendKeys("Sukufe");

        WebElement emailBox = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        emailBox.sendKeys("sukufe@gmail.com");
    }
}
