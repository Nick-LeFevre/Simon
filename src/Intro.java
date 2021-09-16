import java.util.Scanner;

public class Intro {

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to BOP IT!");
		while (true) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("To play: Before time runs out, when the character is"
					+ " displayed on the screen,\n quickly press the same character "
					+ "and hit enter");
			System.out.println("Would you like to start the game? Enter Y/N");
			String userin = in.nextLine().toLowerCase();
			switch (userin) {
			case "y":
				GameDriver.play();
				break;
			case "n":
				System.out.println("Thanks for playing. Have a nice day.");
				System.exit(0);
			default:
				System.out.println("Please enter Y or N");
				break;

			}
		}
	}
}
