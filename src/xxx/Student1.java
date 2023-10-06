package xxx;
//請新增一個Student類別，並宣告一個屬性為score，型別為int，另宣告兩
//個方法分別為play()與study()，功能如下：
//• public void play(int hours)
//每休息一個小時，score就會減1
//• public void study(int hours)
//每讀書一個小時，score就會加1
//• 該類別完成後，請在main方法裡創建兩個student物件，並藉由呼叫play()
//與study()並取得分數是否正確
public class Student1 {
	int score=90;
	public void play(int hours) {
		score-=hours;
	}
	public void study(int hours) {
		score+=hours;
	}
    public static void main(String[] args) {
    	Student1 myscore=new Student1();
    	Student1 yourscore=new Student1();
    	System.out.println(myscore.score);
    	System.out.println(yourscore.score);
    }
}
