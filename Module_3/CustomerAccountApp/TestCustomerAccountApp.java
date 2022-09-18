/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

import java.util.Scanner;

//Design a class named TestCustomerAccountApp to test the Account, Customer, and CustomerDB classes: 
public class TestCustomerAccountApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Customer Account App");
		Scanner scannerObj = null;
		try {
			// Create a Scanner object
			scannerObj = new Scanner(System.in);
			System.out.println("\n");
			
			//Prompt the user to enter a customer number between 1007 and 1009. 
			System.out.print("Enter a customer ID:\n  ex: 1007, 1008, 1009>: ");
			int customerId = scannerObj.nextInt();
			//System.out.println("\n");
			
			//Use the input	number to invoke the getCustomer static method
			//Assign the returned value to a variable named customer.
			Customer customer = CustomerDB.getCustomer(customerId);
			
			Account account = new Account();
			
			//Allow the user to continue to select as many options as they choose by prompting 
			//them to decide between continuing or exiting the menu. 
			//Use a do…while loop in your programming logic.
			do {
				System.out.println("\n");
				
				//Display the account menu using the accounts displayMenu method
				account.displayMenu();
				String option = scannerObj.next();
				
				//Handle the user’s selection and invoke the corresponding method.
				if ("b".equalsIgnoreCase(option)) {
					System.out.println("\n");
					System.out.printf("Account balance: $%6.2f%n", account.getBlance());
				} else if ("d".equalsIgnoreCase(option)) {
					System.out.println("\n");
					System.out.print("Enter deposit amount: ");
					double depositAmt = scannerObj.nextDouble();
					account.deposit(depositAmt);
				} else if ("w".equalsIgnoreCase(option)) {
					System.out.println("\n");
					System.out.print("Enter withdraw amount: ");
					double withdrawAmt = scannerObj.nextDouble();
					account.withdraw(withdrawAmt);
				} else {
					System.out.println("\n");
					//For invalid selections, display a message “Error: Invalid Option.”
					System.out.println("Error: Invalid option");
				}
				System.out.print("Continue? (y/n):");
				
				String input3 = scannerObj.next();
				
				//Handle the user’s selection and invoke the corresponding method.
				 if (input3.equalsIgnoreCase("n")) {
					System.out.println("\n");
					
					//After exiting the menu, display the customers details using the customer classes
					//Next, on a separate line, show the customers account balance. 
					System.out.println("--Customer Details--");
					System.out.println(customer);
					System.out.println("\n");
					System.out.printf("Balance as of %s is $%6.2f%n", account.getTransactionDate(),account.getBlance());
					System.out.println("\n");
					System.out.println("End of line...");
					break; // will exit the loop
				} 
			}while (true);
		} finally {
			if (scannerObj != null)
				scannerObj.close();
		}

	}

}
