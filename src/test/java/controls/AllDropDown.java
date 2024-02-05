package controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
	WebElement alldropDown = driver.findElement(By.id("option"));
	Select select =new Select(alldropDown);
	  List <WebElement> options=select.getOptions();
	  for(WebElement allOptions :options) {
		 // System.out.println(allOptions.getSize());
		  System.out.println(allOptions.getText());
		  if(allOptions.getText().equalsIgnoreCase("Option 3"))
			  allOptions.click();
		  
	  }
	}

}
