
public class DataStructuresAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Zach", "Paul", "Calvin", "Rej", "Justin", "Matt", "Jim", 
				"Brix", "Erwinn", "Lisa"};
		
		double[] amtRaised = {50, 103, 205, 143, 234, 324, 123, 
				167, 124, 321};
		
		boolean[] hasForm = {true, false, false, false, true, 
				true, true, false, false, true};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " " + amtRaised[i] + " " +
		hasForm[i]);
		}
		
	double totalRaised = 0;
	for (int i = 0; i < amtRaised.length; i++) {
		totalRaised += amtRaised[i];
	}//end for
	
	System.out.println("\nTotal Raised: " + totalRaised);
	System.out.println("\nAvg Raised: " + totalRaised / names.length);
	
	int over200Cnt = 0;
	for(int i = 0; i < amtRaised.length; i++) {
		if(amtRaised[i] > 200) {
			over200Cnt++;
		}//end if
	}
	System.out.println("\nNumber of people raised over $200: " + over200Cnt);
	
	int noFormsCnt = 0;
	for(int i = 0; i < hasForm.length; i++) {
		if(hasForm[i] == false) {
			noFormsCnt++;
		}//end if
	}
	System.out.println("\nNumber of people with no forms: " + noFormsCnt);
	
	int lowestIndex = 0;//tracks the index with the lowest amt raised
	for(int i = 0; i < amtRaised.length; i++) {
		//compare index with lowest amt raised to index i
		//if index i is lower than lowestIndex becomes i
		if(amtRaised[lowestIndex] > amtRaised[i]) {
			lowestIndex = i;
		}//end if
	}
	System.out.println("\nLowest amount raised: $" + amtRaised[lowestIndex]);
	
	double over200clubTotal = 0;
	for(int i = 0; i < amtRaised.length; i++) {
		if(amtRaised[i] > 200) {
			over200clubTotal += amtRaised[i];
			System.out.println(names[i]);
		}//end if
	}//end for
	System.out.println(over200clubTotal);
	
	
	}//end main
}//end class


