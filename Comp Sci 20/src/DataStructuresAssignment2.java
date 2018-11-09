
public class DataStructuresAssignment2 {

	public static void main(String[] args) {
		String[] names = {"Zach", "George", "Leona", "Annie", "Mia", "Kazuno"};
		int[] gradeNum = {11, 10, 9, 7, 11, 12};
		int[] exam1 = {98, 24, 78, 56, 89, 12};
		int[] exam2 = {86, 52, 42, 19, 59, 97};
		int[] exam3 = {53, 82, 14, 47, 85, 100};
			
			//hard code of arrays for first student of the array
			System.out.println("Name: " + names[0]);
			System.out.println("Grade: " + gradeNum[0]);
			System.out.println("Exam 1: " + exam1[0]);
			System.out.println("Exam 2: " + exam2[0]);
			System.out.println("Exam 3: " + exam3[0]);
			
			System.out.println();//adds a space
			
			//hard code of arrays for last student ofthe array
			System.out.println("Name: " + names[names.length -1]);
			System.out.println("Grade: " + gradeNum[names.length -1]);
			System.out.println("Exam 1: " + exam1[names.length -1]);
			System.out.println("Exam 2: " + exam2[names.length -1]);
			System.out.println("Exam 3: " + exam3[names.length -1]);
			
			System.out.println();
			
			for(int i = 0; i < names.length; i++) {
				//prints names of students
				System.out.println(names[i]);
			}
			System.out.println();//adds a space
			{
			for(int i = 0; i < names.length; i++) {
				//prints names of students, grade, and marks of exam 1, 2, and 3
				System.out.println(names[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam2[i]);
			}
			System.out.println();//adds a space
			{
			for(int i = 0; i < names.length; i++) {
				//prints array value + 1, names, grade, mark of exam 1, 2, and 3
				System.out.println((i+1) +". " + names[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam2[i]);
			}
			System.out.println();//adds a space
			}
			for(int i = 0; i < names.length; i++) {
				//prints the average of each student
				System.out.println("The average of " + names[i] + " is " + ((exam1[i] + exam2[i] + exam3[i]) / 3) + "%");
			}
			System.out.println();//adds a space
			}
			for(int i = 0; i < names.length; i++) {
			if(exam3[i] > 79) {//checks if mark of exam 3 is greater than 79
				System.out.println(names[i] + " got higher than 79% on exam 3, they got: " + exam3[i] + "%");
			}//end exam3 if
			}//end for
			
			System.out.println();//adds a space
			
			for(int i = 0; i < names.length; i++) {
			if(exam1[i] < 50) {//checks if mark of exam 1 is less than 50
				exam1[i] = 40;//changes the mark of people who got less than 50% to 40%
				//prints the name of the student and prints their changed mark
				System.out.println(names[i] + " had a grade below 50%, so their mark changes to " + exam1[i] + "%");
			}//end exam1 if
	}//end for
 
}//end public static void
	}//end class
