package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
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
		
		WebElement stateDropdown=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option = new Select(stateDropdown);
		option.selectByValue("NY");
		Thread.sleep(3000);
		System.out.println(" title is: "+ driver.getTitle());
		driver.findElement(By.name("submitButton")).click();
			
			
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftap_testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shazia");
		
		driver.findElement(By.name("submitButton")).click();
		
	  	
		System.out.println ("Page title is : " + driver.getTitle());	
		
		
		

}
}