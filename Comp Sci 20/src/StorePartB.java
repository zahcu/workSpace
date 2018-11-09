import java.util.Scanner;
public class StorePartB {
  static final double TAX = 0.05;//gst
  static double cost = 0;//cost of the sale
  static int totalQty = 0;

  public static void main(String[] args) {
    menu();//starts game
    }//end main

  public static void menu() {
		Scanner scanNums = new Scanner( System.in );
		Scanner scanWords = new Scanner( System.in );
		double whiteRiceCost = 250.99;
		double brownRiceCost = 525.99;
		double thanosRiceCost = 999.99;

		int choice; //menu choice
		
		System.out.println("Hello what is your name?");
		String name = scanWords.nextLine();//Scans user input
		
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
		   totalQty += qty;
				if (choice == 1) {
					cost += calcCost(whiteRiceCost, qty);
				}
				else if (choice == 2) {
					cost += calcCost(brownRiceCost, qty);
				}
				else if (choice == 3) {
					cost += calcCost(thanosRiceCost, qty);
				}
				else {
					System.out.println("Sorry we don't have those");
				}
		}//end if choice != 0
		}while (choice != 0); //end do-while
		printSummary();//calls printSummary method
  }//end menu

  public static double calcCost(double price, int qty) {
	return price * qty;
  }//end calcCost
  
  public static double calcTax(double TAX, double cost) {
	return TAX * cost;
  }//end calcTax
  
  public static void printSummary() {
	System.out.println("Total number of items sold: " + totalQty);
	System.out.printf("Tax is: $%.2f\n", calcTax(TAX, cost));//makes it so that it only goes to 2 decimal spots
	double totalCost = cost + calcTax(TAX, cost);
    System.out.printf("Total with tax is: $%.2f\n", totalCost);//makes it so that it only goes to 2 decimal spots
	System.out.println("Thank you for shopping at QRice! Have a nice day!");
  }//end printSummary
  
  
}