package pg.demo;

import Test.BaseClass;

public class coding extends BaseClass {

	public void browserOpen() {
		System.out.println("Hello coding");
		BaseClass.driver.get(prop.getProperty("URL"));
		BaseClass.driver.manage().window().maximize();
	}

}
