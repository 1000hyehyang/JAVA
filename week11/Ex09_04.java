
public class Ex09_04 {

	public static void main(String[] args) {
		int aa[] = new int[100];
		int bb[] = new int[100];
		int i;
		
		for(i=0; i<100; i++) {
			aa[i]=i*2;
		}
		for(i=0; i<100; i++) {
			bb[i]=aa[99]-aa[i];
		}
		System.out.printf("bb[0]ดย %d, bb[99]ดย %d ภิทยตส\n", bb[0], bb[99]);
	}

}
