package xxx;

public class HomeWork2 {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)		
			int y=0;
				for(int x=1;x<=1000;x++) {
				if(x%2==0) {
					y+=x;
					}
				}
				System.out.println(y);
				System.out.println();
		//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
				int a=1;
				for(int b=1;b<=10;b++) {
					a=a*b;
					}
				System.out.println(a);
				System.out.println();
		//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
				int k=1,o=1;
				while(o<=10) {
					k*=o;
					o++;
				}
			System.out.println(k);
			System.out.println();
		//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100	
				int q,g=1;
				while(g<=10) {
				q=g*g;
				System.out.println(q);
				g++;
				}
				System.out.println();
		//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
				
				int count=1;
				for(int n=1;n<=49;n++){
					if((n-4)%10!=0&&(n/10)!=4) {
				System.out.println(n);
					count++;	
					}
					}
				System.out.println(count);
				System.out.println();

//			 請設計一隻Java程式,輸出結果為以下:
//					1 2 3 4 5 6 7 8 9 10
//					1 2 3 4 5 6 7 8 9
//					1 2 3 4 5 6 7 8
//					1 2 3 4 5 6 7
//					1 2 3 4 5 6
//					1 2 3 4 5
//					1 2 3 4
//					1 2 3
//					1 2
//					1
				for (int i = 10; i >= 1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print(j + " ");
					}
					System.out.println();

				}
				System.out.println();
////				• 請設計一隻Java程式,輸出結果為以下:
//					A
//					BB
//					CCC
//					DDDD
//					EEEEE
//					FFFFFF
				
				for (int l = 0; l <=5; l++) {
					for (int r = 0; r <= l; r++) {
					char let=(char)('A'+l);//宣告let是字符,將Ascll碼中的A+變量再強制轉換回字符
						System.out.print(let);
					}
					System.out.println();
				}
			}
}
