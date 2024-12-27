package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch Browser and URL
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String total= driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(" total number of bags is:"+total);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		
		
		String Product1=driver.findElement(By.xpath("//span[text()='Form Plus Compact Formal Office Laptop Bag 15.6\"-17\", 2 Compartments, Luggage Trolley Sleeve, Front Pocket, Premium PU Fabric, Bags, Backpack for Men and Women, College Bag for Boys and Girls']")).getText();
		System.out.println("1st Product Name is:"+ Product1);
		
		
		String amount =driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price: "+amount);

		
        String Title=driver.getTitle();
        System.out.println("The Page Title is:"+ Title);
        
        
       Thread.sleep(2000);
        driver.close();
		
		
		
	}

}
