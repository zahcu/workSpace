package OOPFinalProject;

public class Customer {

	private String secretLairLocation;
	private String Name;
	private double evilFunds;
	
	/**
	 * Constructor for Customer
	 * @param loc - Location of Customer
	 * @param n - Name of Customer
	 * @param funds - Number of funds the Custome has
	 */
	
	public Customer(String loc, String n, double funds) {
		secretLairLocation = loc;
		Name = n;
		evilFunds = funds;
	}
	
	/**
	 * method to convert everything to string
	 * @return - returns the string and the values of the variables
	 */
	
	public String toString() {
		return "Name of Customer: " + Name
				+ "\nLocation: " + secretLairLocation
				+ "\nMoney: " + evilFunds;
	}
	
	/**
	 * Method to add funds if funds are not enough
	 * @param addF - AddFunds variable
	 */
	
	public void addFunds(double addF) {
		evilFunds += addF;
	}
	
	/**
	 * Method that returns the evilFunds that the Customer has
	 * @return - returns evilFunds
	 */
	
	public double getEvilFunds() {
		return evilFunds;
	}
	
	/**
	 * Method that returns the location of the customer
	 * @return - returns the Location
	 */
	
	public String getLocation() {
		return secretLairLocation;
	}
	
	/**
	 * Method that returns the name of the Customer
	 * @return - returns the name
	 */
	
	public String getName() {
		return Name;
	}
}
