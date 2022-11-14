/**
 *      Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 
public class Student {
	
    // Private String variable defined for firstName, lastName, course and grade 
	private String firstName;
	private String lastName;
	private String course;
	private String grade;
	
    // Empty student method 
	public Student () {}
	
    //student method with firstName, lastName, course and grade 
	public Student (String firstName, String lastName, String course, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}
	
    //Get and Set Methods for firstName, lastName, course and grade 
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
	
    // Add firstName, lastName, course and grade converted to string 
	@Override
	 public String toString() {
		return "\"" +this.firstName + "\",\"" + this.lastName + "\",\"" + this.course + "\",\"" + this.grade + "\"";
	}
	
}
