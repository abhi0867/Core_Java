import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class ReadByKeyBorad {
private static Reader isReader;

public static void main(String[] args)throws Exception {
	
	System.out.println("plz enter here...");
	InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isReader);
	
	FileWriter write = new FileWriter("C:\\Users\\DELL\\Desktop\\keyboard\\ram");
	PrintWriter out = new PrintWriter(write);
	
	String line =in.readLine();
	 
	while(!(line.contentEquals("100 likes"))) {
		
		out.println(line);
		line= in .readLine();
		z
	}
	
	System.out.println("This Compiler is stopped....!!!!");
	
	out.close();
	write.close();
	in.close();
	isReader.close();
}
}
