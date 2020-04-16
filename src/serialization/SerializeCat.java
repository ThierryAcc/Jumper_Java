package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import inheritance.Cat;
import inheritance.Collar;

public class SerializeCat {

	public static void main(String[] args) {
		Cat c1 = new Cat("Kot", 0, new Collar("green", 5));
		Cat c2 = new Cat("Kit", 1, new Collar("red", 10));
		Cat c3 = new Cat("Kat", 2, new Collar("blue", 20));
		List<Cat> catList = new ArrayList<>();
		catList.add(c1);
		catList.add(c2);
		catList.add(c3);
		
		File file = new File("C:\\Users\\thierry.bitz\\git\\Java_Jumper\\serialized\\cats.ser");

		// auto-closable
		try (FileOutputStream fs = new FileOutputStream(file);
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(catList);
			System.out.println("serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
