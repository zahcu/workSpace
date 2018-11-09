

import java.util.Scanner;

public class MonsterGame {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);	  
	 String[] monster = {"vampire", "mummy", "frankenstein", "zombie", "skeleton",
			 "werewolf", "player"};
	 
	 System.out.println("What is player name?: ");
	 monster[monster.length - 1] = "player: " + input.nextLine();
	 
	 //create coins and fill randomly
	 int[] coins = new int[monster.length];
	 for(int i = 0; i < monster.length; i++) {
		 coins[i] = (int)(Math.random() * 8 + 2);
	 }
	 
	 String[] ability = new String[monster.length];
	 ability[0] = "fangs";
	 ability[1] = "fear";
	 ability[2] = "brute strength";
	 ability[3] = "brain eating teeth";
	 ability[4] = "spook";
	 ability[5] = "claws";
	 ability[6] = "a double edged sword";
	 
	 for(int i = 0; i < monster.length; i++) {
		 System.out.println(monster[i] + " attacks with " + ability [i]
				 + " has " + coins[i] + " gold coins");
	 }
	 System.out.println();
	 
	 //randomly assign hp
	 int[] hp = new int[monster.length];
	 for(int i = 0; i < monster.length; i++) {
		 hp[i] = (int)(Math.random() * 15 + 5);
		 System.out.println(monster[i] + " has " + hp[i] + " HP");
	 }
	 
	 System.out.println("The vampire ate a teenager, how many coins did it collect:");
	 coins[0] += input.nextInt();
	 System.out.println(monster[0] + " has " + coins[0] + " gold coins");
	 
	 System.out.println("the " + monster[2] + " gets mutated into what?: ");
	 input.nextLine();//eats up extra return/enter symbol
	 monster[2] = input.nextLine();
	 
	 System.out.println("new monster: " + monster[2]);
	 int totalCoins = coins[monster.length - 1];//set total to initial value
	 int turns = 0;
	  //fight while player hp > 0
	 while(hp[monster.length - 1] > 0) {
	   int randomMonster = (int)(Math.random() * monster.length);//picks random monster
	   if(randomMonster != monster.length - 1) {//check to make sure not fighting self
		 int hitChance = (int)(Math.random() * 2);
		 
		 if(hitChance % 2 == 0) {
		   System.out.println("You hit with " + ability[monster.length -1]
				   + " and " + monster[randomMonster] + " drops " + coins[randomMonster] + " gold coins.");
		   totalCoins += coins[randomMonster];
		 } else if(hitChance % 2 == 1) {
			 int randomDmg = (int)(Math.random() * 2 + 1);
			 hp[monster.length -1] -= randomDmg;
			 System.out.println(monster[randomMonster] + " hit you for "
					 + randomDmg + " damage. " + hp[monster.length-1]
							 + " hp remaining");
		 }//end else if
		 
		 turns++;
		   
	   }//if
	 }//end while
	 System.out.println("you runaway with " + totalCoins + " and lasted " + turns + " turns.");
	}//end main
}//end class


















