import java.awt.font.NumericShaper.Range;
import java.util.ArrayList;

/**
 * 
 * @author Alan Niemiec
 *
 * A class for calculating the Golden Ratio with phi rounded to power of n
 */
public class GoldenRatio{
	//ArrayList for storing the GoldenRatio number sequence
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	
	public void calculate(int sequenceSize){
		
		//Phi as 
		double phi = 1.618;
		
		for(int x=0; x<=sequenceSize; x++){
			//
			int number = (int)Math.round(Math.pow(phi, x));
			sequence.add(number);
		}
	}
	
	/**
	public void calculate(int first, int second) {
		
		if(first > second)
			eval(first, second);
		else
			eval(second, first);
	}
	
	private void eval(int first, int second){
		//Add first and second number, then divide by the first number which has been determined to be larger
		float ratio = (((float)first+second)/first);
		System.out.printf(first+"+"+second+"/"+first+" = "+"%.3f"+ "\n" , ratio);
	}
	**/
	
	
	/**
	 * Returns the sequence of Golden ratio numbers
	 */
	public ArrayList<Integer> getSequence() {
		return this.sequence;
	}
}
