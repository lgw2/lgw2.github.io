package day9;

public class Otter extends Animal {
	
	private double whiskerLength;
	
	public Otter(String n, int i, int a, int w, double wL) {
		super(n, i, a, w);
		whiskerLength = wL;
		
	}

	public String sound() {
		// Otter sounds: https://www.youtube.com/watch?v=H3K12I1iDAQ
		return "Chrip, squeak, waaa, hmmm";
	}
	
	public double getWhiskerLength() {
		return whiskerLength;
	}

}
