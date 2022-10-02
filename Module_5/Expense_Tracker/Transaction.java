/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//Design a class named transaction to represent an expense transaction

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	
	//A private string data field named date that specifies the date of a transaction. 
	// The default value is today’s date formatted as “MM-dd-yyyy”

	private String date = new SimpleDateFormat("<MM-dd-yyyy>").format(new Date());
	
	//A private string data field named description that specifies the description of a transaction
	//The default is an empty string. 
	private String description = "";
	
	//A private double data field named amount that specifies the amount of a transaction. 
	//The default value is 0. 
	private double amount = 0;
	
	//A no-argument constructor that creates a default transaction. 
	Transaction(){};
	
	//An argument constructor that creates a transaction using  data fields. 
	Transaction(String description, double amount){
		this.description = description;
		this.amount = amount;
	}
	
	
	//An argument constructor that creates a transaction using the three data fields. 
	Transaction(String date, String description, double amount){
		this.date = date;
		this.description = description;
		this.amount = amount;
	}
	
	//Accessor and mutator methods for the all three data fields - Date, Description and Amount
	public String getDate() {
		return date;
	}
	
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//Override the toString method.
	//Return a string description of a transaction with all three data fields, on separate lines.
	@Override
	 public String toString() {
		return "Date: " + this.date + "\nDescription: " + this.description + "\nAmount: $%6.2f%n";
	}
}
