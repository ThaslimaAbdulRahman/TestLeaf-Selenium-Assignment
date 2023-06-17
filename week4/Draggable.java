package week4.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	
public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement ddby = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-draggable')]"));
	
		Actions act=new Actions(driver);
		act.dragAndDropBy(ddby,100,50).perform(); 
	   
}
}
