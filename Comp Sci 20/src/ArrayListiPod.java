import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListiPod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		ArrayList<String> allSongs = new ArrayList<String>();	
		ArrayList<String> artists = new ArrayList<>();
		
		//2
		allSongs.add("I'm Fine");
		artists.add("BTS");
		allSongs.add("Ordinary Love");
		artists.add("Park Kyung");
		allSongs.add("IDOL");
		artists.add("BTS");
		allSongs.add("Instagram");
		artists.add("Dean");
		allSongs.add("Baby");
		artists.add("Astro");
		//3
		ArrayList<String> partyPlayList = new ArrayList<>();
		//part 2
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
		}//end for
	
	Scanner input = new Scanner ( System.in );
	int choice = input.nextInt();
	while (choice != 4) {
	System.out.println("Select menu option: \n" +
	"1. add song to library \n" +
	"2. delete song from library \n" +
	"3. add song to party playlist \n" +
	"4. exit");
	
	if (choice == 1) {//add song
		input.nextLine();//clear extra enter character
		System.out.print("enter title");
		allSongs.add(input.nextLine());//store title name
		System.out.print("enter artist name");
		artists.add(input.nextLine());
	}
	else if (choice == 2) {//delete from library
		System.out.println("enter song number to delete");
		allSongs.remove(input.nextInt());
		artists.remove(input.nextInt());
	}
	else if (choice == 3) {//add to part list and print list with artist
		System.out.println("Enter song: ");
		partyPlayList.add(allSongs.get(input.nextInt()));
		System.out.println(partyPlayList);
		
	}else {
		System.out.println("Invalid choice");
	}
	}//end while
  }//end main
}//end class
