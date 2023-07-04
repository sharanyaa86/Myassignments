package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
				
				Thread.sleep(2000);
				Alert simple = driver.switchTo().alert();
				String text = simple.getText();
				simple.accept();
				System.out.println(text);
				
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				Alert prompt  = driver.switchTo().alert();
				prompt.sendKeys("Saranya");
				String text1 = prompt.getText();
				System.out.println(text1= "Saranya");
				prompt.accept();
				
				driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
				Alert confirm  = driver.switchTo().alert();
				confirm.dismiss();
				
				driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
				driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
				
				
}}
