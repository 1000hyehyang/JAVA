import java.io.BufferedReader;
import java.io.FileReader;

public class Ex12_09 {

	public static void main(String[] args)throws Exception {
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;
		
		while((str = bReader.readLine())!=null) {
			System.out.println(str);
		}
		
		bReader.close();
		fReader.close();

	}

}
