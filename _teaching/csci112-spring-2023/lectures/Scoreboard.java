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
	
	public GameEntry remove(int i) {
		if (i < 0 || i > numEntries) {
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		}
		GameEntry temp = board[i];
		// TODO: move the board entries up
		board[numEntries - 1] = null;
		numEntries--;
		return temp;
	}
	
	public void printTop() {
		System.out.println(board[0]);
	}
	
	public String toString() {
		String toReturn = "";
		for (int i = 0; i < numEntries; i++) {
			toReturn += board[i].toString() + " ";
		}
		return toReturn;
	}

}