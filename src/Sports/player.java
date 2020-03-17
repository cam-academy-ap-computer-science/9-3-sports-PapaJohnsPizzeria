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
		return "height = " + heightInch + "\nhometown = " + hometown + "\nname = " + name;
	}
	
	private String lineMain = "| name = \"" + name;
	private String line1 = "| hometown = \"" + hometown;
	private String line2 = "| heightInch = \"" + heightInch;
	private int dashLength;
	
	private void printDash() {
		System.out.print("*");
		for(int i = 0; i <= dashLength; i++) {
			System.out.print("-");
		}
		System.out.println("*");
	}
	
	private void printMiddleDash() {
		System.out.print("|");
		for(int i = 0; i <= dashLength; i++) {
			System.out.print("-");
		}
		System.out.println("|");
	}
	
	public void dataBoard() {
		if((lineMain.length() > line1.length()) && (lineMain.length() > line2.length())) {
			dashLength = lineMain.length();
		} else if((line1.length() > lineMain.length()) && (line1.length() > line2.length())) {
			dashLength = line1.length();
		} else if((line2.length() > line1.length()) && (line2.length() > lineMain.length())) {
			dashLength = line2.length();
		}
		
		printDash();
		System.out.println(lineMain);
		printMiddleDash();
		System.out.println(line1);
		System.out.println(line2);
		printDash();
		
	}
}
