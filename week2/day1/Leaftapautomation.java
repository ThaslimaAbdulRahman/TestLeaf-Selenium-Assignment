package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftapautomation {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thaslima");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Abdulrahman");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("thas");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("seleniumfield");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i would like to join");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thaslishaaz@gmail.com");
		
		WebElement dd=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option = new Select(dd);
		option.selectByValue("NY");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
		}

}
