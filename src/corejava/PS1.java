package corejava;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;  

public class PS1 extends PS{
	//PS become parent class PS1 become child class.. child class trying to acquire the properties of your parent class  

	@Test
public void testRun()
{
		PS2 ps2 = new PS2(3); //constructor
		int a=3;
	 doThis();// parent class
	System.out.println(ps2.increment());
	System.out.println(ps2.decrement()); 
	//PS3 ps3 = new PS3(3);
	System.out.println(ps2.multiplythree());

}
	

}
