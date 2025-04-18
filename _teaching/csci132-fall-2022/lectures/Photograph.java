package day9;

public class Photograph implements Sellable {
	
	private String descript;		// description of this photo
	private int price;				// the price we are setting
	private boolean color;			// true if photo is in color
	
	// constructor
	public Photograph(String desc, int p, boolean c) {
		descript = desc;
		price = p;
		color = c;
	}

	@Override
	public String description() {
		return descript;
	}

	@Override
	public int listPrice() {
		return price;
	}

	@Override
	public int lowestPrice() {
		return price/2;
	}
	
	public boolean isColor() { return color; }

}
