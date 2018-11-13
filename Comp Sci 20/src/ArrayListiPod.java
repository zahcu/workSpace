import java.util.ArrayList;

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
		
		ArrayList<String> partyplayList = new ArrayList<>();
		
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + ". " + allSongs.get(i) + " - " + artists.get(i));
		}
	}

}
