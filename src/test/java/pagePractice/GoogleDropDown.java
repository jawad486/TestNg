package pagePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select select =new Select(driver.findElement(By.name("dropdown-class-example")));
		List <WebElement> options=select.getOptions();
		for(WebElement allOptions:options) {
			System.out.println(allOptions.getText());
			if(allOptions.getText().equalsIgnoreCase("Option3"))
				allOptions.click();
		}
	WebElement ale=	driver.findElement(By.id("alertbtn"));
	ale.click();
	Alert alert=(Alert) driver.switchTo().alert();
 

	}

}
