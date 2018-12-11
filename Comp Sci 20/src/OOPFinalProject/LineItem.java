package OOPFinalProject;
public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	/**
	 * Constructor for LineItem
	 * @param p - Product
	 * @param qty - Quantity of the product
	 */
	
	public LineItem(Product p, int qty ) {
		this.qty = qty;
		theProduct = p;
	}
	
	/**
	 * Method that converts everything to string
	 * @return - returns a string and the value of the variables
	 */
	
	public String toString() {
		return "bought " + qty + " "+ theProduct.getName();
	}

	/**
	 * Method that gets the product
	 * @return - returns the product
	 */
	
	public Product getProduct() {
		return theProduct;
}
	
	/**
	 * Method that gets the quantity of the product
	 * @return - returns the quantity
	 */
	
	public int getQty() {
		return qty;
	}
	
	/**
	 * method that gets the total price of the LineItems
	 * @return - returns the total of items added into the ArrayList
	 */
	
	public double getTotalPrice() {
	
	return theProduct.getPrice()*qty;
	}
}
