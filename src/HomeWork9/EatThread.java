package HomeWork9;

public class EatThread extends Thread{
	int counter = 1;
	String name;
	Thread t;
	public EatThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		t.start();
		
	};
	public void run() {
		while(counter < 11) {
			System.out.println(name+"吃第"+counter+"碗飯");
			counter++;
			try {
				int t = (int) (Math.random()*(3000-500+1)+500);
				Thread.sleep(t);
			}catch(Exception e) {
			}
	}
	}
	public static void main(String[] args) {
		EatThread t1 = new EatThread("饅頭人");
		EatThread t2 = new EatThread("詹姆士");
		try {
			System.out.println("-----大衛王比賽開始!-----");
			t1.t.join();
			t2.t.join();
		} catch (Exception e) {
			
		}
		System.out.println("-----大衛王比賽結束!-----");
	}
}

