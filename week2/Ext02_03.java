import java.util.Scanner;
public class Ext02_03 {

	public static void main(String[] args) {
		int a,b,c;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ���==>");
		a=s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ���==>");
		b=s.nextInt();
		System.out.print("����° ����� ���� �Է��ϼ���==>");
		c=s.nextInt();
		
		result=a*b*c;
		System.out.println(a+"*"+b+"*"+c+"="+result);
		
	}

}
