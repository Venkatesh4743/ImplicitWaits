package ImplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitWait {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver= new ChromeDriver();
		
		//ONLY BELOW LINE OF SINGLE CODE IS IMPORTANT
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);//THIS ONE 
		
		driver.manage().window().setSize(new Dimension(1000,1000));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("sadhya bandhala");

		
		//driver.findElement(By.id("btn2")).click();

	

}
}