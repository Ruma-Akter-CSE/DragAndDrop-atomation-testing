package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = base.getDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
	    driver.findElement(By.xpath("//*[@id=\"jc-wdp-close-span\"]")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"column-1\"]")));

		
		WebElement Drag = driver.findElement(By.xpath("//*[@id=\"block-2\"]/h1"));
		WebElement Drop = driver.findElement(By.xpath("//*[@id=\"block-3\"]/h1"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).perform();
		
		Thread.sleep(10000);
		
		//driver.close();

		
		
		
	}

}
