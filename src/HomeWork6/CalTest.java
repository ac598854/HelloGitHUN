package HomeWork6;


import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Caculator cal = new Caculator();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			System.out.println("請輸入y的值:");
			int y = sc.nextInt();
			System.out.println(cal.powerXY(x, y));
		} catch (CalException e) {
			e.printStackTrace();
		}
	sc.close();
	}
		
}
