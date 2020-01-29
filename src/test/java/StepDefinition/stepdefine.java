package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefine 
{
	public static WebDriver driver;
	@Given("^user open TestMeApp$")
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//po = new pageObject(driver);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	@When("^user click signup$")
	public void signup()
	{
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	@When("^user click signin$")
	public void signin()
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	
	@When("^user enter credentials as$")
	public void entercredentials(DataTable dt)
	{
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}
	@When("^enter user name as \"([^\"]*)\"$")
	public void username(String uname)
	{
		driver.findElement(By.name("userName")).sendKeys(uname);
	}
	@When("^enter first name as \"([^\"]*)\"$")
	public void fname(String fname)
	{
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}
	@When("^enter last name as \"([^\"]*)\"$")
	public void Lname(String lname)
	{
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	@When("^enter password as \"([^\"]*)\"$")
	public void password(String pass)
	{
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	@When("^enter confirm password as \"([^\"]*)\"$")
	public void confirmpassword(String cpass)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}
	@When("^user select gender$")
	public void gender()
	{
		List<WebElement> allRadiobuttons=driver.findElements(By.name("gender"));
		//driver.findElement(By.name("gender")).sendKeys(gender);
		allRadiobuttons.get(1).click();
	}
	@When("^enter email as \"([^\"]*)\"$")
	public void email(String email)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
	@When("^enter mobile number as \"([^\"]*)\"$")
	public void mobilenumber(String number)
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(number);
	}
	@When("^dob as \"([^\"]*)\"$")
	public void dob(String dob)
	{
		driver.findElement(By.name("dob")).sendKeys(dob);
	}
	@When("^address as \"([^\"]*)\"$")
	public void address(String address)
	{
		driver.findElement(By.name("address")).sendKeys(address);
	}
	@When("^select security question$")
	public void securityquestion()
	{
		Select s=new Select(driver.findElement(By.name("securityQuestion")));
				s.selectByIndex(2);
		//driver.findElement(By.name("securityQuestion")).sendKeys(question);
	}
	@When("^enter answer as \"([^\"]*)\"$")
	public void answer(String answer)
	{
		driver.findElement(By.name("answer")).sendKeys(answer);
	}
	@Then("^user registered successfully$")
	public void registered()
	{
		driver.findElement(By.name("Submit")).click();
		System.out.println("user registered successfully");
	}
	
	
}
