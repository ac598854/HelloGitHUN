package HomeWork7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {
	public static void main(String[] args) {
		copyFile("c:\\javawork\\hello2.txt","c:\\javawork\\write.txt");
	}
	
	
	
	public static void copyFile(String read,String write) {
		try {
			FileReader fr = new FileReader(read);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter wr = new FileWriter(write , false);
			BufferedWriter bw = new BufferedWriter(wr);
			PrintWriter pw = new PrintWriter(bw);
			int c;
			while((c = br.read()) != -1) {
				pw.write(c);
				System.out.print((char)c);
				
			}
			pw.close();
			bw.close();
			wr.close();
			br.close();
			fr.close();
			} catch (FileNotFoundException e) {	
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
		}
		}
		
	}

	


