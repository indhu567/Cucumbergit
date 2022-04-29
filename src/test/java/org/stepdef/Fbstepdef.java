package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbstepdef {
	
	WebDriver driver;
	@Given("user is on facebook page on chrome browser")
	public void user_is_on_facebook_page_on_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    WebElement txtusername = driver.findElement(By.id("email"));
	    txtusername.sendKeys("welcome");
	    WebElement txtpassword = driver.findElement(By.id("pass"));
	    txtpassword.sendKeys("12345");
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	    WebElement btnlogin = driver.findElement(By.name("login"));
	    btnlogin.click();
	}

	@Then("user should verify homepage is displayed or not")
	public void user_should_verify_homepage_is_displayed_or_not() {
	   System.out.println("invalid");
	}
}
