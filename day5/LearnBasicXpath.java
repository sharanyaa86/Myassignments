package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://login.salesforce.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")). sendKeys("hari.radhakrishnan@qeagle.com");
				driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("Leaf@1234");
				
				driver.findElement(By.xpath("//input[contains(@id,'Lo')]  ")).click();
				Thread.sleep(5000);
				
				driver.close();
	} }
