package Sports;

public class tennisPlayer extends player{
	private String racquetBrand = "Babolat";
	private boolean rightHanded = true;
	private String shoeBrand = "Yonex";
	
	public tennisPlayer(String racquetBrand, boolean rightHanded, String shoeBrand, int height, String hometown, String name) {
		super(height, hometown, name);
		this.racquetBrand = racquetBrand;
		this.rightHanded = rightHanded;
		this.shoeBrand = shoeBrand;
	}

	public String getRacquetBrand() {
		return racquetBrand;
	}

	public boolean isRightHanded() {
		return rightHanded;
	}

	public String getShoeBrand() {
		return shoeBrand;
	}
	
	public String getEverythingTennisPlayer() {
		return "[Name = " + name + " | Height in inches = " + heightInch + " | Hometown = "
				+ " 
	}
}
