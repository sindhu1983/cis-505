/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

public class TestlFanApp {

	public static void main(String[] args) {
		
		//Fan class Object is created to invoke Fan No argument constructor  
		Fan fan1 = new Fan();
		System.out.println(fan1);
		
		//Fan Class object is invoked passing Speed=Medium, Color=Blue, and Radius=8
		Fan fan2 = new Fan(Fan.MEDIUM, true, 8, "BLUE");
		System.out.println(fan2);
	}//end main
}//end TestFanApp
