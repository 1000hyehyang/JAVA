import java.util.Scanner;
public class Ext05_01 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int time,hour,minute,second;
	
	System.out.print("##����� �ʴ�?");
	time = s.nextInt();
	
	hour = time /3600;
	time = time %3600;
	
	minute = time/60;
	time = time %60;
	
	second = time/1;
	
	System.out.printf("\n �ð��� ==> %d�ð� ", hour);
	System.out.printf("\n ����==> %d�� ", minute);
	System.out.printf("\n �ʴ� ==> %d��", second);
	
	s.close();
}

}
