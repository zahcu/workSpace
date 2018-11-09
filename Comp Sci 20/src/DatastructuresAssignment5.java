import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class DatastructuresAssignment5 {

	public static void main(String[] args) {
		startUp();
	}
		
	public static void startUp() {
		int choice = 0;
		String word;
		Scanner scanNum = new Scanner ( System.in );

		String[] english = {"Hello", "Goodbye", "Yes", "No", "Welcome", "Thank You", "Pardon Me", "Good Luck", 
				"No Thanks", "Okay", "You", "Forget it", "Stop", "Go", "I love you"};
		String[] korean = {"여보", "안녕", "예", "아니", "환영", "감사합니다", "미안 해요", "파이팅", "괜찮습니다", "오케이", "당신",
				"잊어라", "중지", "가기", "사랑해"};
		
		System.out.println("TRANSLATOR: ENGLISH TO KOREAN OR KOREAN TO ENGLISH\nWARNING! SOME WORDS WERE TRANSLATED USING GOOGLE TRANSLATE"
				+ ", \nMEANING IT MAY BE AN INACCURATE TRANSLATION TO THE REAL WORD.");
		

		//prints the English array		
			System.out.println("\nEnglish words or phrases that can be translated: ");
		for(int i = 0; i < english.length; i++) {
			System.out.println("-" + english[i] );
		}
		//prints the Korean array
		System.out.println("\nKorean words or phrases that can be translated: ");
		for(int i = 0; i < korean.length; i++) {
			System.out.println("-" + korean[i]);
		}
		
		System.out.println("\nPlease type a word or copy and paste to translate (scroll up to choose words): ");
		word = scanNum.nextLine();//takes input
		for(int i = 0; i < english.length; i++) {//seraches for the index of english[]
		if(word.equalsIgnoreCase(english[i])) {//makes it so that it's not case sensitive and can take a lower case or upper case
			System.out.println("Translation: " + korean[i]);//prints the translation
		}
		}
		for(int i = 0; i < korean.length; i ++) {//searches for the index of korean[]
		if(word.equalsIgnoreCase(korean[i])) {//makes it so that it's not case sensitive and can take a lower case or upper case
			System.out.println("Translation: " + english[i]);//prints the translation
		}
		}
		do {//loop until condition met
		System.out.println("\nWould you like to translate again?"
				+ "\n1. Yes"
				+ "\n2. No");
		choice = scanNum.nextInt();//takes input
		if (choice == 1) {//starts the program again
			startUp();
		}
		else if(choice == 2) {//ends loop
			System.out.println("Thank you for using the translator, goodbye.");
			break;
		}else {
			System.out.println("Invalid Choice");//if user does not input valid choice
		}
		
		

		
		
	}while(choice != 2);//while loop until choice is 2
	}
}


