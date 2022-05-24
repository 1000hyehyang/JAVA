import java.util.Scanner;

public class Ex10_11 {

	static int coffee_machine(int button){
		
		System.out.printf("\n#1. (자동으로)뜨거운 물을 준비한다\n");
		System.out.printf("#2. (자동으로)종이컵을 준비한다\n");
		
		switch(button) {
		case 1:
			System.out.printf("#3. (자동으로)보통커피를 탄다\n"); break;
		case 2:
			System.out.printf("#3. (자동으로)설탕커피를 탄다\n"); break;
		case 3:
			System.out.printf("#3. (자동으로)블랙커피를 탄다\n"); break;
		default:
			System.out.printf("#3. (자동으로)아무거나 탄다\n"); break;
		}
		System.out.printf("#4.(자동으로)물을 붓는다\n\n");
		System.out.printf("#5.(자동으로)스푼으로 저어서 녹인다\n");
		
		return 0;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("A님, 어떤 커피를 드릴까요? 1.보통, 2.설탕, 3.블랙");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("A님 주문하신 커피 나왔습니다~\n\n");
		
		System.out.printf("B님, 어떤 커피를 드릴까요? 1.보통, 2.설탕, 3.블랙");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("B님 주문하신 커피 나왔습니다~\n\n");
		
		System.out.printf("C님, 어떤 커피를 드릴까요? 1.보통, 2.설탕, 3.블랙");
		coffee = sc.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("C님 주문하신 커피 나왔습니다~\n\n");
	}

}
