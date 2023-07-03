package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.abhibus.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("Bus")).click();
				
				driver.findElement(By.id("source")).sendKeys("Chennai");
				
				driver.findElement(By.xpath("//li[text()='Chennai']")).click();
				driver.findElement(By.id("destination")).sendKeys("Bangalore");
										
				driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
				
				driver.findElement(By.id("datepicker1")).click();
								
			driver.findElement(By.xpath("//a[text()='1']")).click();
						
			driver.findElement(By.linkText("Search")).click();
			
			WebElement firstbus = driver.findElement(By.xpath("//div[@class='search-column1']/h2[1]"));
			System.out.println("First bus Name: "+firstbus.getText());
			
			driver.findElement(By.id("Bustypes4")).click();
						
			WebElement Busseatcount = driver.findElement(By.xpath("//div[@class='search-column2-col1']/p[1]"));
			System.out.println("Bus seat availabity: "+Busseatcount.getText());
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@style='float:right; margin-top:5px;width:100%']//span[1]")).click();
			
			driver.findElement(By.xpath("//span[@class='pillow'][1]")).click();
			
			Thread.sleep(2000);
		
		
			WebElement Seatnumbers = driver.findElement(By.xpath("//span[@id='seatnos']"));
			System.out.println("Seat number selected: "+Seatnumbers.getText());
			
			Thread.sleep(2000);
			
			WebElement Totalfare = driver.findElement(By.xpath("//span[@id='ticketfare']"));
			System.out.println("Total fare: "+Totalfare.getText());
			Thread.sleep(2000);
				
			Select options = new Select(driver.findElement(By.xpath("//select[@id='boardingpoint_id']")));
			options.selectByValue("374^Sirsuri^09:00 PM^SIPCOT IT GATE^SIPCOT IT GATE,SIPCOT IT GATE^");
			Thread.sleep(2000);
			
			Select options1 = new Select(driver.findElement(By.xpath("//select[@id='droppingpoint_id']")));
			options1.selectByVisibleText("Electronic City Toll Gate-05:07");
			
			String title1 = driver.getTitle();
			System.out.println("" +title1);
			
			Thread.sleep(5000);
			
			driver.close();		
		
	}

}
