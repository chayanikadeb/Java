package Learning;

import java.util.Scanner;

public class Song {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean isOnRepeat= true;
		while(isOnRepeat) {
			
			System.out.println("Play current song");
			System.out.println("would you like to repeat this song ? if so ans is yes");
			String userInput=scanner.next();
			if (userInput.equals("yes")) {
				isOnRepeat = false;
			}
		
		}
		System.out.println("Playing next song");
	}

}
