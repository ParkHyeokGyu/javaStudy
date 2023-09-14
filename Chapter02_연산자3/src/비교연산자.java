/*
 *	정수,실수,문자 비교 시 사용 => boolean
 *	
 *	비교연산자
		==
		!=
		<
		>
		<=
		>=
 */
public class 비교연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*3)+1;
		int b=(int)(Math.random()*3)+1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		char c=(char)((Math.random()*3)+65);
		char d=(char)((Math.random()*3)+65);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c<d);
		System.out.println(c>d);
		System.out.println(c<=d);
		System.out.println(c>=d);
	}
}
