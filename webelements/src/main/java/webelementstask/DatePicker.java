package webelementstask;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	WebDriver driver=new ChromeDriver();
	
	public void LaunchApp()
	{
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
	}
	public void doDatePicker() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		Thread.sleep(3000);
		
		WebElement datepickerelements= driver.findElement(By.xpath("//tbody/tr[4]/td[1]"));
		datepickerelements.click();
		System.out.println("The selected date is " +datepickerelements.getText());
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		DatePicker DP = new DatePicker();
		DP.LaunchApp();
		DP.doDatePicker();
		
		
		
		

	}

}
