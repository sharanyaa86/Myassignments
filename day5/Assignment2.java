package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Create Account")).click();
				
				driver.findElement(By.xpath("//input[@id='accountName']")). sendKeys("Debit Limited Account");
				
				driver.findElement(By.xpath("//textarea[@name='description']")). sendKeys("Selenium Automation Tester");
				
				driver.findElement(By.xpath("//input[@id='groupNameLocal']")). sendKeys("Tester");
				
				driver.findElement(By.xpath("//input[@name='officeSiteName']")). sendKeys("Testleaf");
	
				driver.findElement(By.xpath("//input[@id='annualRevenue']")). sendKeys("500000");
				
				WebElement Industry = driver.findElement(By.name("industryEnumId"));
				Select options = new Select(Industry);
				options.selectByValue("IND_SOFTWARE");
				
				WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
				Select options1 = new Select(Ownership);
				options1.selectByVisibleText("S-Corporation");
				
				WebElement Source = driver.findElement(By.id("dataSourceId"));
				Select options2 = new Select(Source);
				options2.selectByValue("LEAD_EMPLOYEE");
				
				WebElement Campaign = driver.findElement(By.id("marketingCampaignId"));
				Select options3 = new Select(Campaign);
				options3.selectByIndex(6);
				
				WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select options4 = new Select(State);
				options4.selectByValue("TX");
				
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				driver.close();
}}


