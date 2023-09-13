/*
 *	비교연산자의 결과값 => boolean(true,false)
 *	숫자(정수,실수,boolean,문자) 비교, 문자열은 비교 불가
 *	boolean형은 ==, !=만 사용, 문자는 어떤 연산자를 사용해도 정수형으로 변경
 *
 *	1. == 같다
 *	2. != 같지 않다
 *	3. < 작다
 *	4. > 크다
 *	5. <= 작거나 같다
 *	6. >= 크거나 같다
 *
 */
public class 비교연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		//    ㅡㅡㅡ2ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ1ㅡㅡ3
		int b=(int)(Math.random()*100)+1;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b)); // a<b || a==b
		System.out.println("a>=b:"+(a>=b)); // a>b || a==b
		
		char c=(char)((Math.random()*26)+'A'); // 랜덤 알파벳
		char d=(char)((Math.random()*26)+'a');
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("c==d:"+(c==d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
		
		boolean b1=false;
		boolean b2=true;
		System.out.println("b1==b2:"+(b1==b2));
		System.out.println("b!=b2:"+(b1!=b2));
	}
}
