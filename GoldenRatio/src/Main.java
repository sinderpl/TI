/**
 * 
 * @author Alan Niemiec
 *
 *Main Class, creates and starts the Facade
 */
public class Main {

	/**
	 * @param args
	 */
	
	//Fixed value for phi as speciifed
	public static double phi = 1.618;
	public static int sequenceSize = 25;
	public static void main(String[] args) {
		
		Facade facade = new Facade(sequenceSize);
		facade.start();
	}

}
