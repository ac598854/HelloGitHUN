package xxx;


	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;
	//1~49取6個不重複的數字
	public class pratice1_49 {
		public static void main(String[] args) {
			Set set = new HashSet();
//			
//			for(int i=0;i<6;i++) { //遇到重複就有可能會少
//			int x = (int) (Math.random() * 49)+1;
//			set.add(x);
//			}
			while(set.size()!=6) { //set.size()取得數量
				int x = (int) (Math.random() * 49)+1;
				set.add(x);
			}
			Iterator objs = set.iterator();
			while (objs.hasNext())
			System.out.println(objs.next());

		
	}
}
