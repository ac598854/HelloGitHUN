package xxx;

public class HomeWork1 {
	public static void main(String[] args) {
		// 1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
		// 2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int e = 200, f = 12;
		System.out.println(e / f);
		System.out.println(e % f);
		// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int g = 256559;
		int day = g / 60 / 60 / 24;
		int hour = g / 60 / 60 - day * 24;
		int min = g / 60 - (hour + day * 24) * 60;
		int sec = g % 60;
		System.out.println(day + "天" + hour + "小時" + min + "分鐘" + sec + "秒");

		// 4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double area = 5 * 5 * PI;
		double pm = 5 * 2 * PI;
		System.out.printf("area= %.3f%n",area);
		System.out.printf("pm= %.3f%n",pm);
		System.out.println("面積"+area);
		System.out.println("周長"+pm);
		// 5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		// 金加利息共有多少錢 (用複利計算,公式請自行google)
		// 本利和=初期本金x(1+每期利率)^期數
		int x = 1500000;
		double y = 0.02;
		double h = (1 + y);
		double money=x*Math.pow(h, 10);//次方運算
		//double money = x * h * h * h * h * h * h * h * h * h * h;
		System.out.println((int) money);

		// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5’
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); // 5+5的運算結果
		System.out.println(5 + '5');// ''內為字符,在ASCLL 編碼中'5'為53 結果為5+53
		System.out.println(5 + "5");// 字串連接
	}
}
