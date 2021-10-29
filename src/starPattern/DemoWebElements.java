package starPattern;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class DemoWebElements {
        public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\YE Admin\\eclipse-workspace\\FirstProject\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
driver.findElement(By.linkText("Open a popup window")).click();
driver.findElement(By.linkText("Blogger")).click();
Set<String> windowids = driver.getWindowHandles();   
Iterator<String> itr = windowids.iterator();
String a=null;
while(itr.hasNext()) {
	String windowid = itr.next();
	driver.switchTo().window(windowid);
	if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog. It’s easy and free."))
		
			{
		 a = driver.findElement(By.id("maincontent")).getText();
			}	
}


System.out.println(a);
Thread.sleep(3000);


driver.quit();

}}
