package OOPFinalProject;
import java.util.ArrayList;
public class Invoice {

	private ArrayList<LineItem> items = new ArrayList<LineItem>();
	private Customer theCustomer;

	/**
	 * Constructor of invoice class
	 * @param c - customer
	 */
	
	public Invoice(Customer c) {
		theCustomer = c;
	}

	
	/**
	 * Method to add lineitems to order
	 * @param p - product
	 * @param qty - quantity of product
	 */
	
	
	public void addToOrder(Product p, int qty) {
		LineItem item = new LineItem(p,qty);
		items.add(item);
	}

	/**
	 * prints invoice and checks to see if customer
	 * can afford lineitems.
	 */
	
	public void printInvoice() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).toString());
		}
	
		if (canAfford(theCustomer) == true) {
			System.out.println("Purchase Approved");
		
		}
		else {
			System.out.println("Purchase Denied");
			double shortBy = amountDue() - theCustomer.getEvilFunds();
			System.out.printf("you are short by $%.2f\n" ,  shortBy);
		}
	
}

	
	/**
	 * checks to see if Customer can afford lineitems
	 * @param c - Customer
	 * @return - returns true or false if customer can afford or not
	 */
	
	public boolean canAfford(Customer c) {
		boolean x;
		if (theCustomer.getEvilFunds() >= amountDue()) {
			x = true;
		}else {
			x = false;
	}
		return x;
}

	/**
	 * method to calculate the amountDue when items are too expensive
	 * @return - returns total of how much is needed to buy the items
	 */
	
	public double amountDue() {
		double total = 0;
		for (int i = 0; i < items.size(); i++) {
			 LineItem productPrice = items.get(i);
			 total +=productPrice.getTotalPrice();
		}
		return total;
	}

	
	/**
	 * gets items from ArrayList
	 * @return - returns items in ArrayList
	 */
	public ArrayList<LineItem> getArrayList() {
		return items;
}

	/**
	 * gets customer info
	 * @return - returns customer information
	 */
	
	public Customer getCustomer() {
		return theCustomer;
}
}

