/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

public class CustomerDB {
	
	// A public static method named getCustomer with an Integer argument named id 
	// and a 	return type of Customer.
	public static Customer getCustomer (int id) {
		
		/**
		 * Using an if…else if…else if…else statement, compare the argument id data field against
		 *  the values 1007, 1008, and 1009.
		 *  For each match, return a new customer object with unique fields.
		 *   If there are no matches, return a default 		customer object. 
		 */
		if (id == 1007) {
			return new Customer ("Jennifer Patterson", "8400 Grover Ave.", "Bellevue", "68123");
		} else if (id == 1008) {
			return new Customer ("Ryan K", "Elmento Dr", "Rancho Cordova", "95670");
		} else if (id == 1009) {
			return new Customer ("Matt T", "Placer St", "Folsom", "95630");
		} else {
			return new Customer ();
		}
	}

}// End of Class CustomerDB
