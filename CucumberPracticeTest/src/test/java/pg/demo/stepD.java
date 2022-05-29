package pg.demo;

import org.openqa.selenium.support.PageFactory;

import PageObjects.poFile;
import Test.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepD extends BaseClass{
	
	poFile pf=PageFactory.initElements(BaseClass.driver, poFile.class);
	
	@Given("^user logs into app$")
	public void user_logs_into_app() throws Exception {
	    browserOpen();
	    //Thread.sleep(5000);
	    pf.clickLoginIcon();
	    pf.enterUserName("live20@dispostable.com");
	    //pf.enterPassword("gaana@12345");
	        
	}

	@Then("^user verifies the page$")
	public void user_verifies_the_page() throws Exception {
	    System.out.println("Hello");
	}
	
	@Given("^user logs into app2$")
	public void user_logs_into_app2() throws Exception {
		browserOpen();
	   // Thread.sleep(5000);
	    pf.clickLoginIcon();
	    pf.enterUserName("live20@dispostable.com");
	    //pf.enterPassword("gaana@12345");
	    
	    
	}

	@Then("^user verifies the page2$")
	public void user_verifies_the_page2() throws Exception {
	    System.out.println("Hello");
	}

}
