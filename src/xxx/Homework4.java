package xxx;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
//		1.有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
//		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int sum = 0;
//		for (int n = 0; n < x.length; n++) {
//			sum += x[n];
//		}
//		System.out.println("平均="+sum / x.length);
//		System.out.println("==========================");
//		for (int n = 0; n < x.length; n++) {
//			if (x[n] > (sum / x.length)) {
//				System.out.println("大於平均="+x[n]);
//			}
//		}
//	2.請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
//		System.out.println(new StringBuffer("Hello world!").reverse());
		String[] hw = new String[1];
		String a = "Hello World";
		for (int i = 0; i < hw.length; i++) {
			for (int j = 11; j <= 11 && j >= 1; j--) {
				hw[i] = a.substring((j - 1), j);

				System.out.print(hw[i]);
			}
		}
	
	
	
	
	
	}
}
