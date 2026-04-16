package tdd;

public class Game {

	private int score = 0;
	private boolean firstThrow = true;
	private int bonusrounds = 0;
	private int left = 10;
	
	public void roll(int value) {
		
		if(bonusrounds > 0) {
			score += value;
			bonusrounds--;
		}
		
		if(value >= left) {
			
			bonusrounds = firstThrow ? 2 : 1;
			
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
