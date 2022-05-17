
public class Ex09_08 {

	public static void main(String[] args) {
		int aa[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int i,k;
		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
		for(i=0; i<3; i++){
			for(k=0; k<4; k++) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.printf("\n");
		}

	}

}
