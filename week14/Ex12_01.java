
public class Ex12_01 {
	public static void main(String[]args) {
		int[]aa = new int[3];
		try {
			aa[3] = 100;
		}catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException�� �迭�� �ε����� ���� ũ�⺸�� ū ��쿡 �߻��ϴ� ����
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~");
		}
	}
}
