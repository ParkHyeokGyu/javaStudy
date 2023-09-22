/*
 	연산자
 		결과값(데이터형 사용)
 		1) 피연산자 / 연산자
 		   ----- 연산대상
 		   
 		   1개 = 단항연산자 ++a !a (char)10
 		   		- 증감연산자
 		   			++,-- => 1 증가, 1 감소
 		   			int a=10;
 		   			a++; => a=a+1;
 		   			
 		   			전치연산자 : 먼저 증가 => 다른 연산 수행
 		   			후치연산자 : 다른 연산 수행 => 증가
 		   			int a=10;
 		   			int b = a++;
 		   				--- ---
 		   				 1	 2
 		   			
 		   			int a=10;
 		   			int b = ++a;
 		   				--- ---
 		   				 2	 1
 		   				 
 		   			int a=10;
 		   			System.out.println(a++);
 		   			------------------ ---
 		   					1			2
 		   					
 		   			=> 게시물 번호 => --(역순 출력) => 최신순
 		   			
 		   		- 부정연산자 => boolean 사용(조건문)
 		   			boolean bCheck=false;
 		   			!bCheck; => true로 변경은 되지만 bCheck에 대입을 해주지 않았기에 bCheck는 false
 		   			bCheck=!bCheck;
 		   			
 		   			String s="aaa";
 		   			s.replace('a','b') => "bbb"
 		   			"aaa"
 		   			
 		   		- 형변환연산자
 		   			boolean형은 형변환할 수 없다
 		   			
 		   2개 = 이항연산자 a+b
 		   		- 산술연산자
 		   			+,-,*,/,%
 		   			
 		   			* => 장바구니 물품 갯수
 		   			+ => 문자열결합
 		   			
 		   			int이하 데이터형은 연산시 int
 		   				double + int = double
 		   				char + char = int
 		   				byte + byte = int
 		   			
 		   				/ => 정수 / 정수 = 정수
 		   					 0으로 나눌 시 오류
 		   				% => 부호는 왼쪽 피연산자의 부호를 가진다
 		   					 - % - = -
 		   					 + % - = +
 		   		- 비교연산자 => 조건문 / 반복문(조건식)
 		   			==,!=,<,>,<=,>= ==> boolean
 		   			문자열은 비교할 수 없다 => String 메소드(equals) 사용
 		   								주소값으로 비교를 하기때문이다
 		   		- 논리연산자
 		   			&&,||
 		   			
 		   			조건	&&	조건
 		   			true	true => true
 		   			=> 범위지정,기간
 		   			=> 앞의 조건이 false일 시 뒤의 조건은 수행하지 않는다(효율적인 연산)
 		   			
 		   			조건	||	조건
 		   			true	true => true
 		   			true	flase => true
 		   			false	true => true
 		   			=> 오류처리,잘못된 입력,범위를 벗어나는 경우
 		   			=> 앞의 조건이 true일 시 뒤의 조건은 수행하지 않는다
 		   			
 		   		- 대입연산자
 		   			=,+=,-=
 		   			
 		   			int a=10;
 		   			a+=1; => a=a+1; => a=11
 		   			a+=2,a+=3...
 		   			
 		   3개 = 삼항연산자 (조건)?값1:값2
 		   		- true : 값1, false : 값2
 */
public class 연산자정리 {
	public static void main(String[] args) {
//		boolean bCheck=false;
//		bCheck=!bCheck;
//		if(bCheck){
//			System.out.println("출력");
//		}
//		System.out.println(bCheck);
//		
//		int a=10;
//		a++;
//		System.out.println(a);
		
//		byte b1=10;
//		byte b2=20;
//		byte b3=b1+b2; // int long float double
		
		String s="Hello";
		String s1=new String("Hello");
		if(s.equals(s1)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
