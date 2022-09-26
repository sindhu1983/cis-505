/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 
import java.util.Scanner;

//a class named TestBowlingShopApp to test the Product, Ball, Bag, Shoe, ProductDB, and GenericQueue classes
public class TestBowlingShopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bowling Shop");
		Scanner scannerObj = null;
		try {
			System.out.println("\n");
			scannerObj = new Scanner(System.in); // Create a Scanner object
			
			//Using a while loop iterate over the queue and invoke the dequeue method to display the contents. 
			while (true) {
				
				//A public static method named displayMenu that displays the menu
				displayMenu();
				
				//Allow the user to keep selecting options until “x” is chosen
				String code = scannerObj.next();
				if (code.equalsIgnoreCase("x")) {
					System.out.println("\n");
					System.out.println("End of line...");
					break; // will exit the loop
				} else {
					
					// invoke the getProducts method from the ProductDB class with the user’s entry as the argument
					//Assign the results to a product generic queue named products
					GenericQueue<Product> products = ProductDB.getProducts(code);
					System.out.println("--Product Listing--");
					
					//Use the queues size method in the while loops signature to keep track of your placement in the queue.
					while (products.size()>0) {
						Product product = products.dequeue();
						
						//Use the products toString method to display the results
						System.out.printf(product.toString(), product.getPrice());
						System.out.println("\n");
					}
				}
			}
		} finally {
			if (scannerObj != null)
				scannerObj.close();
		}
	}
	
	public static void displayMenu() {
		
		//Display the menu to the user
		System.out.println("MENU OPTIONS\n  1. <b> Bowling Balls\n  2. <a> Bowling Bags\n  3. <s> Bowling Shoes\n  4. <x> To exit\n");
		System.out.print("Please choose an option: ");
	}

}
