package Sports;

public class basketballPlayer extends player{
	private int numWins;
	private double shoeSize;
	private String sponsor;
	
	public basketballPlayer(int height, String h, String n, int nW, double sS, String s) {
		super(height, h, n);
		numWins = nW;
		shoeSize = sS;
		sponsor = s;
	}
	public String toString() {
		return super.toString() + "\nnumber of wins: " + numWins + "\nshoe size = " + shoeSize + "\nsponsor = " + sponsor;
	}
}
