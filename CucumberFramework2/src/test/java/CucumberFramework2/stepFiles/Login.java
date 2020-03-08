package CucumberFramework2.stepFiles;

import java.util.concurrentTimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Login {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\artur\\OneDrive\\Dokumenty\\CucumberFramework\\UBS\\CucumberFramework2\\src\\test\\java\\CucumberFramework2\\resources\\chromedriver.exe")
	    this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() throws Interrrupted Exception{
		Thread.sleep(3000);
		this.driver.manage(deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User navigets to ubs website$")
	public void user_navigets_to_ubs_website() throws Throwable {
		driver.get("https://www.ubs.com/global/en.html");
    
	}
	
	@And("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		//a[text()='UBS logins']
		driver.findElement(By.xpath("//a[text()='UBS logins']")).click();	
		
		
	}
	
	@And("^User clicks on the type of login")
	public void user_clicks_on_the_type_of_login() throws Throwable {
		//a[text()='US login account login']
		driver.findElement(By.xpath("//*[@id=\"menulabel-9338\"]")).click();
	
	}
			
	
	@And("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("arturmroz");
				
		
	}
	
	@And("^User enters a invalid username$")
	public void user_enters_a_invalid_username() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("xyz");
	
	@And("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("umniedziala");
		
	}
	
	@And("^User enters a invalid password$")
	public void user_enters_a_invalid_password() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("xyz");
		
	}
	
	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}
	
	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement Error = driver.findElement(By.xpath("//a[contains(test(), 'not match')]"));
		Assert.assertEquals(false, Error.isDisplayer());	
		
	}
	
	@Then("^User should be taken to the unsuccessful login page$")
	public void user_should_be_taken_to_the_unsuccessful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement Error = driver.findElement(By.xpath("//a[contains(test(), 'not match')]"));
		Assert.assertEquals(true, Error.isDisplayer());
		
	}
		
}
	
