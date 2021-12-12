import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {

    //Import the selenium WebDriver
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. Open your chrome browser
        driver = new ChromeDriver();
        //2. Input your Selenium Demo Page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");
        // Test1. Verify the user input the right url and his on the right webpage
        if (driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com"))
            //Pass
            System.out.println("Correct Webpage");
        else
            //Fail
            System.out.println("Wrong Webpage");
        Thread.sleep(5000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 0)
    public void positiveSignup() throws InterruptedException {
        //Test7. Verify that user is successfully signed up when valid details are inputted
        //5. Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Bunmi46");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("Bunmi46@gmail.com");
        //7. Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("admin46");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 1)
    public void clickUser1Item() throws InterruptedException {
        //9. Click on User1 item on the listpage
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //Test2. Verify that when user clicks on the signup button, the user is directed to the signup page
        String expectedUrl = "https://selenium-blog.herokuapp.com/";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl))
            //Pass
            System.out.println("Correct Webpage");
        else
            //Fail
            System.out.println("Wrong Webpage");
        Thread.sleep(5000);
    }

    @Test (priority = 2)
    public void verifyItem() throws InterruptedException {
        //Test9. Search for an item (using python with selenium) and confirm it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        String expectedPageUrl = "/users/1";
        String actualPageUrl = driver.getCurrentUrl();
        if (actualPageUrl.contains(expectedPageUrl))
            //Pass
            System.out.println("Correct User1Page");
        else
            //Fail
            System.out.println("Wrong User1Page");
        Thread.sleep(5000);
    }

    @Test (priority = 3)
    public void logoutSuccessfully() throws InterruptedException {
        //11. Click on Logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        //Test10. Verify that when the user logout, he/she is directed back to the home page
        String expectedTitle = "AlphaBlog";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contains(actualTitle))
            //Pass
            System.out.println("Correct User1Page");
        else
            //Fail
            System.out.println("Wrong User1Page");
        Thread.sleep(5000);
    }

    @Test (priority = 4)
    public void negativeSignup() throws InterruptedException {
        //Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //Test3. Verify that user cannot signup with username less than 3 characters
        //5. Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Gu");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("Bunmi73@gmail.com");
        //7. Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("admin73");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeBrowser() {
        // Quit the browser
        driver.quit();
    }


}


