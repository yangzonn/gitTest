package testjava;

import java.io.*;

public class TestFileWriter {
	public static void main (String[]args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/ryousei/Desktop/practise/unicode.txt");
			for (int c = 0; c<50000;c ++) {
				fw.write(c);
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("文件写错了");
			System.exit(-1);

	     }
	}
}
