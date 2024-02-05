package pagePractice;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * Select select=new
		 * Select(driver.findElement(By.id("dropdown-class-example")));
		 * //select.selectByIndex(2); //select.selectByVisibleText("Option3");
		 * select.selectByValue("option1");
		 */
		
		//how to get all the options from the dropDown
		// through getOptions();
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for(WebElement allOptions:options) {
			
			System.out.println(allOptions.getText());
			if(allOptions.getText().equalsIgnoreCase("Option3"))
				allOptions.click();
		}
		
		/*
		 * File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcFile,
		 * "/Selenium/src/main/java/TakeScreenShots/photo.png");
		 */
		
		
	}

}
