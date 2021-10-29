package starPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
	 {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\YE Admin\\eclipse-workspace\\FirstProject\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='but2'] | // select[@id='drop1']")).click();








}
	}
}