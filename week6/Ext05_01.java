import java.util.Scanner;
public class Ext05_01 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int time,hour,minute,second;
	
	System.out.print("##계산할 초는?");
	time = s.nextInt();
	
	hour = time /3600;
	time = time %3600;
	
	minute = time/60;
	time = time %60;
	
	second = time/1;
	
	System.out.printf("\n 시간은 ==> %d시간 ", hour);
	System.out.printf("\n 분은==> %d분 ", minute);
	System.out.printf("\n 초는 ==> %d초", second);
	
	s.close();
}

}
