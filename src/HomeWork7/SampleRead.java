package HomeWork7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead {
    	public static void main(String args[]) {
            String i;
            int bytecount = 0;
            int charcount = 0;
            int linecount = 0;
            try {
            	FileReader fr = new FileReader("c:\\javawork\\Sample.txt");
            	BufferedReader br = new BufferedReader(fr) ;
                while ((i = br.readLine()) != null) {
                bytecount += i.getBytes().length;   
                charcount += i.length();
                linecount++;
                }
                System.out.println(bytecount);
                System.out.println(charcount);
                System.out.println(linecount);
                br.close();
                fr.close();
            } catch(IOException e){
            	e.printStackTrace();
            }
        }
    }


