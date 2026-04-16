package tdd;

public class Game {

	private int score = 0;
	private boolean firstThrow = true;
	private boolean spare = false;
	private int left = 10;
	
	public void roll(int value) {
		
		if(spare) {
			score += value;
			spare = false;
		}
		
		if(!firstThrow && value >= left) {
			
			spare = true;
			
		}
		
		score += value;
		left -= value;
		
		firstThrow = !firstThrow;
		
		if(firstThrow)
			left = 10;
		
	}
	
	public int score() {
		
		return score;
		
	}
	
}
