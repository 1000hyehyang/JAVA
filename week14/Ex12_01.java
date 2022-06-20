
public class Ex12_01 {
	public static void main(String[]args) {
		int[]aa = new int[3];
		try {
			aa[3] = 100;
		}catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException은 배열의 인덱스가 실제 크기보다 큰 경우에 발생하는 오류
			System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
		}
	}
}
