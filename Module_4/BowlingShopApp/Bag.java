/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

// product subclass named bag to represent a bowling bag
public class Bag extends Product {
	
	//A private string data field named type that specifies the number of bowling balls the bag can hold
	//The default is an empty string
	private String type = "";
	
	//A no-argument constructor that creates a default bag.
	Bag(){
		
	}

	//Accessor and mutator methods for the type data field
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//Override the toString() method. 
	//Return an appended string of the superclass with an additional field for the bags type.
	@Override
	 public String toString() {
		return super.toString()+ "Type: " + this.type;
	}
}
