import java.util.ArrayList;

/**
 * 
 * @author Alan Niemiec
 * 
 * Calculates and returns the Fibonacci Sequence up to int size amount of numbers
 * Starts with seeds of F1 = 1 & F2 = 1
 *
 */
public class Fibonacci implements INumberSequence{
	
	//ArrayList stores the number sequence
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	//Keeping track of the previous number in the recursive method
	private int prevNum = 1;
	
	
	/**
	 * 
	 * A method utilising for loops to calculate the Fibonacci sequence up to int size
	 * 
	 */
	public void calculate(int size) {
		//Variables to keep track of the numbers
		//Contain the seed values for the sequence
		int prev = 1;
		int curr = 1;
		//Add the seed values to the sequence array
		sequence.add(prev);
		sequence.add(curr);
		
		GoldenRatio ratio = new GoldenRatio();
		//Take away two from size to limit the amount of numbers generated by including the seed numbers
		for(int x = 1; x<=size-2; x++){
			ratio.calculate(prev, curr);
			//Add the two numbers to create the new number
			int ans = prev + curr;
			//Assign the current number to the previous variable
			prev = curr;
			//Assign the new number to the current variable
			curr = ans;
			//Add the number to the ArrayList
			sequence.add(ans);
		}
	}

	/**
	 * Calculate the Fibonacci sequence recursively
	 */
	public int calculateRecursively(int size) {
		//If true start returning numbers, validates if size is valid
		if(size <= 0){
			//Returns 1 to start the calulation
			return 1;
		}
		else{
			
			//Call the function until size reaches 0 and it starts returning
			int currentNum = calculateRecursively(size - 1);
			
			//Add the previous number and the currently returned number to create the new number
			int newNumber = prevNum + currentNum;
			//Assign the currently returned number to the previous number variable
			prevNum = currentNum;
			//Add the new number to the array
			sequence.add(newNumber);
			//Return the newly created number
			return newNumber;
		}

	}
	
	/**
	 * Returns the number sequence
	 */
	public ArrayList<Integer> getSequence() {
		return sequence;
	}
}
