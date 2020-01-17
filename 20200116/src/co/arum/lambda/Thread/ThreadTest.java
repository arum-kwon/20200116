package co.arum.lambda.Thread;

public class ThreadTest {
	
	public static void main(String[] args) {
//		Thread thread = new Thread( new Runnable() { //객체 생성과 클랙스 선언을 같이함 > 익명클래스	
//				@Override
//				public void run() {
//					// 홀수 1~100
//					for (int i = 1; i <= 100; i += 2) {
//						System.out.println(i);
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			}
//		);
		Thread thread1 = new Thread( () ->  { //더 생략(인터페이스 명, 메소드 이름
			 //홀수 1~100
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread( () ->  {
			// 쨕수 출력 1~100
			for (int i = 2; i <= 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();

	}
}
//익명클래스
class InnerOddTask implements Runnable {

	@Override
	public void run() {

	}
}