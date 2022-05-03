import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf("¸î ´Ü?: ");
		dan=s.nextInt();
		
		for(i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n",dan, i, dan*i);
		}

	}

}
