package pagePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,900)", "");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"courses-iframe\"]")));
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a")).click();
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		
		WebElement hover=driver.findElement(By.id("mousehover"));
		Actions actions=new Actions(driver);
		actions.moveToElement(hover).build().perform();
		
		
		
		
		
		
	}

}
