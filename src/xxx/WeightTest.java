package xxx;

public class WeightTest {
	public static void main(String[] args) {
		Weightable[] a = new Weightable[3];
		a[0] = new Plane();
		a[1] = new Powder();
		a[2] = new Dog();
		for (int i = 0; i < a.length; i++)
			a[i].printWeightTool();
//		a[0].getWeight();
}
}
