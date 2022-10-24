/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

public class FinanceCalculator {

	//Add a private static int with the name MONTHS_IN_YEAR and give it a default value of 12. 
	private static final int MONTHS_IN_YEAR = 12;
	
	FinanceCalculator(){};
	
	//Create a static double method named calculateFutureValue with three parameters: double monthlyPayment, double rate, and int years.
	public static double calculateFutureValue(double monthlyPayment, double rate, int years) {

		//In the body of the method calculate the moths by taking the argument years and multiplying it by the MONTHS_IN_YEAR variable. 
		int months = MONTHS_IN_YEAR * years;

		//Calculate the interest rate by using the formula in Exhibit A.
		//Exhibit A: (1 + rate / 100)
		double interestRate = (1 + rate / 100);

		//Calculate the presentValue by multiplying the monthlyPayment by the number of months variable. 
		double presentValue = months * monthlyPayment;

		//Calculate the futureValue by using the calculation in Exhibit B.
		//Exhibit B: presentValue * (Math.pow(interestRate, months)
		//Return the calculated futureValue
		return presentValue * (Math.pow(interestRate, months));
	}
}
