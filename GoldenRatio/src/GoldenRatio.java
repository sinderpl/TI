import java.awt.font.NumericShaper.Range;
import java.util.ArrayList;

/**
 * 
 * @author Alan Niemiec
 *
 * A class for calculating the Golden Ratio with phi rounded to power of n
 */
public class GoldenRatio implements INumberSequence{
	//ArrayList for storing the GoldenRatio number sequence
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	
	//Phi rounded off to the first three decimals as per the specification
	private final double phi = 1.618;
	
	/**
	 * Calculates the Golden Ratio sequence with seed value of phi= 1.618 multiplied to the power of n
	 * @param sequenceSize the size of the sequence generated
	 */
	public void calculate(int size){
		
		
		
		for(int x=0; x<=size; x++){
			//Creates the number in the sequence based on a formula : phi^x
			//Rounded off to a integer as per the specification
			int number = (int)Math.round(Math.pow(phi, x));
			//Add the number to the storage sequence
			sequence.add(number);
		}
	}
	
	/**
	 * Calculate the Golden Ratio sequence recursively
	 */
	public int calculateRecursively(int size) {
		if(size <= 0)
			return size;
		else{
			int power = calculateRecursively(size-1);
			int number = (int) Math.round(Math.pow(phi, power));
			sequence.add(number);
			return power;
		}
	}
	
	
	/**
	 * Returns the sequence of Golden ratio numbers
	 */
	public ArrayList<Integer> getSequence() {
		return this.sequence;
	}

	
}
