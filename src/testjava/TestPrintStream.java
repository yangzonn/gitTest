package testjava;
import java.io.*;

public class TestPrintStream {
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("/Users/ryousei/Desktop/practise/unicode.txt");
			ps = new PrintStream (fos);
		}catch (IOException e) {
			e.printStackTrace();
		}if (ps !=null) {
			System.setOut(ps);
		}
		int in = 0;
		for(char c =0; c<=60000; c++) {
			System.out.print(c+" ");
//			if (in++ >=100) {
//				System.out.println();
//				in = 0;
//			}
			in ++;
			if (in %100==0){
			System.out.println();
		}
		}
	}
}


      