package xxx;

public class HomeWork5_2 {
public static void main(String[] args) {
	randAvg();
}
public static void randAvg() {
	int[] x=new int[10];
	int sum=0,avg;
	for(int i=0;i<x.length;i++) {
		x[i]=(int) (Math.random()*100);
		sum+=x[i];
		System.out.print(x[i]+" ");
	}
	System.out.println();
	avg=sum/x.length;
	System.out.println(avg);
}
}
