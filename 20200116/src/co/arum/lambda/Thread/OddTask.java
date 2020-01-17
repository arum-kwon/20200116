package co.arum.lambda.Thread;

public class OddTask implements Runnable {

	@Override
	public void run() {
		// 홀수 1~100
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
