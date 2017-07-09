/**
 * 
 * @author Alan Niemiec
 *
 *Main Class, creates and starts the Facade
 */
public class Main {

	//Static sequence size for the size of the sequences
	public static int sequenceSize = 25;
	public static void main(String[] args) {
		
		Facade facade = new Facade(sequenceSize);
		facade.start();
	}

}
