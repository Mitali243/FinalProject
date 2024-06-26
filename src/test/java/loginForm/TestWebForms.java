package loginForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWebForms {

	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		// Initialize the ChromeDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void testForm()
	{
		// Navigate to the web page containing the form
		driver.get("https://formsmarts.com/form-builder-signup");

		// Fill in the Name field
		WebElement firstName = driver.findElement(By.xpath("//input[@id='fname']"));
        firstName.sendKeys("Mitali");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lname']"));
        lastName.sendKeys("Mittal");
        
		// Fill in the Email field
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("mitalimittal.52@gmail.com");

		 WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
         password.sendKeys("Mitali#A1@123");

         WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confpasswd']"));
         confirmPassword.sendKeys("Mitali#A1@123");
         
      // Select an access pass
 		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='utyp']"));
 		Select dropdown = new Select(dropdownElement);
 		dropdown.selectByVisibleText("Individual");
         
		
		WebElement seconddropdownElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select seconddropdown = new Select(seconddropdownElement);
		seconddropdown.selectByVisibleText("India");

		// Check the newsletter subscription checkbox
		WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@id='tou']"));
		newsletterCheckbox.click();

		// Submit the form
		WebElement submitButton = driver.findElement(By.xpath("//input[@id='submit']"));
		submitButton.click();
	}
	@AfterClass
	public void teardown()
	{
		// Close the browser
		//driver.quit();
	}

}
