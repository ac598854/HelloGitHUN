package thread;

public class TestThreadTest {
		public static void main(String args[]) {
			String name = Thread.currentThread().getName();
			ThreadTest nt1 = new ThreadTest("NT1");
			Thread t1 = new Thread(nt1);
			ThreadTest nt2 = new ThreadTest("NT2");
			Thread t2 = new Thread(nt2);
			ThreadTest nt3 = new ThreadTest("NT3");
			Thread t3 = new Thread(nt3);
			t1.start();
			t2.start();
			t3.start();
			
			System.out.println();

			System.out.println("開始 Thread NT1 is alive: " + t1.isAlive());
			System.out.println("開始 Thread NT2 is alive: " + t2.isAlive());
			System.out.println("開始 Thread NT3 is alive: " + t3.isAlive());

			// 等以上執行緒結束

			try {
				System.out.println(" [主執行緒: " + name + "]開始等候以上執行緒結束.....");
				t1.join();
				t2.join();
				t3.join();
			} catch (InterruptedException e) {
				System.out.println("Main thread Interrupted");
			}

			System.out.println("後來 Thread NT1 is alive: " + t1.isAlive());
			System.out.println("後來 Thread NT2 is alive: " + t2.isAlive());
			System.out.println("後來 Thread NT3 is alive: " + t3.isAlive());

			// 等以上執行緒結束後,最後才執行此段程式碼
			System.out.println(" 最後" + " [主執行緒: " + name + "]結束exiting !");
		}
	}


