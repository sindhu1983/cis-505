/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

//User prompts are handled through the Scanner class - util.Scanner
import java.util.Scanner;

public class TestSportsTeamApp {

	//Method created to test the Team class
	public static void main(String[] args) {
		
		//Message displayed on console as per expected output 
		System.out.println("  Welcome to the Sports Test App");
				 
		Scanner scannerObj = null;
		
		try {
			// Create a Scanner object
			scannerObj = new Scanner(System.in); 
			
			//Use a while loop to check whether the user wishes to continue
			while (true) {
				System.out.println("\n");
				System.out.print("  Enter a team name:");
				
				//Prompt the user to enter the team and player names and allow users to repeat based on the output requested
				String teamName = scannerObj.nextLine();
				System.out.println("\n");
				Team team = new Team(teamName);
				System.out.print("  Enter the players name: \n     hint: use commas for multiple players; no spaces>:");
				String input2 = scannerObj.nextLine();
				System.out.println("\n");
				
				// Use the Array.split(“,”) method to covert the user entered players string into a string array of players
				String[] players= input2.split(",");
				
				//use a for loop to iterate over the string array of players and invoke the addPlayer method
				for (String player : players) {
					team.addPlayer(player);
				}

				//process to display the “Players on team.”
				System.out.println("  --Team Summary--");
				System.out.println("  Number of players in team: "+team.getPlayerCount());
				StringBuilder sb = new StringBuilder();
				for (String player : team.getPlayer()) {
					if (player!=null) {
						sb.append(player).append(",");
					}
				}
							
				String outputForPlayers = sb.substring(0, sb.length() - 1);
				System.out.println("  Players on team: "+outputForPlayers+",");
				System.out.println("\n");
				System.out.print("  Continue? (y/n):");
				
				String input3 = scannerObj.nextLine();
				if (input3.equalsIgnoreCase("n")) {
					System.out.println("\n");
					System.out.println("  End of line...");
					break; 
				}
			}
		} finally {
			if (scannerObj != null)
				scannerObj.close();
		}

	}

}// end class TestSportsTeamApp 
