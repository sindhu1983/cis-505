/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

// Design a class named ValidatorIO to validate invalid user entries.
import java.util.Scanner;

public class ValidatorIO {
	
	// A static method named getInt with a Scanner argument named sc and a string argument
	// named prompt and an Integer return type. 
	public static int getInt(Scanner sc, String prompt) {
		
		// Add local variables for an Integer named input 
		// Set the input variable to 0
		int input = 0;
		
		// a boolean named isValid.
		// isValid to false
		boolean isValid = false;
		
		// Using a while loop check if isValid is false, display the contents of the prompt variable 
		// to the console
		while(!isValid) {
			System.out.print(prompt);
			
			// use an if…else statement to check for Scanner hasNextInt().
			// For true comparisons, set the input variable to sc.nextInt and isValid to true.
			// For false comparisons, display the message “Error! Invalid integer value.”

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid integer value.\n");
			}
			sc.nextLine();
		}
		return input;
	}
	
	// A static method named getDouble with a Scanner argument named sc and 
	// a string argument named prompt and a double return type. 
	public static double getDouble(Scanner sc, String prompt) {
		
		// Add local variables for a double named input 
		// Set the input variable to 0 a
		double input = 0;
		
		// a boolean named isValid.
		// isValid to false
		boolean isValid = false;
		
		// Using a while loop check if isValid is false, display the contents of the prompt variable 
		// to the console
		while(!isValid) {
			System.out.print(prompt);
			
			// use an if…else statement to check for Scanner hasNextdouble().
			// For true comparisons, set the input variable to sc.nextdouble and isValid to true.
			// For false comparisons, display the message “Error! Invalid integer value.”
			if (sc.hasNextDouble()) {
				input = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid double value.\n");
			}
			sc.nextLine();
		}
		return input;
	}
	
	//A static method named getString with a Scanner argument named sc and a string 
	//argument named prompt and a string return type. 
	public static String getString(Scanner sc, String prompt) {
		
		String input = "";
		
		//Display the prompt message and use sc.next() to capture the user’s inputted value. 
		System.out.print(prompt);
		
		input = sc.next();
		
		//Return the inputted value. 
		return input;
		//return sc.next();
	}

}
