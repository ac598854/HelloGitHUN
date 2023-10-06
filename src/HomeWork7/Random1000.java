package HomeWork7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Random1000 {
	public static void main(String[] args) {
		int a ;
		try {
			FileWriter fw = new FileWriter("c:\\javawork\\Data.txt",false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 0; i < 10; i++) {
			a = (int) (Math.random()*1000+1);
			pw.write(Integer.toString(a)+"\n");
			}
			pw.close();
			bw.close();
			fw.close();
			} catch (IOException e) {
				e.printStackTrace();
	}

	}
}


