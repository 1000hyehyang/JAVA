
public class Ex11_03 {

	static int a = 100; //�������� a
	
	static void func1() {
		int a = 200; //�������� a
		System.out.printf("func1()���� a�� �� ==> %d\n", a);
	}
	public static void main(String[] args) {
		func1();
		System.out.printf("main()���� a�� ��==> %d\n", a);
	}
}
