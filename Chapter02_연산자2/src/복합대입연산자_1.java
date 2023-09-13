// *=, /=
/*
 *	int a=10;
 *	a*=20; => a=a*20; => a=10*20;
 *
 *	int a=10;
 *	a/=3; => a=a/3; => a=10/3;
 */
public class 복합대입연산자_1 {

	public static void main(String[] args) {
		int a=10;
		a*=20;
		System.out.println(a);
		a/=3;
		System.out.println(a);
		
		final int A=10;
		int b=A*20;
		System.out.println(b);
		b=A/3;
		System.out.println(b);
	}

}
