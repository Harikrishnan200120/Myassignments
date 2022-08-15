package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("firstName")).sendKeys("vinoth");
	driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
	driver.findElement(By.linkText("first lead")).click();
	String page=driver.getTitle();
	System.out.println(page);
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.className("inputBox")).click();
	driver.findElement(By.name("submitButton")).click();
	

	}

}
