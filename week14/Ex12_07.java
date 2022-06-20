import java.io.FileInputStream;

public class Ex12_07 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis = new FileInputStream("c:/JavaTest/data1.txt");
		
		int ch;
		
		while((ch = fis.read())!=-1)
			System.out.print((char)ch);
		
		fis.close();
	}

}

