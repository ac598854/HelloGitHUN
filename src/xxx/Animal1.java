package xxx;

public class Animal1 {
	private int age;
	private float weight;
	public Animal1(int age,float weight) {
		this.age=age;
		this.weight=weight;
	}
	public void speak() {
		System.out.println("age="+age);
		System.out.println("weight="+weight);
	}
	public static void main(String[] args) {
		Animal1 x=new Animal1(2,5.0f);
		x.speak();
	}


}
