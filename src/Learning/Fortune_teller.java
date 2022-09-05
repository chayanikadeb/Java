package Learning;

import java.util.Scanner;

public class Fortune_teller {

	public static void main(String[] args) {
		
		System.out.println("Pick a number between 1 to 10");
		Scanner scanner = new Scanner(System.in);
		int imputnum = scanner.nextInt();
		
		if (imputnum <5) {
			System.out.println("Enjoy the good luck a friend brings you");
		}
		else {
			System.out.println("you shoe selection will make you very happy today");
		}

	}

}
