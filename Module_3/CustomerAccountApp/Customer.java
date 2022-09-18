/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 
public class Customer {
	
	//A private string data field named name that specifies the name of a customer. 
	private String name;
	
	//A private string data field named address that specifies the address of a customer
	private String address;
	
	//A private string data field named city that specifies the city of a customer. 
	private String city;
	
	//A private string data field named zip that specifies the zip code of a customer. 
	private String zip;
	
	//A no-argument constructor that creates a default customer.
	Customer() {
		this.name = "Sindhu Gopal";
		this.address = "9617 Avalon DR";
		this.city = "Frisco";
		this.zip = "75035";
	}
	
	//An argument constructor that creates a customer using the four data fields - name, address, city, zip
	Customer(String name, String address, String city, String zip) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.zip = zip;
	}

	//Accessor methods for data field - Name 
	public String getName() {
		return name;
	}

	//Accessor methods for data field - Address
	public String getAddress() {
		return address;
	}

	//Accessor methods for data field - City
	public String getCity() {
		return city;
	}

	//Accessor methods for data field - Zip
	public String getZip() {
		return zip;
	}
	
	//. Override the toString() method. Return a string description for a customer with all four
	// fields, on separate lines
    @Override
	public String toString() {
		return "Name: " +this.name + "\nAddress: " +this.address + "\ncity: " +this.city + "\nzip: " +this.zip;
	}

}//end of class Customer
