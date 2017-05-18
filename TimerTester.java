package javacodingexercise;

import java.util.concurrent.TimeUnit;

public class TimerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.startTimer();
		timerTesterMethod();
		timer.stopTimer();
	}

	public static void timerTesterMethod() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
