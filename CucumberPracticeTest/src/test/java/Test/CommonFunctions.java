package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends BaseClass{
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	public void click(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}
	
	public void sendText(WebElement ele,String text) {
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.sendKeys(text);
	}

}
