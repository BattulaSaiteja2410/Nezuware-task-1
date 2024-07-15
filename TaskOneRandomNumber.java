/* Creating a Number Guessing Game
Developing a Java console-based number guessing game where the computer
selects a random number within a specified range. Players must guess the
number within a limited number of attempts. The game provides feedback on
each guess (too high, too low) and ends when the player guesses correctly or
exceeds the attempt limit.
 */
import java.util.Random;
import java.util.Scanner;

class TaskOneRandomNumber
		{
		public static void main(String[] args) {
			Random random= new Random();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the minimum value");
			int min=sc.nextInt();
			System.out.println("Enter the maximum value");
			int max = sc.nextInt();
			int randomValue =random.nextInt(max - min +1)+min;
			int triles= 3;
			for (int i=1;i<=triles;i++ )
			{
				System.out.println("Enter the random value ");
			int userRandomValue=sc.nextInt();
				if (randomValue==userRandomValue)
				{
					System.out.println("Congradulications you guesse is correct and you wow the game");
				}
				else if (triles<=3&&randomValue>userRandomValue)
				{
					System.err.println("sorry !! you guesse is worrong ");
					System.out.println("The Random value is higher than the user gussed value");
					System.out.println("You have chances to guesse the random value");
					System.out.println("Please guesse the random value again....!!Best of luck!!");
				}else if (triles<=3&&randomValue<userRandomValue)
				{
					System.err.println("sorry !! you guesse is worrong ");
					System.out.println("The Random value is lesser than the user gussed value");
					System.out.println("You have chances to guesse the random value");
					System.out.println("Please guesse the random value again....!!Best of luck!!");
				}
				else
				{
					System.err.println("sorry !! all the chances are completed  ");
					System.err.println("Game Over");
				}
			}
	System.out.println("the random value is "+randomValue);
		
	}
	}