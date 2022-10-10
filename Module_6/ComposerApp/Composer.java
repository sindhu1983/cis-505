/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

public class Composer {
	
	//A private integer data field named id
	//The default is set to Zero
	private Integer id = 0;
	
	//A private string data field named name. 
	//The default is an empty string.
	private String name = " ";
	
	//A private string data field named genre. 
	//The default is an empty string.
	private String genre = " ";
	
	//A no-argument constructor that creates a default composer.
	Composer(){};
	
	//An argument constructor that creates a composer using all three data fields.
	Composer(int id, String name, String genre){
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	//Accessor methods for all three data fields - id, Name and Genre. 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//Override the toString method
	//Return a string description of a composer with all three data fields, on separate lines.
	@Override
	 public String toString() {
		return "ID: " + this.id + "\nName: " + this.name + "\nGenre: "+this.genre;
	}

}
