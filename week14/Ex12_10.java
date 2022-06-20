import java.io.File;
import java.util.Scanner;

public class Ex12_10 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(new File("C:/JavaTest/data2.txt"));
		
		int hap = 0;
		
		while(sc.hasNextLine()) //파일의 마지막까지 무한 반복한다
			hap += sc.nextInt();
		
		System.out.println("합계: " +hap);
		sc.close();

	}

}
