import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Thread;
import java.util.Random;

public class Test extends Thread implements Runnable {

	// Set the random seed
	Random rand = new Random();
	// Create a random value between 1 and 10,000
	int randval = rand.nextInt(10000)+1;
	
	// Initialize the thread count
	int threadcount = 0;
	
	// Set the maximum number of threads needed
	int maxthreads = 500;
	// Create an array for the factors to be stored into
	ArrayList<Integer> factors = new ArrayList<Integer>();
	
	// Create the hashmap for storage of the array of factors
	public HashMap<Integer, ArrayList<Integer>> Storage = new HashMap<Integer, ArrayList<Integer>>();
	
	
	
	public void factorize()
	{
	
		for (int i = 0; i < factors.size(); i++){
			int x = randval;
			
			int modnum = x;
			
			int result = x % modnum;
			
			
			if (result == 0)
			{
			factors.add(modnum);
			modnum--;
			}
			else 
			{
				modnum--;
			}
		}
		
	}
	
	
	public void printA()
	{
		for (int i = 0; i < factors.size(); i++)
		{
			System.out.print(factors.toString());
		}
	}
	
	public Test(){};



public static void main(String[] args) {
	Test t = new Test();
	printA();

}
}
