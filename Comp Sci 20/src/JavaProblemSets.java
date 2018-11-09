import java.util.Random;
public class JavaProblemSets {

	
	public static int randomInt() {
	Random rand = new Random(); 
	return rand.nextInt(6) + 1; 
	}
	
	public static void main(String[] args) {
diceRoll();
	}
	public static void diceRoll() {
	//roll 1 and roll 2 for the while loop
	int roll1 = randomInt();
	int roll2 = randomInt();
	//while rolls are for the while loop
	int whileRoll1 = 0;
	int whileRoll2 = 0;
	//result added at the while loop
	int result = roll1 + roll2;
	//if roll 1 and roll 2 is equal
		if(roll1 == roll2) {
	//if they are both equal while keeps executing
	while (roll1 == roll2) {
	//adds the whileRoll1 and whileRoll2 to the result from adding roll1 and roll2
	whileRoll1 = randomInt();
	whileRoll2 = randomInt();
	result = result + whileRoll1 + whileRoll2;
	}
	//if roll1 and roll2 aren't the same
	} else if (roll1 != roll2) {
		System.out.println("Numbers ARE NOT the same! Total value is: " + result + ".");
		//if the first numbers rolled are the same, roll 2 more numbers and return the sum of the numbers.
	}
}

}
