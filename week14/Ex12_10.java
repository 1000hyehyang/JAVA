import java.io.File;
import java.util.Scanner;

public class Ex12_10 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(new File("C:/JavaTest/data2.txt"));
		
		int hap = 0;
		
		while(sc.hasNextLine()) //������ ���������� ���� �ݺ��Ѵ�
			hap += sc.nextInt();
		
		System.out.println("�հ�: " +hap);
		sc.close();

	}

}
