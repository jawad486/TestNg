package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
	WebElement dropDown = driver.findElement(By.id("option"));
	Select select =new Select(dropDown);
	//
	select.selectByVisibleText("Option 3");
    Thread.sleep(5000);	
	select.deselectByVisibleText("Option 3");
	
	driver.close();
     System.out.println("Testing done");
	}

}
