package xxx;

//請建立一個TestBMI.java,並計算自己的BMI值後輸出,另加入判
//斷結果為過瘦、正常或是過重
//• 提示一:BMI公式為體重(kg) / 身高2(m)
//• 提示二:BMI<18.5為過瘦,18.5≦BMI<24為正常、BMI≧24為過胖 
//• 提示三:運算子 + if – else判斷
public class TestBMI {
	public static void main(String[] args) {
		double ht = 1.77, wt = 60, BMI = wt / (ht * ht);
		if (BMI >= 18.5 && BMI < 24)
			System.out.println("正常");
		else if (24 <= BMI)
			System.out.println("過胖"); // 
		else if (BMI < 18.5)
			System.out.println("過瘦");
//      else
//			System.out.println("正常"); 不是過胖或過瘦就是正常

	}
}
