import java.util.Scanner;
public class CaesarCipher {

	public static void main(String[] args) {
	startUp();
	}
	public static void startUp() {
Scanner scanWords = new Scanner( System.in );
Scanner scanNums = new Scanner( System.in );
System.out.println("Type a word to encrypt: ");
String word = scanWords.nextLine();//takes input of user

String text = word;
String cipher = encrypt(text, 5);//gets input of user and shiftValue
System.out.println("shift value is: 5");
System.out.println("this is the encryption: " + cipher);
String decrypted = decrypt(cipher, 5);//gets encrypted text and shift value
System.out.println("this is the decryption: " + decrypted);


System.out.println("Would you like to encrypt again?"
		+ "\n1. Yes"
		+"\n2. No");
int num = scanNums.nextInt();
if (num == 1) {//if they choose yes it starts program again
	startUp();
}else if (num == 2) {//exits if they choose no
	System.out.println("Have a good day!");
	System.exit(0);//stops code
}else {//if they input invalid choice they will start up again
	System.out.println("Invalid Choice, Try Again. \n");
	System.out.println("Would you like to encrypt again?"
			+ "\n1. Yes"
			+"\n2. No");
}
}


public static String encrypt(String plainText, int shiftValue) {//method encrypt input
	
	if(shiftValue > 26) {//checks if value of shiftValue is more than 26
		shiftValue = shiftValue%6;//uses modulo to bring shift value back to the start
	}
	else if (shiftValue<0) {//checks if value of shiftValue is less than 0
		shiftValue = (shiftValue%26)+26;//brings back value to a value between 0 and 26
	}
	
	String cipherText = "";
	for(int i = 0; i<plainText.length(); i++) {//for loop checks the length of plainText
		char ch = plainText.charAt(i);//getting each individual index of plainText
		if(Character.isLetter(ch)) {//checks if value is a letter
			if(Character.isLowerCase(ch)) {//checks if letters are lower case
				char c = (char)(ch+shiftValue);//char variable for plainText & shiftValue
				if(c>'z') {//checks if the value is greater than z (LOWER CASE)
					cipherText += (char)(ch - (26-shiftValue));//makes it so that the value is only letters and adds it to cipherText if condition is met (LOWER CASE ONLY)
				}
				else {
					cipherText += c;//takes value of c if it is a valid letter and adds it to cipherText to make it a string
				}
			}
			else if(Character.isUpperCase(ch)) {//checks if letters are Upper case
				char c = (char)(ch+shiftValue);//char variable for plainText & shiftValue
				if(c>'Z') {//checks if the value is greater than Z (UPPER CASE)
					cipherText += (char)(ch - (26-shiftValue));//makes it so that the value is only letters if condition is met(UPPER CASE ONLY)
				}
				else {
					cipherText += c;//takes value of c and adds it to cipherText to make it a string
				}
			}
		}
		else {
			cipherText += ch;//condition is met if character is a valid letter
		}
	}
	return cipherText;//returns cipherText string value
}
public static String decrypt(String encryptedText, int shiftValue) {
	if(shiftValue > 26) {//checks if the value is less than 0 or more than 26 so that it can place it between 0 and 26
		shiftValue = shiftValue%6;
	}
	else if (shiftValue<0) {//checks if the value is less than 0 or more than 26 so that it can place it between 0 and 26
		shiftValue = (shiftValue%26)+26;
	}//checks if the value is less than 0 or more than 26 so that it can place it between 0 and 26
	
	String cipherText = "";
	for(int i = 0; i<encryptedText.length(); i++) {
		char ch = encryptedText.charAt(i);//getting each individual index of encryptedText
		if(Character.isLetter(ch)) {//checks if value is a letter
			if(Character.isLowerCase(ch)) {//checks if letters are lower case
				char c = (char)(ch-shiftValue);//char variable for encryptedText & shiftValue
				if(c<'a') {//checks if value is less than a (LOWER CASE)
					cipherText += (char)(ch + (26-shiftValue));//makes it so that the value is only letters and adds it to cipherText if condition is met (LOWER CASE ONLY)
				}
				else {
					cipherText += c;//takes value of c if it is a valid letter and adds it to cipherText to make it a string
				}
			}
			else if(Character.isUpperCase(ch)) {//checks if letters are Upper case
				char c = (char)(ch-shiftValue);//char variable for encryptedText & shiftValue
				if(c<'A') {//checks if the value is greater than A (UPPER CASE)
					cipherText += (char)(ch + (26-shiftValue));//makes it so that the value is only letters if condition is met(UPPER CASE ONLY)
				}
				else {
					cipherText += c;//if value is valid and is a letter of the 26 letters, adds it to cipherText
				}
			}
		}
		else {
			cipherText += ch;//gets value of ch and adds it to cipherText
		}
	}
	return cipherText;//returns value of cipherText string value
}
}
