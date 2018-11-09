import java.util.Scanner;
public class Store {

public static void main(String[] args) {
	Scanner scanNums = new Scanner( System.in );
	Scanner scanWords = new Scanner( System.in );
	double whiteRiceCost = 250.99;
	double brownRiceCost = 525.99;
	double thanosRiceCost = 999.99;
	final double TAX = 0.05;
	double cost = 0;
	int choice; //menu choice
	
	System.out.println("Hello what is your name?");
	String name = scanWords.nextLine();
	
	System.out.println("Hello, " + name + ", Welcome to QRice, where we sell the best quality rice.");
	do {
	System.out.println("\nWhat type of rice would you like to buy?"
			+ "\n0. Exit"
			+ "\n1. White Rice"
			+ "\n2. Brown Rice"
			+ "\n3. Thanos Rice");

	 choice = scanNums.nextInt();//declare choice var and store input
	
	if (choice != 0) {
	   System.out.print("How many bags would you like to buy? ");
	   int qty = scanNums.nextInt();
			if (choice == 1) {
				cost += whiteRiceCost * qty;
			}
			else if (choice == 2) {
				cost += brownRiceCost * qty;
			}
			else if (choice == 3) {
				cost += thanosRiceCost *qty;
			}
			else {
				System.out.println("Sorry we don't have those");
			}
	}//end if choice != 0
	}while (choice != 0); //end do-while
	
	System.out.printf("Tax is: $%.2f\n", cost * TAX);
	double totalCost = cost + cost * TAX;
	System.out.printf("Total with tax is: $%.2f\n", totalCost);
	System.out.println("Thank you for shopping at QRice! Have a nice day!");
}//end main

}