package starPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YE Admin\\eclipse-workspace\\FirstProject\\drivers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
			
	Dimension d = driver.findElement(By.name("login")).getSize();
	driver.findElement(By.id("email")).sendKeys("jupallypooja@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9948720029");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
    
	}
	
}


