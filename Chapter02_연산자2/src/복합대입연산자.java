// 증감(원하는 갯수 만큼) => 복합대입연산자
/*
 *	+=
 *	-=
 *	*=
 *	/=
 *	&=
 *	^=
 *	|=
 *	>>=
 *	<<=
 *
 *	증가
 *	int a=10;
 *	a++, ++a, a=a+1 => a+=1
 *	a=a+2 => a+=2
 *
 *	감소
 *	a--, --a, a=a-1 => a-=1(문자열 누적,숫자 누적)
 */
public class 복합대입연산자 {

	public static void main(String[] args) {
		int a=10;
		a+=100;
		System.out.println(a);
		a-=50;
		System.out.println(a);
	}

}
