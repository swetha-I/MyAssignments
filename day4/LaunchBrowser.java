package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
        driver.findElement(By.id("email")).sendKeys("swethaselvaraj20@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		

		Thread.sleep(3000);
		
		
	}

}
