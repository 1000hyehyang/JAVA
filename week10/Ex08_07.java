
public class Ex08_07 {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=100; i++) {
			System.out.printf("for문을 %d회  실행했습니다.\n", i);
			break; //무조건 for문을 빠져나가므로 1번 실행된다.
		}

		System.out.printf("for문을 종료했습니다.\n");
	}

}
