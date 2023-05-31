package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
			
	ChromeDriver driver=new ChromeDriver(); {
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
    driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thaslima");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Abdul Rahman");
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7305585982");
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ShaziaIjaz");
	
	WebElement dd=driver.findElement(By.xpath("//select[@id='day']"));
	Select date=new Select(dd);
	date.selectByVisibleText("11");
	
	WebElement mm=driver.findElement(By.xpath("//select[@id='month']"));
	Select month=new Select(mm);
	month.selectByVisibleText("Jun");
	
	WebElement yy=driver.findElement(By.xpath("//select[@id='year']"));
	Select year=new Select(yy);
	year.selectByVisibleText("1994");
	
	driver.findElement(By.className("_58mt")).click();  //for choosing female
	driver.findElement(By.name("websubmit")).click();	
	
}
}
}
