package pagePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		WebElement alt=driver.findElement(By.xpath("//*[@onclick='alertfunction()']"));
		alt.click();
		 Alert alert = (Alert) driver.switchTo().alert();

	        // Perform actions on the alert
	        System.out.println("Alert Text: " + ((WebElement) alert).getText());
		
		
		

		
	}

}
