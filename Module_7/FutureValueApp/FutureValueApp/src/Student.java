/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/
public class Student {
	
	// String Firstname, lastname , course grade defined as private 
	private String firstName;
	private String lastName;
	private String course;
	private String grade;
	
	// Constructor Student with no parameters passes 
	public Student () {}
	
	//Constructor with firstName. lastName, course and grade 
	public Student (String firstName, String lastName, String course, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}
	
	// setter and getter method for FirstName, LastName , Course and Grade 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	 public String toString() {
		return "\"" +this.firstName + "\",\"" + this.lastName + "\",\"" + this.course + "\",\"" + this.grade + "\"";
	}
	
}
