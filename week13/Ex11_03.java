
public class Ex11_03 {

	static int a = 100; //전역변수 a
	
	static void func1() {
		int a = 200; //지역변수 a
		System.out.printf("func1()에서 a의 값 ==> %d\n", a);
	}
	public static void main(String[] args) {
		func1();
		System.out.printf("main()에서 a의 값==> %d\n", a);
	}
}
