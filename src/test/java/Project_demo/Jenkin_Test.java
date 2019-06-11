package Project_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin_Test {
	WebDriver driver;
  @Test
  
  public void LoginTest() {
	  driver.findElement(By.name("userName")).sendKeys("Manzoor");
	  driver.findElement(By.name("password")).sendKeys("Manzoor");
	  driver.findElement(By.name("login")).click();
	  System.out.println(" tittle after login is : "+driver.getTitle());
  }
  @BeforeTest
  public void beforetest(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  System.out.println("current tittle is :" +driver.getTitle());
  }


@AfterTest
public void aftertest(){
	driver.quit();
}
}

