package day22;

public class Movie {
	private int year;
	private String name;
	
	public Movie(String name, int y) {
		year = y;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getyear() {
		return year;
	}
	
	
	public boolean equals(Object other) {
		if (other.getClass() != getClass()) return false;
		Movie o = (Movie) other;
		// can compare primitive data type (int) with ==
		// for reference data type (String), use the equals method
		return o.getName().equals(getName()) && o.getyear() == year;
	}

}
