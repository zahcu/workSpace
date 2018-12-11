package OOPFinalProject;

public class TestInvoice {
	public static void main(String[] args) {

		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
// make sure in at least one of the runs the customer can not afford the purchase
		
		//invoice run 1
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thowers",123.8), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		runInvoice(c,in); //runs invoice
		//1591.8
	
		//invoice run 2
		Customer c2 = new Customer("MacMillan Estate", "Evan MacMillan", 3245.0);
		Invoice in2 = new Invoice(c2);
		in2.addToOrder(new Product("Bear Traps", 79.99),5);
		in2.addToOrder(new Product("Cleaver", 150.50), 2);
		in2.addToOrder(new Product("Replacement Jaws", 225.0), 10);
		runInvoice(c2,in2);
		
		//invoice run 3
		Customer c3 = new Customer("Sally Smithson", "Crotus Prenn Asylum", 2590.0);
		Invoice in3 = new Invoice(c3);
		in3.addToOrder(new Product("Syringes", 25.49), 56);
		in3.addToOrder(new Product("Bonesaw", 91.99), 3);
		in3.addToOrder(new Product("Pillow case", 12.00), 140);
		runInvoice(c3,in3);
		
		//invoice run 4
		Customer c4 = new Customer("Rin Yamaoka", "Yamaoka Estate", 6260.3);
		Invoice in4 = new Invoice(c4);
		in4.addToOrder(new Product("Katana", 400.29), 15);
		in4.addToOrder(new Product("Yakuyoke Amulet", 45.99), 10);
		in4.addToOrder(new Product("Wakizashi Saya", 200.10), 15);
		runInvoice(c4,in4);
		
	}//end main
	
	//do not modify code below
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();
		System.out.println("\n");

		if(c.getEvilFunds()- i.amountDue() < i.amountDue()) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds() );
			System.out.println("New funds total: " + c.getEvilFunds());
			i.printInvoice();
			System.out.println("_____");
			
		}
		
		
	}//end runInvoice

}//end TestInvoice
