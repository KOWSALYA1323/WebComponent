package webelementstask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	WebDriver driver=new ChromeDriver();
	
	public void LaunchApp()
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	public void dragAnddrop() 
	{

		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(frameElement);
		WebElement source = driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement destination = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-header')]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
	}

	public static void main(String[] args)  {
		DragAndDrop DD = new DragAndDrop();
		DD.LaunchApp();
		DD.dragAnddrop();
		System.out.println("The Image Successfully Dropped");

	}

}
