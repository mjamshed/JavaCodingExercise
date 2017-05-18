package javacodingexercise;

public class Timer {
	private long startTime;
	private long endTime;

	public void startTimer() {
		startTime = System.currentTimeMillis();
	}

	public void stopTimer() {
		endTime = System.currentTimeMillis();
		System.out.println("Total time took " + (endTime - startTime) + " milliseconds");
	}

}
