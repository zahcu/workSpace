package OOPFinalProject;

public class Product {
	private String name;
	private double price;

	/**
	 * Constructor of Product
	 * @param n - Name of the product
	 * @param price - Price of the product
	 */
	
	public Product(String n, double price) {
		name = n;
		this.price = price;
	}
	
	/**
	 * method that converts everything to string
	 * @return - returns a string and the values of the variables
	 * 
	 */
	
	public String toString() {
		return name + " is" + " $" + price;
	}

	/**
	 * Method that gets the price of the product
	 * @return - returns the price of the product
	 */
	
	public double getPrice() {
		return price;
	}

	/**
	 * Method that gets the name of the product
	 * @return - returns the name of the product
	 */
	
	public String getName() {
		return name;
	}
}