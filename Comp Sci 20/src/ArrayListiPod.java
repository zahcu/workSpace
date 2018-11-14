import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListiPod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		
		//1
		//ArrayLists are better than arrays because you can remove and add things in the ArrayList
		//but if you remove something from an array it leaves an empty space
		//its not necessary because you can just get the artists from the original arraylist
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
	
	do {
	System.out.println("\nSelect menu option: \n" +
	"1. add song to library \n" +
	"2. delete song from library \n" +
	"3. add song to party playlist \n" +
	"4. exit");	
	Scanner input = new Scanner ( System.in );
	choice = input.nextInt();
	

	switch(choice) {
	case 1:
		input.nextLine();//clear extra enter character
		System.out.print("enter title: ");
		allSongs.add(input.nextLine());//store title name
		System.out.print("enter artist name: ");
		artists.add(input.nextLine());
		break;

	case 2:
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
		}
		System.out.print("enter song number to delete: ");
		int delete = input.nextInt();
		allSongs.remove(delete);
		artists.remove(delete);
		System.out.println("\nThis is the library after deletion: ");
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
		}
		break;
	
	case 3:
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
		}
		System.out.println("Enter a song to add to party playlist: ");
		partyPlayList.add(allSongs.get(input.nextInt()));
		
		for(int i = 0; i < partyPlayList.size(); i++) {
		System.out.println(partyPlayList.get(i) + " - " + artists.get(i));
		}
		break;
	
	case 4: 
		System.out.println("Good bye!");
		break;
	
	default:
		System.out.println("Invalid choice");

	}//end switch
	}while(choice != 4);
	System.out.println("\nLibrary: ");
	for(int i = 0; i < allSongs.size(); i++) {
		System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
	}
	System.out.println("\nParty Playlist: ");
	for(int i = 0; i < partyPlayList.size(); i++) {
		System.out.println(i + ". " + partyPlayList.get(i) + " - " + artists.get(i));
	}
  }//end main
}//end class
