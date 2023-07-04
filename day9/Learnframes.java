package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				Alert confirm  = driver.switchTo().alert();
				String text = confirm.getText();
				System.out.println(text);
				confirm.accept();
			
				
	}
	
				
}
