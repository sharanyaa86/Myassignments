package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathish");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saran");
				
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Tester");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@test.com");
				driver.findElement(By.name("submitButton")).click();
				
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
				
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SaranyaSathish");
				driver.findElement(By.name("submitButton")).click();
				
				String title1 = driver.getTitle();
				System.out.println("" +title1);
				
			
				
				
				
				
}}
