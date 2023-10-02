import java.util.Random;	//anna koodille random
import java.util.Scanner;	//anna koodille input scanner

public class Lucky7peli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//alku teksti pelille
		System.out.println("I want to play a game");
		System.out.println("Name of the game is Lucky 7");
		System.out.println("You will be given 3 dices with 10 sides that will be thrown and if one of them hits 7 you win");
		
		
		Random r = new Random();	//random annetti r
		
		int dice1, dice2, dice3;
		
		//nopille annetaan random numero 1-10
		dice1 = r.nextInt(10) + 1;
		dice2 = r.nextInt(10) + 1;
		dice3 = r.nextInt(10) + 1;		
		
		
		if (dice1 == 7 | dice2 == 7 | dice3 == 7) //Jos jokin nopista on 7 toista
			{
				System.out.println("Congratz you win");
				System.out.println("First dice was " + dice1);
				System.out.println("Second dice was " + dice2);
				System.out.println("Third dice was " + dice3);
			}
		
		else //jos mikään noppa ei ollut 7 toista
			{
				System.out.println("You lost!");
				System.out.println("Dice was " + dice1);
				System.out.println("Second dice was " + dice2);
				System.out.println("Third dice was " + dice3);
			}
		
		
		
		
		
		
		
		
	}

}
