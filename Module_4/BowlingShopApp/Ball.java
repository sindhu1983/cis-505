/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//product subclass named ball to represent a bowling ball.
public class Ball extends Product{
	
	//A private string data field named color that specifies the color of a bowling ball
	//The default is an empty string. 
	private String color = "";
	
	//A no-argument constructor that creates a default ball
	Ball () {
		
	}

	//Accessor and mutator methods for color data fields
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Override the toString() method
	//Return an appended string of the superclass with an additional field for the bowling balls color. 
	@Override
	 public String toString() {
		return super.toString()+ "Color: " + this.color;
	}
}
