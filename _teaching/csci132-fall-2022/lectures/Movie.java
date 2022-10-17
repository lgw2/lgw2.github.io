package day22;

public class Movie {

	private int year;
	private String name;

	public Movie(String n, int y) {
		year = y;
		name = n;
	}

	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	public String getName() {
		return name;
	}

	public boolean equals(Object other){
		if (other == null) return false;
		if (other.getClass() != getClass()) return false;
		Movie o = (Movie) other;
		return o.getYear() == year && o.getName() == name;

	}

}
