package HomeWork10;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


public class HW10_2 {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入一個數字");
			double number = 0;
			
			while (true) {

				String in = sc.nextLine();
				String sing = "^(-?)\\d+(\\.\\d+)?$"; 

				if (in.matches(sing)) {
					number = Double.parseDouble(in);
					formatter(sc, number);
					break;
				} else {
					System.out.println("輸入格式不對，請輸入任意數");

				}

			}
			sc.close();
		}

		public static void formatter(Scanner sc, double number) {

			System.out.println("欲格式化成：(1)千分位(2)百分比(3)科學記號");

			while (true) {
				int a = sc.nextInt(); 

				NumberFormat nf;

				switch (a) {
				case 1:
					nf = NumberFormat.getInstance();
					System.out.println(nf.format(number));
					return;

				case 2:
					nf = NumberFormat.getPercentInstance();
					System.out.println(nf.format(number));
					return;

				case 3:
					DecimalFormat df = new DecimalFormat("0.###E0");
					System.out.println(df.format(number));
					return;

				default:
					System.out.println("請選擇1到3");
					continue;
				}
			}
		}
	}

