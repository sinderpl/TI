import java.util.ArrayList;

/**
 * 
 * @author Alan Niemiec
 *
 * A class for calculating the Golden Ratio
 */
public class GoldenRatio{
	//ArrayList for storing the GoldenRatio number sequence
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	
	//ArrayList for storing the Fibonacci sequence
	private ArrayList<Integer> fib;
	//ArrayList for storing the Fibonacci sequence
	private ArrayList<Integer> luc;
	
	/**
	 * Assigns the Fibonacci and Lucas references to local variables
	 */
	/**public GoldenRatio(ArrayList<Integer> fib , ArrayList<Integer> luc){
		this.fib = fib;
		this.luc = luc;
	}**/
	
	public void calculate(int first, int second) {
		if(first > second)
			eval(first, second);
		else
			eval(second, first);
	}
	
	/**
	 * 
	 * The method calculates the Golden Ratio value
	 * @param first The first (Larger) number of the ratio calculation
	 * @param second The second (Smaller) number of the ratio calculation
	 */
	private void eval(int first, int second){
		//Add first and second number, then divide by the first number which has been determined to be larger
		float ratio = (((float)first+second)/first);
		System.out.printf(first+"+"+second+"/"+first+" = "+"%.3f"+ "\n" , ratio);
	}
	
	
	
	/**
	 * A method of calculating the Golden Ratio between two numbers
	 */

	public ArrayList<Integer> getSequence() {
		return this.sequence;
	}
}
