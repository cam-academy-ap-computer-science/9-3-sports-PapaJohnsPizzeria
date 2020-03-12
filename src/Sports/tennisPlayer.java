package Sports;

public class tennisPlayer extends player{
	private String racquetBrand;
	private boolean rightHanded;
	private String shoeBrand;
	
	public tennisPlayer(String racquetBrand, boolean rightHanded, String shoeBrand, int height, String hometown, String name) {
		super(height, hometown, name);
		this.racquetBrand = racquetBrand;
		this.rightHanded = rightHanded;
		this.shoeBrand = shoeBrand;
	}

	public String toString() {
		return super.toString() + " | racquet brand: " + racquetBrand + " | is right handed? = " + rightHanded + " | shoe brand = " + shoeBrand;
	}
}
