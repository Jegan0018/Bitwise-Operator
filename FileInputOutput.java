package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInputOutput {
	public static void main(String[] args) {
		FileInputOutput object = new FileInputOutput();
		object.fileRead();
	}

	private void fileRead() {
		try {
			int countWords = 0;
			File file = new File("FileInputOutput.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			FileWriter filewriter = new FileWriter(file, true);
			String lines = reader.readLine();
			System.out.println(lines);
			String words[] = null;
			int lineCount = 1;
			while (lines != null) {
				lineCount++;
				words = lines.split(" ");
				countWords += words.length;
			}
			System.out.println(lineCount);
			System.out.println(countWords);
			FileReader filereader = new FileReader(file);
			char[] ch = new char[1150];
			filereader.read(ch);
			for (char k : ch) {
				System.out.print(k);
			}
			filereader.close();
			filewriter.write("\nJegan Code");
			filewriter.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
