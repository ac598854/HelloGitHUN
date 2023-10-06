package xxx;
//6.請算出每位同學考最高分的次數
public class HomeWork4_4 {
	public static void main(String[] str) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
		int[][] x = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75} };
		int maxIndex = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > x[i][maxIndex]) {
					maxIndex = j;
				}
			}
			switch (maxIndex) {
			case (0):
				a++;
				break;
			case (1):
				b++;
				break;
			case (2):
				c++;
				break;
			case (3):
				d++;
				break;
			case (4):
				e++;
				break;
			case (5):
				f++;
				break;
			case (6):
				g++;
				break;
			case (7):
				h++;
				break;
			}

		}
		speak(1, a);
		speak(2, b);
		speak(3, c);
		speak(4, d);
		speak(5, e);
		speak(6, f);
		speak(7, g);
		speak(8, h);
	}

	public static void speak(int number, int time) {
		System.out.println(number + "號" + time + "次");
	}

}
