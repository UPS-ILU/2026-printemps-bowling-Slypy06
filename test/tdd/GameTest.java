package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameTest {

	
	@Test
	void test1() {
		Game g = new Game();
		assertEquals(0, g.score());
	}

}
