/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 
public class Team {
	
	//A private string data field named teamName that specifies the teams name.
	// The default is an empty string. 
	private String teamName = "";
	
	//A private string array data field named players that specifies the players assigned to a 	team.
	// The default size is 20
	private String [] players = new String[20];
	
	//A private int data field named playerCount that specifies the number of players on a team.
	//The default is 0.
	private int playerCount = 0;

	//An argument constructor that creates a team using the teamName data field as an argument. 
	Team (String teamName)
	{
		this.teamName = teamName;
	}
	
	//  A public method named addPlayer with a string argument that adds a player to the players data field.
	// a method should increment the playerCount data field, so you are able to use the array’s index to add new players.
	public void addPlayer(String player) {
		players[this.playerCount] = player;
		playerCount++;
	}
	
	// A public string array method named getPlayers that returns the players data field. 	 	
	public String [] getPlayer() {
		return this.players;
	}
	
	//A public int method named getPlayerCount that returns the playerCount data field. 
	public int getPlayerCount() {
		return this.playerCount;
	}
	
	//A public string method named getTeamName that returns the teamName data field. 
	public String getTeamName() {
		return this.teamName;
	}

}// end class Team
