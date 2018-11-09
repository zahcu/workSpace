
public class SuperheroArrays {

public static void main(String[] args) {
String[] shArray = {"Midoriya","Green Lantern Corps","Bakugou","Superman","Todoroki"};

//prints first name of the array
System.out.println("\nfirst hero: " +shArray[0]);

//prints last name of the array
System.out.println("\nlast hero: " +shArray[shArray.length-1]);

//prints out all heroes using for loop
System.out.println("\nprints out all heroes using for loop: ");
for(int i = 0; i < shArray.length; i++) {
	System.out.println(shArray[i]);
}
//powers of heroes
Boolean[] isHumanArray = {true, false, true, false, true};
String[] shPowersArray = {"One For All", "Green Lantern Ring", "Explosion", "Strength", "Half-Cold Half-Hot"};
//prints array value of heroes, powers, is human
System.out.println("\n\nHERO POWERS AND ARRAY VALUE\n");
for(int i = 0; i < shPowersArray.length; i++) {
	System.out.println("\n" + i +"\nName: " + shArray[i] + "\nPower: " + shPowersArray[i] + "\nHuman: " + isHumanArray[i]);
	
}

//exposed by couprinite
System.out.println("\n\n\nEXPOSED BY COUPRINITE");
for(int i = 0; i < shArray.length; i++) {
	if (isHumanArray[i] == false) {
	shPowersArray[i] = "None";
	}
	System.out.println("\n" + i + "\nName: " + shArray[i] + "\nPower: " + shPowersArray[i] + "\nHuman: " + isHumanArray[i]);
}
}
}
