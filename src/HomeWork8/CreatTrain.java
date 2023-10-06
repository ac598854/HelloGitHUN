package HomeWork8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CreatTrain {
	public static void hashSetTrain(Train[] array) {
		Set<Train> setTrain = new HashSet();
		Collections.addAll(setTrain, array);
		Iterator itor = setTrain.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		System.out.println("===================================");
	}
	public static void arrayListTrain(Train[] trainArray) {
		List<Train> listTrain = new ArrayList();
		Collections.addAll(listTrain, trainArray);
		Collections.sort(listTrain);
		for(int i = 0; i < listTrain.size(); i++) {
			System.out.println(listTrain.get(i));
		}
		System.out.println("===================================");
	}
	public static void treeSetTrain(Train[] trainArray) {
		Set<Train> setTrain = new TreeSet();
		Collections.addAll(setTrain,trainArray);
		for(Train t:setTrain) {
			System.out.println(t);
		}
		System.out.println("===================================");
	}
	public static void main(String[] args) {
		Train[] trainArray= new Train[7];
		trainArray[0] = new Train(202,"普悠瑪", "樹林", "花蓮", 400);
		trainArray[1] = new Train(1254,"區間", "屏東", "基隆", 700);
		trainArray[2] = new Train(118,"自強", "高雄", "台北", 500);
		trainArray[3] = new Train(1288,"區間", "新竹", "基隆", 400);
		trainArray[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trainArray[5] = new Train(1222,"區間", "樹林", "七堵", 300);
		trainArray[6] = new Train(1254,"區間", "屏東", "基隆", 700);
		hashSetTrain(trainArray);
		arrayListTrain(trainArray);
		treeSetTrain(trainArray);
		
	}
	
}
