package xxx;

import java.util.Scanner;

public class HomeWork4_3 {
	public static void main(String[] args) {
//	5.請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入 能被4整除，但不能被100整除。能被400整除。)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
//	
//			}
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入年份（yyyy）：");
		int year = scanner.nextInt();

		System.out.print("請輸入月份（mm）：");
		int month = scanner.nextInt();

		System.out.print("請輸入日期（dd）：");
		int day = scanner.nextInt();

		scanner.close();

		if (isValidDate(year, month, day)) {
			int dayOfYear = calculateDayOfYear(year, month, day);
			System.out.println("輸入的日期為該年第" + dayOfYear + "天");
		} else {
			System.out.println("輸入的日期無效");
		}
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static boolean isValidDate(int year, int month, int day) {
		if (year < 1 || month < 1 || month > 12 || day < 1) {
			return false;
		}

		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (isLeapYear(year)) {
			daysInMonth[2] = 29; // February has 29 days in a leap year
		}

		return day <= daysInMonth[month];
	}

	public static int calculateDayOfYear(int year, int month, int day) {
		int[] daysInMonth = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (isLeapYear(year)) {
			daysInMonth[2] = 29;
		}

		int dayOfYear = 0;
		for (int i = 1; i < month; i++) {
			dayOfYear += daysInMonth[i];
		}
		dayOfYear += day;

		return dayOfYear;
	}

}
