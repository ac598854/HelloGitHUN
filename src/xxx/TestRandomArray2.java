package xxx;

public class TestRandomArray2 {
	
	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2();//為了要使用方法所以創建一個物件?
		//是 因為方法裡面沒有static
		int[][] x = tra.getRandomArray();//tra?將X陣列的資料存在tra裡面
		int[][] y = tra.getRandomArray();
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printArray(x); //為甚麼不用打成tra.printArray(int[][] x)int[][]是宣告 在使用方法時只需要給值
		tra.printArray(y);
		tra.printArray(z);//為甚麼要打tra 使用tra物件裡面的方法? 
//		ans:我不能直接在main方法裡使用其他方法(static)所以必須用物件來呼叫方法
	}
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				int r = (int)(Math.random() * 31);
				data[i][j] = r;
			}
		}
		return data;
	}
	
	public  void  printArray(int[][] xxx) {
		for (int i = 0; i < xxx.length; i++) {
			for (int j = 0; j < xxx[i].length; j++) {
				System.out.print(xxx[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================");
	}
	
}
