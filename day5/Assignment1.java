package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://en-gb.facebook.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
								
				driver.findElement(By.linkText("Create new account")).click();
				driver.findElement(By.name("firstname")).sendKeys("Saranya");
				driver.findElement(By.name("lastname")).sendKeys("Sathish");
				driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("9600062097");
				driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("test1");
				 
				WebElement Day = driver.findElement(By.id("day"));
				Select options = new Select(Day);
				options.selectByValue("16");
				
				WebElement month = driver.findElement(By.id("month"));
				Select options1 = new Select(month);
				options1.selectByValue("1");
				
				WebElement year = driver.findElement(By.name("birthday_year"));
				Select options2 = new Select(year);
				options2.selectByValue("1986");
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				Thread.sleep(5000);
				
				driver.close();		
			
	}
}
