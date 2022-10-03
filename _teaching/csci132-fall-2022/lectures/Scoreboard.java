package day16;

public class Scoreboard {
	private int numEntries;
	private GameEntry[] board;
	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}
	
	public void add(GameEntry e) {
		int newScore = e.getScore();
		// is the new entry e really a high score?
		if (numEntries < board.length || 
				newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length) {
				numEntries++;
			}
			int j = numEntries - 1;
			while (j > 0 && board[j-1].getScore() < newScore) {
				board[j] = board[j-1];
				j--;
			}
			board[j] = e;
		}
	}
	
	public void printTop() {
		System.out.println(board[0]);
	}
	
	public static void main(String[] args) {
		Scoreboard s = new Scoreboard(2);
		GameEntry n = new GameEntry("Bob", 100);
		s.add(n);
		n = new GameEntry("Sally", 101);
		s.add(n);
		s.printTop();
	}

}
