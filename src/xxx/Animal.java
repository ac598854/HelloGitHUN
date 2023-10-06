package xxx;
//此類別有兩個成員變數分別為age(年紀 - 型別int)、weight(體重 - 型別float)
//• 此類別需宣告有參數的建構子
//• 有一成員方法名為speak()，用以列印上述兩個值
//• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//公斤，並呼叫speak方法得到此Animal的成員變數值
public class Animal {
	
	private int age;
	private float weight;
	
	public Animal() {
		super();
//		保留無參數的建構子
//		1.方便給子類別建構子對應
//		2.給日後搭備的框架(工具),幫我們建立物件
//		3.也是java Bean的規範之一
	}
	
	
	public Animal(int age,float weight) {
		super();
		this.age=age;
		this.weight=weight;
	}
	public void speak() {
		System.out.println("age="+age);
		System.out.println("weight="+weight);
//		return "age="+age+"weight="+weight;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public int getAge(){
		System.out.println("age="+age);
		return(age);
	}
	public float getWeight(){
		System.out.println("weight="+weight);
		return(weight);
	}
	
}

