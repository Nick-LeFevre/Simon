import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Intro intro = new Intro();
		intro.start();
	}

	public static void play() {
		Scanner in = new Scanner(System.in);
		GenChar gen = new GenChar();
		boolean go = true;
		Timer time = new Timer();
		int round = 0;
		while (go) {
			char next = gen.generate();
			System.out.println("\n" + next + "\n");
			boolean timer = true;
			timer = time.Time(round);
			String enter = in.next().toUpperCase();
			if (enter.charAt(0) == next) {
				continue;
			} else {
				System.out.println("GAME OVER!");
				go = false;
			}
		}
	}
}
