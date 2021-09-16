
public class Timer {

	
	//make a timer between 2000 and 200ms
	
	
	public boolean Time(int t) {
		// input what round it is and alter accordingly.
		int time = 1000 - (int)(t*10);
		if (time < 200) time=200;
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}		
		return false;
	}
}
