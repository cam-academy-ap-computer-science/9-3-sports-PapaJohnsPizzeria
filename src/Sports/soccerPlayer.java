package Sports;

public class soccerPlayer extends player{
	private String position;
	private int number;
	private int goalsScored;
	
	public soccerPlayer(int height, String h, String n, String p, int num, int gS) {
		super(height, h, n);
		position = p;
		number = num;
		goalsScored = gS;
	}
	public String toString() {
		return super.toString() + " | field position: " + position + " | player number = " + number + " | goals scored = " + goalsScored;
	}
}
