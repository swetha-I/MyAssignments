package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//OpenURL
		driver.get("https://www.pvrcinemas.com/");
		//Select City
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//span[@id='city']/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//ul[@id='city_list']/li")).click();
		
		//Select Cinema
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall, OMR, Chennai')]")).click();
		
		//Select Date,Time,Movie and book
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='MAX'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'06:25 PM')]")).click();
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span")).click();
	    
		//Accept popup
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|G:8']")).click();
		
		//Select seats,Amount and print
		String seat= driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		System.out.println("Selected Seats is:"+seat);
		
		String Amount=driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("The Grand Total is:"+Amount);
		
		//proceed button
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();

        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
        
		//Title
        String Title=driver.getTitle();
        System.out.println("The Page Title is:"+ Title);
        
        //Close
       Thread.sleep(2000);
        driver.close();
	}

}
