package stepDefinitions;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class Contact_Us_Steps {




     public String generateRandomNumber(int length){
         return RandomStringUtils.randomNumeric(length);
     }

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() throws InterruptedException {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
        Thread.sleep(2000);
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() throws InterruptedException {
       driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN" + generateRandomNumber(5));
       //generates unique first name
        Thread.sleep(2000);
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("AutoLN" + generateRandomNumber(5));
        //generates unique last name
        Thread.sleep(2000);
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("AutoEmail" + generateRandomNumber(10) + "@mail.com");
        Thread.sleep(2000);
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello world " + generateRandomString(20));
        Thread.sleep(2000);
    }



    @When("I enter a specific first name {word}") //if we use{word} it must be a single word without white spaces
    public void i_enter_a_specific_first_name(String firstName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
        Thread.sleep(2000);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
        Thread.sleep(2000);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        Thread.sleep(2000);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(comment);
        Thread.sleep(2000);
    }



    @And("I click on the submit button")
    public void i_click_on_the_submit_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
        Thread.sleep(2000);
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() throws InterruptedException {
        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!" ); //will extract text from webElement
        Thread.sleep(2000);
    }

}