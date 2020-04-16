package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\thierry.bitz\\git\\Java_Jumper\\src\\exceptions\\test.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String text = null;
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (IOException e) { // FileNotFoundException | IOException verboten weil Spezialisierung von IOException
			System.out.println(e);
		} 
	}

}
