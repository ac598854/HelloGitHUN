package xxx;


//其一為Animal，其年紀和體重分別為3歲、8.0公斤
//- 另一為Elephant，其年紀、體重和種類名稱分別為8歲、120
public class PolyAnimal {
	public static void main(String[] args) {
	Animal[] a = new Animal[2]; // 宣告員工陣列,準備置入員工3人
	a[0] = new Animal(3, 8.0F);
	a[1] = new Elephant(8,1200.0f,"Elephant");
	for (int i = 0; i < a.length; i++)
		a[i].speak();
}
}