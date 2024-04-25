package test12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Exception {
		System.out.println("pranitha");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
driver.manage().window().maximize();
Thread.sleep(2000);
//driver.findElement(By.id("alertBox")).click();
driver.findElement(By.cssSelector("#alertBox")).click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
alert.accept();

	
	}

}
