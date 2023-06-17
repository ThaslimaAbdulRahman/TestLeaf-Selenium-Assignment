package week4.day2assignments;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SalesForce {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
		  Set<String> window = driver.getWindowHandles();
		  List<String>w1=new ArrayList<String>(window);	
		  driver.switchTo().window(w1.get(1));
		  
		  driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		  System.out.println("Page title is : " + driver.getTitle());
		  
		  driver.switchTo().window(w1.get(1));
		  driver.close();
		  Thread.sleep(2000);
			
		  driver.switchTo().window(w1.get(0));
		  driver.close();
		  Thread.sleep(1000);
		 

}
}