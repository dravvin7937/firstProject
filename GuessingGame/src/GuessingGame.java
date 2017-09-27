import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
//Katherin has attempted to commit and push in order to merge 

/*
 * Dana Ravvin
 * Guessing Game
 * 9/26/17
 */
public class GuessingGame {

	public static void main(String [] args)
	{
		//computer chooses random number 
		int randNum = (int) (Math.random()*10);
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int x = input.nextInt();
		//Prompt for user to understand the logic behind the game
		System.out.println("I have chosen a number from 1-10. Can you guess what it is?");
		
		while (!(randNum == x))
		{
			try
			{
				if (randNum == x)
				{
					System.out.println("Congrats!");
				}
				if (randNum > x)
				{
					System.out.println("That's too low! Try again.");
					 x = input.nextInt();
				}
				if (randNum < x)
				{
					System.out.println("That's too high! Try again.");
					 x = input.nextInt();
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("That was error type " + e);
			}
		}
	}
}
