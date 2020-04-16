package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import inheritance.Cat;

public class DeserializeCat {

	public static void main(String[] args) {
		List<Cat> catList = new ArrayList<Cat>();
		File file = new File("C:\\Users\\thierry.bitz\\git\\Java_Jumper\\serialized\\cats.ser");

		// auto-closable
		try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			try {
				catList = (List<Cat>) ois.readObject();
				if(catList != null) {
					catList.forEach(System.out::println);
				}
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
