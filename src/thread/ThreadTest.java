package thread;

public class ThreadTest implements Runnable{
	

		String name; // 執行緒名字
		Thread t;
		ThreadTest(String threadname) {
			name=threadname;
		}

		public void run() {
			try {
				for (int i = 2; i > 0; i--) {
					System.out.println(name + ": " + i); // 印出目前正在 run()內run 的執行緒的名字和i值
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println(name + " interrupted.");
			}
			System.out.println(name + " 結束exiting !");
		}
	}


