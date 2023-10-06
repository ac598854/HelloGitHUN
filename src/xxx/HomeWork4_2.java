package xxx;

import java.util.Scanner;

public class HomeWork4_2 {
		public static void main(String[] args) {
			
//		3.有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
//				String[] words = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		        int Count = 0;
//
//		        for (String word :words) {   	    	//	for迴圈的一種方法 提出 words中的每個字串指定給左邊的word
//		            for (int i = 0; i < word.length(); i++) {
//		                char ch = word.charAt(i);   	// 	提出字串中的每個字符指定給ch
//		                if (isVowel(ch)) {          	//	呼叫isVowel()方法
//		                    Count++;
//		                }
//		            }
//		        }
//
//		        System.out.println("字串中總共有" + Count + " 個母音。");
//		   	}
//		 	public static boolean isVowel(char ch) {
//		        ch = Character.toLowerCase(ch);  //	每個大寫的字母換成小寫 小寫不改變
//		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

//		4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		System.out.println("要借多少錢:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double a = 0;
		int count = 0;
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
			System.out.println("有錢可借的員工編號:");
			int[][] x = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
			for (int i = 0; i <1; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[1][j] >= a) {
					System.out.println(x[0][j]);
					count++;
				};
			}
			}
			System.out.println("共" + count + "人!");
		}
}
}