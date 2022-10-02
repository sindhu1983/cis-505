/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Design a class named TransactionIO for reading and writing transactions to a text file
public class TransactionIO {
	
	// A private string constant data field named FILE_NAME
	// The default value is “expenses.txt” 
	private static final String FILE_NAME = "expenses.txt";
	
	// A private File data field name file.
	// The default value is a new File instance
	// Use the 	FILE_NAME constant as the argument for the new file instance.
	private static File file = new File(FILE_NAME);
	
	// A public static method named bulkInsert with an ArrayList<Transaction> argument
	// named transactions and a return type of void.
	//Give the signature of this method a “throws IOException.” 
	public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException{
		
		// In the body of the function, create a new PrintWriter variable 	named output 
		// set the default value to null.
		PrintWriter output = null;
		
		//Using an if…else statement, check if the file exists. 
		if (file.exists()) {
			
			//For true comparisons, assign a new PrintOutStream to the output variable. 
			output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
		} else {
			
			//For false comparison, set output to a new PrintWriter instance.
			//Use the FILE_NAME constant as the PrintWriter instances argument
			output = new PrintWriter(FILE_NAME);
		}
		
		//Finally, iterate over the transactions argument and write the objects to the file using the output.
		// print and output.println() methods. 
		for (Transaction tran : transactions) {
			output.print(tran.getDate()+" ");
			output.print(tran.getDescription()+" ");
			output.println(tran.getAmount());
		}
		output.close();
	}
	
	// A public static method named findAll with a return type of ArrayList<Transaction>
	// Give the signature of this method a “throws IOException.” 
	public static ArrayList<Transaction> findAll() throws IOException{
		
		// open the expenses.txt file, iterate over the lines, and return an ArrayList of transactions
		ArrayList<Transaction> transactions = new ArrayList<>();
		
		// Invoke Scanner input = new Scanner(file) to open the expenses.txt file
		try(Scanner input = new Scanner(file);) {
			
			// Use while (input.hasNext()) to iterate over the file and assign the data fields 
			// to a new instance of a transaction object.
			//Add this object to an ArrayList of transactions and return it. 
			while(input.hasNext()) {
				String line = input.nextLine();
				String[] lineFieldsArr= line.split("\\s");
				transactions.add(new Transaction(lineFieldsArr[0], lineFieldsArr[1], Double.parseDouble(lineFieldsArr[2])));
			}
		}
		return transactions;
	}
}
