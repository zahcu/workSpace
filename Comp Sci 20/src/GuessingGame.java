import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
//Zachary Canlobo
//Brix De Castro

	
	public static void startUp() {
		Scanner scStr = new Scanner( System.in ); //scanner for strings 
		Scanner scNum = new Scanner( System.in ); //scanner for numbers

		int whileLoop = 0;
		//gets a random number between 0 - 100
		Random rand = new Random();
		int randomNum = rand.nextInt(100) + 1;
		
		System.out.println("Welcome to the guessing game!");
		System.out.println("Who is our lucky guess today?!");
		System.out.println("\nEnter your name: ");
		String name = scStr.nextLine();//takes input
		
		System.out.println("Would you like to play the best guessing game, " + name + "?");
		System.out.println("\n1.Yes"
				+ "\n2.No");
		
		int playAgain = scNum.nextInt();//takes input
		
		while(playAgain > 0) { //while loop plays if condition is not met
	
		while(playAgain != 1) {//while loop plays until playAgain = 1
		
		if (playAgain == 2) {
			System.out.println("Thanks for playing! " + name + ".");
			System.exit(0);//exits the game
		}
		 else {
			System.out.println("Not a valid choice");
			System.out.println("Would you like to play the best guessing game, " + name + "?");
			System.out.println("\n1.Yes"
							 + "\n2.No");
			playAgain = scNum.nextInt();//takes input
		 }//end else
		}//end while
		
		System.out.println("Hello " + name + ", guess a number from zero to one hundred: ");

		int guess = scNum.nextInt();//takes input
		
		while(guess!= randomNum && whileLoop < 4) {//while loop that plays until the user choice gets the right number or meets the conditions
			
		if (guess > randomNum) {
			System.out.println("Guess lower!");
			whileLoop += 1;//adds plus 1
		}else { 
			System.out.println("Guess Higher");
			whileLoop += 1;//adds + 1
		}
		
		guess = scNum.nextInt();//takes input
	}//end while
		
	if (guess == randomNum) {//if guess is correct
	System.out.println("That is the right number!");
	
	}else {//if the user guess more than 5 times
	System.out.println("You lose! What are you, a loser from loserville?");
	System.out.println("The right number was, " + randomNum);
	}//end else

	System.out.println("Would you like to play again?");
	System.out.println("\n1.Yes"
					 + "\n2.No");
	playAgain = scNum.nextInt();//takes input
	
	while (playAgain > 0) {//while loop plays until statements conditions are met
	
	if (playAgain == 1) {
		startUp();//if playAgain = 1, starts the game again
	}
	else if(playAgain == 2) {
		System.out.println("Bye " + name + "! Thanks for playing!");
		System.exit(0);//exits the game
	}
	else {
		System.out.println("Not a valid choice");
		System.out.println("Would you like to play again?");
		System.out.println("\n1.Yes"
		+ "\n2.No");
		playAgain = scNum.nextInt();//takes input
	}//ends else
	}//ends while
	}//ends while loop
	}//ends method
	
	public static void main(String[] args) {
		startUp();// starts up game
	}
}
