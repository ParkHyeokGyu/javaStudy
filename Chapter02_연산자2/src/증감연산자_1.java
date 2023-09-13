/*
 *	증감연산자
 *		1개 증가, 감소 => 반복문에서 주로 사용
 *
 *		전치연산자
 *		++a, --a
 *		후치연산자
 *		a++, a--
 *
 *		int a=10;
 *		int b=++a; => a룰 먼저 중가하고 b에 대입 => a=11, b=11
 *
 *		int a=10;
 *		int b=a++; => b에 a값 대입 후 a를 증가 => a=11, b=10
 *
 *		* a++; == a=a+1; == a+=1;
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		int a=10;
		int b=++a;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=a++;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=++a + ++a + a++;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=a++ + a++ + ++a;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=++a + a++ + ++a + a++;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=a++ + a++ + a++ + a++;
		System.out.println("a:"+a+",b:"+b);
		
		a=10;
		b=a-- + a++ + --a + a++;
		System.out.println("a:"+a+",b:"+b);
	}

}
