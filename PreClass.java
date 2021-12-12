public class PreClass @Test (priority = 6)

public void InvalidSignup() throws InterruptedException {
    //Click on Signup button to open the Signup page
    driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
    Thread.sleep(5000);
    //Test4. Verify user cannot signup with invalid email address
    //5. Input your username on the username field
    driver.findElement(By.id("user_username")).sendKeys("Bunmi13");
    //6. Locate the email address field and Input an email address on the email field
    driver.findElement(By.id("user_email")).sendKeys("mail.com");
    //7. Locate the password field and Input your password on the username field
    driver.findElement(By.id("user_password")).sendKeys("admin13");
    //8. Click on the signup button
    driver.findElement(By.id("submit")).click();
    Thread.sleep(5000);

}
}@Test (priority = 7)
public void BlankDetails() throws InterruptedException {
        //Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //Test6. Verify user cannot signup with either/all of the fields blank
        //5. Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("");
        //7. Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        }

        @Test (priority = 7)
        public void BlankDetails() throws InterruptedException {
        //Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //Test6. Verify user cannot signup with either/all of the fields blank
        //5. Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("");
        //7. Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        }
}
@Test (priority = 3)
public void User1ItemPresent() throws InterruptedException {
        //5. Verify that User1 item is present on the item list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //Test8. Verify that User1 item is present on the item list page
        String expectedUrl = "https://selenium-blog.herokuapp.com/users.7087";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl))
        //Pass
        System.out.println("Correct User1Page");
        else
        //Fail
        System.out.println("Wrong User1Page");
        Thread.sleep(5000);
        }