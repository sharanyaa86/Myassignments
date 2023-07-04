package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				Alert prompt  = driver.switchTo().alert();
				prompt.sendKeys("");
				prompt.sendKeys("Saranya");
				String text = prompt.getText();
				System.out.println(text= "Saranya");
				prompt.accept();
				
				
}}

