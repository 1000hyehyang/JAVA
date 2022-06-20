import java.io.FileWriter;
import java.util.Scanner;

public class Ex12_12 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/JavaTest/data4.txt");
		String str;
		
		while(!(str=sc.nextLine()).equals(""))
			fw.write(str+"\r\n");
		
		fw.close();

	}

}
