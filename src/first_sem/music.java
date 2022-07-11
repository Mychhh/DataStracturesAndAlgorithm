package first_sem;

import java.util.LinkedList;

public class music {

	public static void main(String[] args) {
		
		LinkedList <String> songs = new LinkedList<>();
		songs.add("We Belong Together");
		songs.add("Million Reasons");
		songs.add("The Climb");           //5-Song Titles
		songs.add("Who You Are");
		songs.add("A Woman's Worth");
		
		LinkedList <String> artist = new LinkedList<>();
		artist.add("Mariah Carey");
		artist.add("Lady Gaga");
		artist.add("Miley Cyrus");       //5-Artist Name
		artist.add("Jessie J");
		artist.add("Alicia Keys");
		
		LinkedList <String> playlist = new LinkedList<>();
//in this Linkedlist i will combine the artist and song name using for loop
		for (int x = 0; x < artist.size(); x++) {
			playlist.add(songs.get(x) +" - "+ artist.get(x)); 
		}
		
		System.out.println(songs);
		System.out.println(artist+"\n");
		
		for(int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		}

	}

}
