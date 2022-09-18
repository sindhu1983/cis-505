/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//Date and SimpleDateFormat classes will be imported from java.util and java.text 
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	
	// A private double data field named balance. The default is 200
	private double balance = 200;
	
	// An accessor method for the balance data field. 
	public double getBlance() {
		return this.balance;
	}
	
	// A public method named deposit with a double argument named amt
	// return type of void.
	public void deposit(double amt) {
		
		// Increase the running total of the balance data field using the methods argument (amt)
		this.balance = this.balance + amt;
	}
	
	// A public method named withdraw with a double argument named amt
	// Return type of void
	public void withdraw(double amt) {
		
		// If the balance data field is greater than or equal to the argument (amt)
		// Decrease the running total of the balance field using the methods argument. 
		if (this.balance >= amt) {
			this.balance = this.balance - amt;
		}
	}
	
	// A public method named displayMenu with a return type of void
	public void displayMenu() {
		
		//Print Menu as per assignment 
		System.out.print("Account Menu\nEnter <D/d> for deposit\nEnter <W/w> for withdraw\nEnter <B/b> for balance\n Enter option>:");
	}
	
	// A public method named getTransactionDate with a return type of string
	// Return a date using the format MM-dd-yyyy. 
	public String getTransactionDate() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String todayStr = sdf.format(today);
		return todayStr;
	}

}//End of Class Account
