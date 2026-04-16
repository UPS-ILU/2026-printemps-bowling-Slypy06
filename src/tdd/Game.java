package tdd;

public class Game {

	private int score = 0;
	
	public void roll(int value) {
		
		score += value;
		
	}
	
	public int score() {
		
		return score;
		
	}
	
}
