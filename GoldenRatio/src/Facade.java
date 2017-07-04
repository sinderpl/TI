/**
 * 
 * @author Alan Niemiec
 *
 * Facade pattern allowing for the calculation of numerical sequences based on Fibonacci, Lucas and Golden Ratio,
 * mathematical proofs
 */
public class Facade {
	//Sequence Generators
	private Lucas lucas = new Lucas();
	private Fibonacci fibonacci = new Fibonacci();
	private GoldenRatio goldenRatio = new GoldenRatio();
	
	//Size of the sequences generated
	private int sequenceSize;
	
	/**
	 * Constructor for the facade
	 */
	public Facade(int sequenceSize){
		this.sequenceSize = sequenceSize;
	}

	/**
	 * Method used for calculating the sequences
	 */
	public void start(){
		System.out.println("Proofing that the Lucas numbers come closer to the Golden Ratio than the Fibonacci numbers:");
		fibonacci.calculate(sequenceSize);
		System.out.println(fibonacci.getSequence()+ " size: "+ fibonacci.getSequence().size());
		lucas.calculate(sequenceSize);
		System.out.println(lucas.getSequence()+ " size: "+ fibonacci.getSequence().size());
	}
	
	
}
