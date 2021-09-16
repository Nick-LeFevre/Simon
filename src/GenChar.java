import java.util.Random;

public class GenChar {

	public char generate() {
		int next = new Random().nextInt(3);
		switch (next) {
		case 0:
			return 'A';
		case 1:
			return 'S';
		case 2:
			return 'D';
		case 3:
			return 'F';
		}
		return 'x';
	}
}
