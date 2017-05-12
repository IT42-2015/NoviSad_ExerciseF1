import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_isStrike() {
		Frame fr = new Frame(10,0);
		boolean provera = fr.isStrike();
		
		assertEquals("Greska",true,provera);			
	}
	
	@Test
	public void test_isSpare(){
		Frame fr = new Frame(8,2);
		boolean provera = fr.isSpare();
		
		assertEquals("Greska",true,provera);
	}

}
