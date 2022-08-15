package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("hari");
	driver.findElement(By.id("lastNameField")).sendKeys("raja");
	driver.findElement(By.className("inputBox")).sendKeys("krishnan");
	driver.findElement(By.className("inputBox")).sendKeys("sankar");
	driver.findElement(By.name("departmentName")).sendKeys("mechanical");
	driver.findElement(By.name("description")).sendKeys("i am hari");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("harikrishnan20012000@gmail.com");
	WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select dd1=new Select(State);
	dd1.selectByVisibleText("new york");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("VIJAY");
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	String tamil=driver.getTitle();
	System.out.println(tamil);
}
	}


