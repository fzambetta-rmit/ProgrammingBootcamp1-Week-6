package au.edu.rmit.Question2_3;

import java.util.Arrays;

public class GameCharGenModel implements GameCharCapabilities
{
	static public int NUM_CHARS_BLOCK = 500;
	
	private int gameCharCount=0;
	private GameCharacter[] randomGameChars = new GameCharacter[NUM_CHARS_BLOCK];
	
	/**
	 * Adds a character to the array of characters
	 * @param c character to be added
	 */
	public void addGameCharacter(GameCharacter c)
	{
		if (gameCharCount>=randomGameChars.length)
		{
			GameCharacter[] newRandomChars = Arrays.copyOf(randomGameChars,randomGameChars.length+GameCharGenModel.NUM_CHARS_BLOCK);
			randomGameChars = newRandomChars;
		}
			
		randomGameChars[gameCharCount] = c;
		gameCharCount++;
	}
	
	/**
	 * Returns a character at a given index
	 * @param idx Provided index
	 * @return Character at a given index
	 */
	public GameCharacter gameCharacterAt(int idx)
	{
		if (idx<0 || idx>=randomGameChars.length)
			throw new IndexOutOfBoundsException();
		
		return randomGameChars[idx];
	}
	
	/**
	 * Finds a character with either maximum strength, intelligence or wisdom based on the parameter passed.
	 * @param s 
	 * @returnnIndex of the character with either maximum strength, intelligence or wisdom in the character array.
	 * @throws NoGameCharacterFoundException
	 */
	public int findGameCharacter(GameCharCapabilities.Attribute attribute) throws NoGameCharacterFoundException
	{
		//TODO: (Question 3.1)
		int idx=0;
		
		//TODO: If no character found, throw NoCharacterFoundException
		
		switch(attribute)
		{
			case STRENGTH:
					// TODO: Find strongest character
				break;
				
			case INTELLIGENCE:
					// TODO: Find most intelligent character character
				break;
				
			case WISDOM:
					// TODO: Find wisest character
				break;
				
			default:
				throw new IllegalArgumentException("Illegal argument value!");	
		}
		
		return idx;
	}
	
	/**
	 * Find the "average" character.
	 * @return Index of the average character in the characters array.
	 * @throws NoGameCharacterFoundException
	 */
	public int findGameCharacterNearestToAverage() throws NoGameCharacterFoundException
	{
		//TODO: (Question 3.2)
		int idx = 0;
		
		//TODO: If no character found, throw NoCharacterFoundException
		
		//TODO: Find "average" character
		
		return idx;
	}

}
