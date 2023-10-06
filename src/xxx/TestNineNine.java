package xxx;

public class TestNineNine {
	public static void main(String[] args) {
//一:使用for迴圈 + while迴圈
		for (int x=1 ; x <= 9; x++) {
			int y=1;
			while (y <= 9) {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			}
			System.out.println();
		}
		System.out.println();
//二:使用for迴圈 + do while迴圈
		for(int a=1;a<=9;a++) {
			int b=1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}while(b<=9);
			System.out.println();
		}
		System.out.println();
//三:使用while迴圈 + do while迴圈
		int d=1;
		while(d<=9) {
			int e=1;
			do {
				System.out.print(d + "*" + e + "=" + d * e + "\t");
				e++;
				}while(e<=9);
			System.out.println();
				d++;
			}
		System.out.println();
//for for
		for(int w=1;w<=9;w++) {
			for(int q=1;q<=9;q++) {
				System.out.print(w + "*" + q + "=" + w * q + "\t");
			}
			System.out.println();
		}
		}

	}
