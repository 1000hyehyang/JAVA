import java.util.Scanner;

public class Ex06_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("´ç½ÅÀÇ Ãâ»ı¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
		year = s.nextInt();
		switch(year%12) {
		case 0: System.out.printf("¿ø¼şÀÌ¶ì\n"); break;
		case 1: System.out.printf("´ß¶ì\n"); break;
		case 2: System.out.printf("°³¶ì\n"); break;
		case 3: System.out.printf("µÅÁö¶ì\n"); break;
		case 4: System.out.printf("Áã¶ì\n"); break;
		case 5: System.out.printf("¼Ò¶ì\n"); break;
		case 6: System.out.printf("È£¶ûÀÌ¶ì\n"); break;
		case 7: System.out.printf("Åä³¢¶ì\n"); break;
		case 8: System.out.printf("¿ë¶ì\n"); break;
		case 9: System.out.printf("¹ì¶ì\n"); break;
		case 10: System.out.printf("¸»¶ì\n"); break;
		case 11: System.out.printf("¾ç¶ì\n"); break;
				
		}

	}

}
