/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

import java.util.ArrayList;
import java.util.Scanner;

//
public class TestExpenseTracker {

	//Design a class named TestExpenseTracker to test the classes Transaction, TransactionIO, and ValidatorIO. 
	public static void main(String[] args) {
		
		//Display a menu to the user matching the format 
		System.out.println("Welcome to the Expense Tracker");
		Scanner scannerObj = null;
		try {
			System.out.println("\n");
			scannerObj = new Scanner(System.in); // Create a Scanner object
			while (true) {
				
				//Use the ValidatorIO static methods to validate the users input. 
				int input = ValidatorIO.getInt(scannerObj, menu());
				
				//If the user selects menu item one, display all the transactions in the expenses.txt file. 
				if (input == 1) {
					System.out.println("\n");
					System.out.println("MONTHLY EXPENSES\n");
					try {
						
						//Invoke the findAll method from the TransactionIO class 
						ArrayList<Transaction> transactions = TransactionIO.findAll();
						
						for (Transaction transaction : transactions) {
							System.out.printf(transaction.toString(), transaction.getAmount());
							System.out.println("\n");
						}
					} catch (Exception e) {
						System.out.println("\n Exception: " + e.getMessage());
					}
				
				// If the user selects menu item two, allow the user to add a new transaction to the expenses.txt file.
				} else if (input == 2) {
					String c = "y";
					ArrayList<Transaction> transactions = new ArrayList<>();
					while (c.equalsIgnoreCase("y")) {
						
						// Use the ValidatorIO static methods for the user prompts
						String description = ValidatorIO.getString(scannerObj, "\n Enter the description: ");
						double amount = ValidatorIO.getDouble(scannerObj, "\n Enter the amount: ");
						transactions.add(new Transaction(description, amount));
						
						//Allow the user to enter as many transactions as they wish by asking them to “Add another transaction.
						c = ValidatorIO.getString(scannerObj, "\n Add another transaction? (y/n): ");
					}
					
					try {
						TransactionIO.bulkInsert(transactions);
					} catch (Exception e) {
						System.out.println("\n Exception: " + e.getMessage());
					}
					
				// If the user selects menu item three, display the total expenses of all transactions in the expenses.txt file.
				} else if (input == 3) {
					try {
						
						// Invoke the findAll method from the TransactionIO class and iterate over
						// the list to get a running total of the transaction amounts.
						ArrayList<Transaction> transactions = TransactionIO.findAll();
						double monthlyExpense = 0;
						for (Transaction transaction : transactions) {
							monthlyExpense += transaction.getAmount();
						}
						System.out.printf("Your total monthly expense is $%6.2f%n", monthlyExpense);
					} catch (Exception e) {
						System.out.println("\n Exception: " + e.getMessage());
					}
				}
				System.out.println("\n");
				
				// Allow the user to stay in the menu by prompting them to continue. 
				// If the user does not wish to continue, exit the program. 
				System.out.print("Continue? (y/n):");
				
				String input3 = scannerObj.next();
				if (input3.equalsIgnoreCase("n")) {
					System.out.println("\n");
					System.out.println("Program terminated by the user...");
					break; // will exit the loop
				}
				System.out.println("\n");
			}
		} finally {
			if (scannerObj != null)
				scannerObj.close();
		}
	}
	
	//Menu Method highlighting the options 
	public static String menu() {
		return "MENU OPTIONS\n  1. View Transactions\n  2. Add Transactions\n  3. View Expense\nPlease choose an option: ";
	}

}
