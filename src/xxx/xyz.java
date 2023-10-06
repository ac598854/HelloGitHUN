package xxx;

public class xyz {
	public static void main(String[] args) {
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int z[][]=new int[3][3];
			
		//0~30 Math.random()取一個0.0<=r<1.0之間的數
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				x[i][j]=(int)(Math.random()*31);
				y[i][j]=(int)(Math.random()*31);
				z[i][j]=x[i][j]+y[i][j];
				System.out.println(x[i][j]+"\t");
				System.out.println();
				System.out.println(y[i][j]);
				System.out.println();
				System.out.println(z[i][j]);
				System.out.println();

		}
		}
	}
}
