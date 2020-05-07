package io;
import java.io.*;
public class Dispatcher {

	public static void main(String[] args) throws FileNotFoundException, IOException{
	File f1 = new File("C:/Users/Zeus/eclipse-workspace/io/src/io/file1");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	String temp = null;
	while ((temp = br.readLine()) !=null) {
		System.out.println(temp);
	}
	br.close();
	FileWriter fw = new FileWriter(f1, true);	
	PrintWriter pw = new PrintWriter(fw);
//	PrintWriter pw = new PrintWriter(f1);
	pw.println("Ann");
	pw.println("Max");
	pw.flush();
	pw.close();
	}
}
