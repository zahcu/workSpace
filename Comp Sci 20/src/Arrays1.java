import java.util.Random;

public class Arrays1 {

	public static void main(String[] args) {
	//create 2 arrays
		String[] studentsArray = {"Thanos","Peter Parker","Shrek","Barney","Bradley","Mr. Truong"};
		int[] gradesArray = new int[studentsArray.length];
		int avg = 0;
	//print arrays
		for(int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
		}
	//create random object
		Random r = new Random();
	//random grades entry
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i]= r.nextInt(101);
		}
	//print arrays
		for(int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
		}
	//update index 5
		gradesArray[5] = 85;
	//print arrays
		for(int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
		}
	//avg
		for(int i = 0; i < gradesArray.length; i++) {
			avg += gradesArray[i];
		
			avg = avg/gradesArray.length;
		}
		System.out.println("class avg: " + avg);
	}

}
