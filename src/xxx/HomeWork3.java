package xxx;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {

////	1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
////	三角形、其它三角形或不是三角型
//		Scanner sc = new Scanner(System.in);
//		double a=0, b=0, c=0;
//		System.out.println("請輸入:三個數字用");
//		if (sc.hasNextDouble()) {
//			a = sc.nextDouble();
//		}
//		if (sc.hasNextDouble()) {
//			b = sc.nextDouble();
//		}
//		if (sc.hasNextDouble()) {
//			c = sc.nextDouble();
//		}
//		if (a + b > c && a + c > b && b + c > a) {
//			if (a == b && b == c) {
//				System.out.println("正三角形");
//			} else if (a == b || b == c || c == a) {
//				System.out.println("等腰三角形");
//			} else {
//				System.out.println("其他三角形");
//			}
//		} else {
//			System.out.println("不是三角形");
//		}
//	2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息
//
//		System.out.println("請輸入一個0~9的整數:");
//		int x = (int) (Math.random() * 9);
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			double a = 0;
//			if (sc.hasNextDouble()) {
//				a = sc.nextDouble();
//					if (a != x) {
//						System.out.println("猜錯囉");
//					} else if (a == x) {
//						System.out.println("答對了答案就是" + x);
//						break;
//					}
//
//			}
//		}
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數

		System.out.println("阿文...請輸入你討厭哪個數字");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			double a = 0;
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
					int count = 1;
					if (a < 10 && a >= 1) {
						for (int n = 1; n <= 49; n++) {
							if ((n - a) % 10 != 0 && (n / 10) != a) {
								System.out.println(n);
								System.out.println();
								count++;
							}
						}
						System.out.println("總共有" + count + "數字可以選擇");

						break;
					} else {
						System.out.println("請輸入1~9的數字");
						
					}
			}
		}
	
	
	
	
	}
}
