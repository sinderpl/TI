import java.util.ArrayList;

/**
 * 
 * @author Alan Niemiec
 * 
 * Calculates and returns the Fibonacci Sequence up to n amount of numbers
 *
 */
public class Fibonacci implements INumberSequence{
	
	//ArrayList stores the number sequence
	public ArrayList<Integer> sequence = new ArrayList<Integer>();
	//Keeping track of the previous number in the recursive method
	public int prevNum = 0;
	
	
	/**
	 * 
	 * A method utilising for loops to calculate the Fibonacci sequence up to int size
	 * 
	 */
	public void calculate(int size) {
		//Variables to keep track of the numbers
		int prev = 0;
		int curr = 1;
		
		//Simple for loop 
		for(int x = 1; x<=size; x++){
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
}
