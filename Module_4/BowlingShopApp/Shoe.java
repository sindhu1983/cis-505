/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//a product subclass named shoe to represent bowling shoes
public class Shoe extends Product{
	
	//A private double data field named size that specifies the shoe size.
	//The default is 0
	private double size = 0;
	
	//A no-argument constructor that creates a default shoe.
	Shoe(){
		
	}

	//Accessor and mutator methods for the size data field
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	};
	
	//Override the toString() method. 
	//Return an appended string of the superclass with an additional field for the shoe size
	@Override
	 public String toString() {
		return super.toString()+ "Size: " + this.size;
	}

}
