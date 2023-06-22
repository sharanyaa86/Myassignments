package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathish");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600062097");	
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf_Sel");
	Thread.sleep(3000);
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(3000);
	driver.close();
}
}
