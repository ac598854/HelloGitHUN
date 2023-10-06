package xxx;

public class Student {
   int score=90;
   public void play(int hours) {
	   score-=hours;
   }
   public void study(int hours) {
	   score+=hours;
   }
//   public void showInfo() {
//	}
		
   public static void  main(String[] args) {
	   Student myscore=new Student();
	   Student yourscore=new Student();
	   System.out.println(myscore.score);
	   System.out.println(yourscore.score);
//	   myscore.showInfo();
   
   }
}

