import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {
	
	//The limit on the sequenc size
	int sequenceSize = 25;
	//Instance of the main method
	Main Main = new Main();

	@Test
	public void testSequenceSize() {
		//Tests whether the sequence integer is smaller than 25
		//and whether it is a positive unsinged integer
		assertTrue(Main.sequenceSize <= this.sequenceSize && Main.sequenceSize >= 1);
	}

}
