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

        //        7. Click 'Signup' button
        driver.findElement(By.xpath("//button[.='Signup']")).click();

//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
      String expectedTitle= "ENTER ACCOUNT INFORMATION";
      WebElement eaiElementi=  driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        System.out.println("eaiElementi.isDisplayed() = " + eaiElementi.isDisplayed());


//        9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender2")).click();
        WebElement passwordButonu=driver.findElement(By.id("password"));
        passwordButonu.sendKeys("12345");
       WebElement dayButonu= driver.findElement(By.id("days"));
       dayButonu.sendKeys("6");
       dayButonu.click();
    WebElement monthsButonu=   driver.findElement(By.id("months"));
    monthsButonu.sendKeys("June");
    monthsButonu.click();
        WebElement yearsButonu=driver.findElement(By.id("years"));
        yearsButonu.sendKeys("2018");
        yearsButonu.click();

//        10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.id("newsletter")).click();
//        11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//label[text()='Receive special offers from our partners!']"));
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
     WebElement firstNameButonu=   driver.findElement(By.id("first_name"));
     firstNameButonu.sendKeys("sukufe");
     firstNameButonu.click();

     WebElement lastnameElement=driver.findElement(By.id("last_name"));
     lastnameElement.sendKeys("al");
     lastnameElement.click();

     WebElement companyElementi=driver.findElement(By.id("company"));
     companyElementi.sendKeys("wisa quarter");
     companyElementi.click();
     WebElement adresElementi=driver.findElement(By.id("address1"));
     adresElementi.sendKeys("");
//        13. Click 'Create Account button'
        driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//        14. Verify that 'ACCOUNT CREATED!' is visible

//        15. Click 'Continue' button
//        16. Verify that 'Logged in as username' is visible
//        17. Click 'Delete Account' button
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
