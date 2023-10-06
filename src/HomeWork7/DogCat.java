package HomeWork7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DogCat {
	public static void main(String[] args) {
		try {
		File data = new File("C:\\Data\\Object.ser");
		FileOutputStream fis = new FileOutputStream(data);
		ObjectOutputStream ow = new ObjectOutputStream(fis);
		Animal dc[] = new Animal[4];
		dc[0] = new Dog("Dog1");
		dc[1] = new Dog("Dog2");
		dc[2] = new Cat("Cat1");
		dc[3] = new Cat("Cat2");
		
		for(int i = 0;i < dc.length; i++) {
		ow.writeObject(dc[i]);
		}
		ow.close();
		fis.close();
		}catch(FileNotFoundException e){
		e.printStackTrace();
		}catch(IOException e) {
		e.printStackTrace();
		}
	
	}
}
