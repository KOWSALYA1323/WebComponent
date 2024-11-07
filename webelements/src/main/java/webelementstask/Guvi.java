package webelementstask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Guvi {

	WebDriver driver = new ChromeDriver();

	public void LaunchApp() {
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
	}

	public void SignUp() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);

		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("Admin");
		action.sendKeys(Keys.TAB).sendKeys("kowstest@gmail.com").build().perform();
		action.sendKeys(Keys.TAB).sendKeys("password123").build().perform();
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		driver.findElement(By.id("signup-btn")).click();
		WebElement dropDown = driver.findElement(By.id("profileDrpDwn"));
		Select select = new Select(dropDown);
		select.selectByValue("Working professional in Non-IT");
		driver.findElement(By.xpath("//label[text()='Your degree']")).click();
		driver.findElement(By.id("degreeDrpDwn"));
		select.selectByValue("B.E. / B.Tech. Computer Science");
		driver.findElement(By.id("year")).sendKeys("2018");
		driver.findElement(By.id("details-btn")).click();
		System.out.println("Sign up successfully done");
		driver.quit();

	}

	public void Login() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("kowsalyavelusamybe@gmail.com");
		action.sendKeys(Keys.TAB).sendKeys("Kowsalya@2626").build().perform();
		driver.findElement(By.id("login-btn")).click();
		System.out.println("Login successfully done");

	}

	public static void main(String[] args) throws InterruptedException {
		Guvi G = new Guvi();
		G.LaunchApp();
		G.SignUp();
		G.Login();

	}

}
