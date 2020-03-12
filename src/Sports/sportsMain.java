package Sports;
/*
Client ‘main()’ populates your Athlete database by hard-coding data.  (like populateMyZoo())
Client ‘main()’ routine displays all of the common data for each athlete:
 	“Player1: Name: Aaron Judge, Number:99, Team:Yankees”
and all unique data:
“Batting AVG: .314  Home Runs: 34  RBIs: 110”
Compare the players of each sport in at least one attribute (for example)
“In baseball, Aaron Judge has hit the most home runs”

*/

public class sportsMain {
	public static void main(String[] args) {
		player o1 = new player(75, "Vancouver", "Calvin");
		System.out.println(o1.toString());
		tennisPlayer o2 = new tennisPlayer("Wilson", false, "Babolat", 69, "Richland", "Richard");
		System.out.println(o2.toString());
	}
}
