package day11;

public class ProgressionDemo {

	public static void main(String[] args) {
		
		Progression prog = new ArithmeticProgression(4, 4);
		prog.printProgression(5);
		prog = new GeometricProgression(4, 4);
		prog.printProgression(5);
		prog = new FibonacciProgression(1, 1);
		prog.printProgression(10);

	}

}
