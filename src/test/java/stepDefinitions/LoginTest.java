package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("user opened the browser and entered the url")
	public void user_opened_the_browser_and_entered_the_url() {
		String url = "https://demo.actitime.com/login.do";
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		String un = "admin";
		String pwd = "manager";
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@When("hits enter button")
	public void hits_enter_button() {
	    driver.findElement(By.id("loginButton")).click();
	}

	@Then("project page should be displayed")
	public void project_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(4000);
	    Assert.assertTrue(driver.getTitle().contains("Enter Time-Track"));
	    driver.quit();
	}
}
