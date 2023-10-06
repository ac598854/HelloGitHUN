package HomeWork7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws Exception{
		FileInputStream ips = new FileInputStream("C:\\Data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(ips);
		try {
		while(true) {
		((Animal)ois.readObject()).speak();
		}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢！");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		ips.close();
	}
}
