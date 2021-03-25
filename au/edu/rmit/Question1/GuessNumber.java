package au.edu.rmit.Question1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber 
{
	/**
	 * Strictly positive integer random number generator.
	 * @param max
	 * @return A random number ranging from 1 to max.
	 */
	static public int posRandNum(int max)
	{
		Random dice = new Random();
		// Rolls a numFaces-sided dice
		return(1 + dice.nextInt(max));
	}
	
	/**
	 * Your main program comes here.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner numInput = new Scanner(System.in);

		
		try
		{
			//TODO: (Question 1.1 and 1.2)
			
			//TODO: Implement your random number guessing code here  
		}
		catch (Exception e)
		{
			System.out.println("An unexpected runtime exception occurred here!");
		}		
		finally
		{
			numInput.close();
		}
	}

}
