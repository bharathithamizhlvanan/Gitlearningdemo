package corejava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	//methods,variables
   //Inheritance means you can acquire properties of your parent class
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("run me first");  
	}
	
	
	public void doThis()
	{
    System.out.println("I am here");  
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("run me last");  
	}
}
