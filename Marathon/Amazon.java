package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
				driver.findElement(By.xpath("//div[contains(text(),'bags')]/span[contains(text(),'for boys')]")).click();
				
				String Totalresults = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
				System.out.println("Total search results:" +Totalresults);
				
				driver.findElement(By.xpath("//div[@id='brandsRefinements']//i[1]")).click();
				driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
				driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
				String Results = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
				
				System.out.println(Results);
				
				String Price = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary'][1]")).getText();
				System.out.println(Price);
				
				String title1 = driver.getTitle();
				System.out.println("" +title1);
				
				Thread.sleep(5000);
				
				driver.close();		
							
				
	}
	
}