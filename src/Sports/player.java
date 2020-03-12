package Sports;

public class player {
	private int heightInch;
	private String hometown;
	private String name;
	
	public player(int height, String h, String n) {
		heightInch = height;
		hometown = h;
		name = n;
	}
	
	public String toString() {
		return "height = " + heightInch + " | hometown = " + hometown + " | name = " + name;
	}
}
