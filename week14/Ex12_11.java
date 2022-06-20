import java.io.FileOutputStream;

public class Ex12_11 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/JavaTest/data3.txt");
		
		int ch;
		
		while((ch = System.in.read())!=13)
			fos.write((byte)ch);
			
			fos.close();

	}

}
