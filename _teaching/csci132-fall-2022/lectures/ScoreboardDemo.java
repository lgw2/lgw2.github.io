package day16;

public class ScoreboardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scoreboard s = new Scoreboard(7);
		GameEntry n = new GameEntry("Mike", 1105);
		s.add(n);
		n = new GameEntry("Rob", 750);
		s.add(n);
		
		s.add(new GameEntry("Paul", 720));
		s.add(new GameEntry("Anna", 660));

				
		s.add(new GameEntry("Jill", 740));

		
		System.out.println("At end:");
		System.out.println(s);

	}

}
