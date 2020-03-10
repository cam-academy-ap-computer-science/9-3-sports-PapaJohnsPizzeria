package Sports;

public class player {
	private int heightInch = 70;
	private String hometown = "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch";
	private String name = "Django";
	
	public player(int height, String h, String n) {
		heightInch = height;
		hometown = h;
		name = n;
	}

	public String getHometown() {
		return hometown;
	}

	public String getname() {
		return name;
	}

	public int getHeightInch() {
		return heightInch;
	}
}
