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
		double start;
		double end;
//		Timer time = new Timer();
		int score = 0;
		while (go) {
			char next = gen.generate();
			System.out.println("\n" + next + "\n");
//			boolean timer = true;
//			timer = time.Time(round);
			start = System.currentTimeMillis()/1000;
			String enter = in.next().toUpperCase();
			end = System.currentTimeMillis()/1000;
			//since you would not answer add what ever calculation you want to this for faster times
			//current time to answer is 2 sec
			
			if (enter.charAt(0) == next && (end-start)<2) {
				score++;
				continue;
			} else {
				if((end-start)>=2) {
					System.out.println("You ran out of time!");
				}
				System.out.println("GAME OVER!");
				System.out.println("Your score was : "+ score);
				go = false;
			}
		}
	}
}
