package HomeWork9;


class Money {

		private int stock = 0;

		synchronized public void produce(int qty) {
			while (stock > 3000) {
				System.out.println("媽媽看到帳戶餘額超過3000，暫停匯款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stock += qty;
			System.out.println("媽媽存了：" + qty + "；帳戶共有：" + stock);
			notify();
		}

		synchronized public void consume(int qty) {
			while (stock < qty) {
				System.out.println("大雄發現帳戶餘額不足，暫停提款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stock -= qty;
			System.out.println("大雄領了：" + qty + "；帳戶共有" + stock);
			if (stock < 2000) {
				System.out.println("媽媽被大雄要求匯款");
				notify();
			}
		}
	}

	class Producer extends Thread {
		Money money;

		public Producer(Money money) {
			this.money = money;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				money.produce(2000); 
		}
	}

	class Consumer extends Thread {
		Money money;

		public Consumer(Money money) {
			this.money = money;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				money.consume(1000); 
	}
}
	public class TestMoney {
		public static void main(String[] args) {
			Money money = new Money();
			Producer producer = new Producer(money);
			Consumer consumer = new Consumer(money);
			producer.start();
			consumer.start();
		}
	}
