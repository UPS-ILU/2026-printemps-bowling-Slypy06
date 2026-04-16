package tdd;

public class Game {

	private int score = 0;
	private boolean firstThrow = true;
	private int bonusrounds = 0;
	private int left = 10;
	private int round = 1;
	
	public void roll(int value) {
		
		if(bonusrounds > 0) {
			score += value;
			bonusrounds--;
		}
		
		if(round <= 10 && value >= left) {
			
			bonusrounds = firstThrow ? 2 : 1;
			firstThrow = false;
			
		}
		
		if(round<=10)
			score += value;
		
		left -= value;
		
		firstThrow = !firstThrow;
		
		if(firstThrow) {
			round++;
			left = 10;
		}
		
	}
	
	public int score() {
		
		return score;
		
	}
	
}
