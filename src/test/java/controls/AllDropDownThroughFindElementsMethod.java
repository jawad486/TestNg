package controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDropDownThroughFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
	List <WebElement> options = driver.findElements(By.id("option"));
	 for(WebElement allOptions:options) {
		 System.out.println(allOptions.getText());
		 if(allOptions.getText().equalsIgnoreCase("Option 1"))
			 Thread.sleep(3000);
			 allOptions.click();
	 }

	}

}
