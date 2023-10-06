package xxx;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5_1 {
	
	public static void main(String[] args) {
		
		String code=genAuthCode();
		System.out.println(code);
		q1();
	}
	public static String genAuthCode() {
		Random random=new Random();
		String x="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String a="";
		for(int i=0;i<8;i++) {
			int index=random.nextInt(x.length());
			char code=x.charAt(index);
			a+=code;
		}
		return a;
	}
 	public static void q1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int i, j;
		i = sc.nextInt();
		j = sc.nextInt();
		sc.close();
		starSquare(i, j);
	}
	public static void starSquare(int height, int width) {
		int[][] x = new int[height][width];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

	 

