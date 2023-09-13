// <<=, >>= 쉬프트 연산자(비트이동연산자)
/*
 *	<< : 비트를 왼쪽으로 이동
 *	>> : 비트를 오른쪽으로 이동
 */
public class 복합대입연산자_2 {
	public static void main(String[] args) {
		int a=27;
		a<<=3;
		System.out.println(a);
		a=27;
		a>>=3;
		System.out.println(a);
		
		a=33;
		a<<=2;
		System.out.println(a);
		a=33;
		a>>=2;
		System.out.println(a);
	}
}
