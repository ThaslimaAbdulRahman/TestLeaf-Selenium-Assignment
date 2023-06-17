package week4.day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 9 pro",Keys.ENTER);
        String text = driver.findElement(By.xpath("//span[text()='44,299']")).getText();
        System.out.println("price" + text);
        
        driver.findElement(By.linkText("(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click();
        
        Set<String> wh = driver.getWindowHandles();
		List<String>w1=new ArrayList<String>(wh);	
		driver.switchTo().window(w1.get(1));
		
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[2]")).getText();
		System.out.println("rating"+text2);

		File scrshot = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/shot.png");  
		FileUtils.copyFile(scrshot, des);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(8000);
		
		String text3 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("subtotal" + text3);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(w1.get(1));
		driver.close();
		Thread.sleep(2000); 
		
		driver.switchTo().window(w1.get(0));
		driver.close();
		Thread.sleep(1000); 
		
	}
}
