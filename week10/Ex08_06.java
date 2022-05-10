import java.util.Scanner;

public class Ex08_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n 손님 주문하시겠습니까? \n");
			System.out.printf("<1>아메리카노 <2>카페라떼<3>카푸치노<4>그만 할래요 = > ");
			
			menu = sc.nextInt();
			
			switch(menu){
				case 1:
					System.out.printf("주문하신 아메리카노 나왔습니다.\n"); break;
				case 2:
					System.out.printf("주문하신 카페라떼 나왔습니다.\n"); break;
				case 3:
					System.out.printf("주문하신 카푸치노 나왔습니다.\n"); break;
				case 4:
					System.out.printf("안녕히 가십시오.\n"); break;
				default:
					System.out.printf("잘못 주문하셨습니다.\n"); break;
			}
		}while(menu != 4);
	}
}
