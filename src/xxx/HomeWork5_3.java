package xxx;

public class HomeWork5_3 {
	public static void main(String[] args) {
		q3();
	}
	public static void q3() {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doublearray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Work3 w = new Work3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doublearray));
		}
	}
	class Work3 {
		public double maxElement(double[][] x) {
			int max = 0, imax = 0;
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					if (x[i][j] > x[imax][max]) {
						max = j;
						imax = i;

					}
				}
			}
			return x[imax][max];
		}
		public int maxElement(int[][] x) {
			int max = 0, imax = 0;
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					if (x[i][j] > x[imax][max]) {
						max = j;
						imax = i;

					}
				}
			}
			return x[imax][max];
		}
}
