package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(@class,'_6luv _52jv')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("hari");
		driver.findElement(By.name("lastname")).sendKeys("krishnan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7708539720");
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		 WebElement birthDay = driver.findElement(By.id("day"));
		 Select dd1=new Select(birthDay);
		 dd1.selectByVisibleText("20");
		 WebElement birthMonth = driver.findElement(By.id("month"));
		 Select dd2=new Select(birthMonth);
		 dd2.selectByVisibleText("jan");
		 WebElement birthYear = driver.findElement(By.id("year"));
		 Select dd3=new Select(birthYear);
		 dd3.selectByVisibleText("2000");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 driver.findElement(By.name("websubmit")).click();
		 
		 
		 
	}
	}


