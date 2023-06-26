package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {
	private static final WebElement Province = null;

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
				
				WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select options = new Select(Industry);
				options.selectByValue("IND_FINANCE");
				
				WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select options1 = new Select(Ownership);
				options1.selectByValue("OWN_SCORP");
				
				WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select options2 = new Select(State);
				options2.selectByValue("AK");
				Thread.sleep(5000);
				
				driver.close();
				
}}
