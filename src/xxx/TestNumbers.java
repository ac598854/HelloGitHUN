package xxx;

//請建立一個Test4Numbers.java,可輸出0~100裡4的倍數
public class TestNumbers {
	public static void main(String[] args) {
		for (int i=0;i<=100;i++) {
			if(i%4==0)
			System.out.print(i+" ");
		}
		System.out.println();//換行
		for (int i=0;i<=100;i+=4) {
				if(i%4==0)
				System.out.print(i+" ");
		
	   
			
		}
	}
}
	
