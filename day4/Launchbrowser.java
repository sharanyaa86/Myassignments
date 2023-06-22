package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
		EdgeDriver driver1= new EdgeDriver();
		
		driver1.get("https://www.google.com/");
		driver1.manage().window();
		Thread.sleep(3000);
		driver1.close();
		
	}
}
