package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.BaseClass;
import Test.CommonFunctions;

public class poFile extends CommonFunctions {

	@FindBy(xpath = "//button[text()='Log In / Sign Up']")
	public WebElement btnLogin;

	@FindBy(xpath = "//input[@id='login_id']")
	public WebElement txtEmailId;

	@FindBy(xpath = "//input[@id='login_pw']']")
	public WebElement txtPwd;

	public void clickLoginIcon() {
		click(btnLogin);
	}

	public void enterUserName(String email) {
		sendText(txtEmailId, email);
	}

	public void enterPassword(String pwd) {
		sendText(txtPwd, pwd);
	}

}
