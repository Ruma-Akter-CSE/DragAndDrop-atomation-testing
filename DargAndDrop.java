package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class DargAndDrop {

	public static void main(String[] args) throws InterruptedException{

		
		WebDriver driver=base.getDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		WebElement Drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(1000);

		
		
		
	}

}
