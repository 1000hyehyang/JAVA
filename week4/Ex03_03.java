
public class Ex03_03 {

	public static void main(String[] args) {
		int a,b,c,d;
		
		a=100+100;
		b=a+100;
		c=a+b-100;
		d=a+b+c;
		System.out.printf("a,b,c,dÀÇ °ª ==> %d, %d, %d, %d \n", a, b, c, d);
		
		a=b=100; 
		c=d=200;
		System.out.printf("a,b,c,dÀÇ °ª ==> %d, %d, %d, %d \n",a,b,c,d);
		
		a=100;
		a=a+200;
		System.out.printf("aÀÇ °ª ==> %d \n", a);
		

	}

}
