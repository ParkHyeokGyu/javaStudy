// &&(직렬연산자), ||(병렬연산자)
/*
 *	&& : 기간이나 범위안에 포함
 *	|| : 기간이나 범위가 아닌 경우
 *	
 *	조건에 사용 할 수 있는 연산자 => 부정연산자,비교연산자
 *	(조건)&&(조건), (조건)||(조건)
 *
 *			&&	||
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *	T	T	T	T
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *	T	F	F	T
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *	F	T	F	T
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *	F	F	F	F
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *
 *	&&, ||는 효율적인 연산을 수행한다
 *		&& => 앞이 false일 경우, 뒤에 있는 조건은 수행하지 않는다
 *		|| => 앞이 true일 경우, 뒤에 있는 조건은 수행하지 않는다
 */
public class 논리연산자 {
	public static void main(String[] args) {
//		int a=10;
//		int b=9;
//		
//		boolean bCheck=a<b && ++b==a; // 앞의 조건이 false이기때문에, 뒤의 조건은 실행되지 않는다
//		boolean bCheck2=a>b || ++b==a; // 앞의 조건이 true이기때문에, 뒤의 조건은 실행되지 않는다
//		System.out.println(bCheck);
//		System.out.println(bCheck2);
//		System.out.println(b); // b의 값 증감(X) => 앞의 조건에 의해 실행(X)
		
		int a=10;
		int b=21;
		
		boolean bCheck=(a%2==0) && (b%2==1);
		System.out.println(bCheck);
	}
}
