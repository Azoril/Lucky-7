import java.util.Random;	//anna koodille random
import java.util.Scanner;	//anna koodille input scanner

public class Lucky7peli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//alku teksti pelille
		System.out.println("I want to play a game");
		System.out.println("Name of the game is Lucky 7");
		System.out.println("You will be given 3 dices with 10 sides that will be thrown and if one of them hits 7 you win");
		System.out.println("Each play costs you 1 dollar and each win gives you 3 dollars");
		
		Random r = new Random();	//random annetti r
		Scanner scanner = new Scanner(System.in);
		
		int dice1, dice2, dice3, roll;
		roll = 0;
		String playAgain;
		System.out.println("Enter money amount");
		int money = scanner.nextInt();
		


		do//loop
		{
			//nopille annetaan random numero 1-10 joka kerta uudestaan
			dice1 = r.nextInt(10) + 1;
			dice2 = r.nextInt(10) + 1;
			dice3 = r.nextInt(10) + 1;


			
			if(roll >= 0)
			{

			playAgain = scanner.nextLine();
			if (playAgain.equals("n"))
			{
				break;
			}
			}
			
			money -= 1;
		if (dice1 == 7 | dice2 == 7 | dice3 == 7) //Jos jokin nopista on 7 toista
			{
				System.out.println("Congratz you win");
				System.out.println("Dice were " + dice1 + " " + dice2 + " " + dice3);
				money += 3;
				
				System.out.println("Current money is " + money);
			}//if loppu
		
		else //jos mikään noppa ei ollut 7 toista
			{
				System.out.println("You lost!");
				System.out.println("Dices were " + dice1 + " " + dice2 + " " + dice3);
				System.out.println("Current money is " + money);
			}//else loppu
			
			
		roll++;	//lisää yksi rolliin
		System.out.println("Play again? y/n"); //pelaatko uudestaan
		
		}		while (money >0);//while loppu ja jos rahat loppuu peli loppuu suoraan
		
		System.out.println("Thanks for playing!");
		System.out.println("Money left is " + money + " and you played " + roll + " times");

		
		
		
		
	}

}
