/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//superclass named product to represent a product in a bowling shop
public class Product {
	
	//A private string data field named code that specifies the product code. 
	//The default value 	is an empty string
	private String code = "";
	
	//A private string data field named description that specifies the products description
	//The default value is an empty string. 
	private String description = "";
	
	//A private double data field named price that specifies the price of a product
	//The default value is 0. 
	private double price = 0;
	
	//A no-argument constructor that creates a default product. 
	Product (){
		
	}
	
	//Accessor and mutator methods for data fields - code, description and price 	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Override the toString() method.
	//Return a description of the product with all three fields on separate lines.
	@Override
	 public String toString() {
		return "Product Code: " + this.code + "\nDescription: " + this.description + "\nPrice: $%6.2f%n";
	}
}
