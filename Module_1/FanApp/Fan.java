/**
 *  Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *   Modified by Sindhu Gopal Student 2022
*/ 

public class Fan {
	/**
	 * Constants named STOPPED, SLOW, MEDIUM, and FAST with data type int added 
	 * Assigned the values 0, 1, 2,3 for STOPPED, SLOW, MEDIUM, and FAST, respectively for fan speeds 
	*/
	
	public static final int STOPPED = 0;
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST  = 3;
	
	/**
	 * A private int data field created for speed to identify the speed of the fan.
	 * Constants added and default speed set to STOPPED.
	*/
	private int speed = STOPPED;
	
	//A private boolean data field fanOn whether the fan is on or off
	private boolean fanOn = false;
	
	/**
	 * A private double data field named radius indicates the radius of the fan.
	 * The default value is set to 6
	*/
	private double radius = 6;
	
	/**
	 * A private string data field named color indicates the color of the fan.
	 * The default value is set to white
	*/
	private String color = "white";
	
	/**
	 * A no-argument constructor that creates a default fan
	 * Set default values for speed, fanOn, radius and color
	*/
	Fan ()  
	{
		this.speed = STOPPED;
		this.fanOn = false;
		this.radius = 6;
		this.color = "white";
	}
	
	/**
	 * A argument constructor that creates a  fan using the 4 Fields
	 * SThe fields are speed, fanOn, radius and color
	*/
	Fan (int speed, boolean fanOn, double radius, String color) {
		this.speed = speed;
		this.fanOn = fanOn;
		this.radius = radius;
		this.color = color;
	}
	
	//Accessor and mutator methods for speed
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//Accessor and mutator methods for fanon
	public boolean isFanOn() {
		return fanOn;
	}
	public void setFanOn(boolean fanOn) {
		this.fanOn = fanOn;
	}
	
	//Accessor and mutator methods for radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Accessor and mutator methods for color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @override
	 * Override the toString method. Return a string description for the fan.
	 * If the fan is on, the method returns the fan speed, color, and radius in a combined string.
	 * If the fan is not on, the method returns the fan color, radius, and a message of “fan is off” 
	 * in a combined string.
	*/
    public String toString() {
		if(!this.fanOn) { // if fan off then return the bellow message 
			return "The Fan is "+this.color +" with a radius of " + this.radius + " and the fan is off";
		} else {
			return "The Fan speed is set to "+this.speed +" with a color of "+this.color +" and a radius of " + this.radius ;
		}
    }
}//end of fan class

