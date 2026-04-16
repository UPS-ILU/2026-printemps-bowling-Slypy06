package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameTest {

	
	@Test
	void test1() {
		Game g = new Game();
		assertEquals(0, g.score());
	}
	
	@Test
	void test2() {
		Game g = new Game();
		rolls(g, 20, 0);
		assertEquals(0, g.score());
	}
	
	@Test
	void test3() {
		Game g = new Game();
		rolls(g, 20, 1);
		assertEquals(20, g.score());
	}
	
	@Test
	void test4() {
		Game g = new Game();
		rolls(g, 10, 1);
		rolls(g, 10, 2);
		assertEquals(30, g.score());
	}
	
	@Test
	void test5() {
		Game g = new Game();
		g.roll(7);
		g.roll(3);
		g.roll(4);
		rolls(g, 17, 0);
		assertEquals(18, g.score());
	}
	
	private void rolls(Game g, int nb, int value) {
		
		for(int i = 0; i < nb; i++) {
			
			g.roll(value);
			
		}
		
	}

}
