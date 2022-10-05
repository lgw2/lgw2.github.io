package day16;

public class GameEntry {
	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	
	public static GameEntry getGameEntry(String n, int s) {
		GameEntry x = new GameEntry(n, s);
		return x;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}
