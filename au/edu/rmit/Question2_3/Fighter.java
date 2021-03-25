package au.edu.rmit.Question2_3;

public class Fighter extends GameCharacter 
{
	private static int FIGHTER_MAX_HP =10; 
	@Override
	public void randGen(boolean areHitPointsMaxed) 
	{	
		// HitPoints
		if (areHitPointsMaxed)
			this.hitPoints = FIGHTER_MAX_HP;
		else
			hitPoints = rollDice(10);
		
		// STR, INT, WIS
		strength = rollDice(6) + rollDice(6) + rollDice(6) + 1;
		intelligence = rollDice(6) + rollDice(6) + rollDice(6);
		wisdom = rollDice(6) + rollDice(6) + rollDice(6);
		
		int i,j;
		i = rollDice(GameCharacter.howManyNames)-1;
		j = rollDice(GameCharacter.howManyNames)-1;
		name = randomNames[i][j];
	}
	
	@Override
	public void display()
	{
		System.out.println("Class:"+ "\t \t"+"Fighter");
		super.display();
	}

}
