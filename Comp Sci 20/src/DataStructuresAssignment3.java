import java.util.Scanner;

public class DataStructuresAssignment3 {

public static void main(String[] args) {
	Scanner scanNum = new Scanner (System.in);
	String[] rice = {"White Rice", "Brown Rice", "Arborio Rice", "Basmati Rice", "Black Rice", "Jasmine Rice", "Red Rice",
			 "Boiled Rice", "Sticky Rice", "Thanos Rice"};

			double[] ricePrice = {200, 250, 225, 110, 455, 325, 410, 105, 175, 530};

			int[] numBought = new int [rice.length];
			
			int riceChoice = 0;
			
			do {
				
			for (int i = 0; i < rice.length; i++) {//prints list of rice
				System.out.println(i + ". " + rice[i]);
			}
			System.out.println("\nWhat would you like to buy?: ");
			riceChoice = scanNum.nextInt();//takes input of rice choice
			
			if(riceChoice == -1) {//special discount if they type -1, multiplies 0.90 to all the prices of rice
				ricePrice[0] *= 0.90;
				ricePrice[1] *= 0.90;	
				ricePrice[2] *= 0.90;
				ricePrice[3] *= 0.90;
				ricePrice[4] *= 0.90;
				ricePrice[5] *= 0.90;
				ricePrice[6] *= 0.90;
				ricePrice[7] *= 0.90;
				ricePrice[8] *= 0.90;
				ricePrice[9] *= 0.90;
				System.out.println("SPECIAL DISCOUNT! 10% off all products\n");
				for (int i = 0; i < rice.length; i++) {//prints list of rice
					System.out.println(i + ". " + rice[i]);
				}
				System.out.println("\nWhat would you like to buy?: ");
				riceChoice = scanNum.nextInt();//takes input of rice choice
			}
			System.out.println("\nHow many bags of " + rice[riceChoice] + " would you like?");
			numBought[riceChoice] = scanNum.nextInt();//puts the number of bought in numBought array
			
			System.out.println(numBought[riceChoice] + " " + rice[riceChoice] + 
					" comes to $" + (ricePrice[riceChoice] * numBought[riceChoice]));
			
			System.out.println("\nWould you like to continue shopping?"
					+ "\n1. Yes"
					+ "\n2. No");
			int contShop = scanNum.nextInt();
			if(contShop == 2) {//if they choose no breaks out of while loop
				break;
			}
			
			}while (true);//loops until it reaches break; code
			System.out.println("rice" + "\t\tprice" + "\t\tquantity" + "\ttotal");
			for(int i = 0; i < numBought.length; i++) {//for loop that searches 
			if(numBought[i] > 0) {//prints if numBought is greater than 0
			System.out.println(rice[i] + "\t$" + ricePrice[i]  + "\t\t" + numBought[i] + "\t\t$" +(ricePrice[i] * numBought[i]));

}
			}
}
}