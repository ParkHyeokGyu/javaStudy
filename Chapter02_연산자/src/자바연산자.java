/*
 *	연산자/피연산자
 *		10+20 => 10,20(피연산자), '+'(연산자)
 *		피연산자 1개 단항연산자
 *					증감연산자(1개 증가,감소) => ++,--
 *						int a=10;
 *						++a; => a=11
 *					부정연산자
 *						boolean만 사용 가능
 *						boolean b=fasle;
 *						b=!b; => true
 *					형변환연산자
 *						(int)'A' => (int)
 *						upcasting => (int)'A'(문자를 정수로 변환)
 *							자동형변환
 *						downcasting => (int)10.5(실수를 정수로 변환)
 *							강제형변환
 *					기타
 *						~ => 반전연산자(양수 <=> 음수)
 *						., []
 *			  2개 이항연산자
 *					산술연산자
 *						+, -, *, /, %
 *						+ : 산술연산, 문자열결합
 *							"5"+6="56", 5+"7"+6="576"
 *							"7"+7+7="777", 7+7+"7"="147"
 *
 *						데이터형 자동 변경
 *							int+double=double(int가 double로 upcasting)
 *							char+char=int, byte+byte=int(int형 이하 데이터형의 연산결과는 int형)
 *
 *						/ : 나누기
 *							정수/정수=정수
 *								10/3 => 3(3.333(소수점 이하 제거))
 *							0으로 나눌 경우에는 오류
 *
 *						% : 나눈 후 나머지 값
 *							짝수,홀수,배수 구할때
 *
 *							부호
 *								5%2=1, -5%2=-1, 5%-2=1, -5%-2=1
 *									* 부호는 왼쪽 피연산자의 부호를 가진다
 *
 *					쉬프트연산자
 *						<<, >>(비트이동연산자)
 *							10<<2 => 10*2^2
 *								10 => 1010<<2 => 101000(비트를 좌측으로 2칸 이동, 빈 칸에는 0을 채움)
 *								101000 => 40
 *							10>>2 => 10/2^2
 *								10 => 1010>>2 => 10(우측 비트부터 2개 제거)
 *								10 => 2
 *
 *					비트연산자
 *						&(and), |(or), ^(xor)
 *							& : *
 *							| : +
 *							^ : 다른 비트
 *						
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *									&	|	^
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							0	0	0	0	0
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							0	1	0	1	1
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							1	0	0	1	1
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							1	1	1	1	0
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *
 *							10&14
 *							ㅡㅡㅡ
 *							1010
 *							1110
 *							ㅡㅡㅡ
 *							1010 => 10
 *
 *							21&6
 *							ㅡㅡㅡ
 *							10101
 *							00110
 *							ㅡㅡㅡ
 *							00100 => 4
 *
 *							10|14
 *							ㅡㅡㅡ
 *							1010
 *							1110
 *							ㅡㅡㅡ
 *							1110 => 14
 *
 *							21|6
 *							ㅡㅡㅡ
 *							10101
 *							00110
 *							ㅡㅡㅡ
 *							10111 => 23
 *
 *							10^14
 *							ㅡㅡㅡ
 *							1010
 *							1110
 *							ㅡㅡㅡ
 *							0100 => 4
 *
 *							21^6
 *							ㅡㅡㅡ
 *							10101
 *							00110
 *							ㅡㅡㅡ
 *							10011 => 19
 *
 *					비교연산자
 *						==, !=, <, >, <=, >=
 *							결과값은 boolean
 *								6==7 false
 *								6!=7 true
 *								6<7 true
 *								6>7 false
 *								6<=7 true
 *								6>=7 false
 *
 *							정수/실수/문자/논리 계산 가능 => 문자열은 불가
 *														* 문자열 비교는 String 메소드 equals(),compareTo() 사용
 *							
 *							같다, 같지 않다
 *								자바 : ==, !=
 *								오라클 : =, <>
 *								자바스크립트 : ===, !==
 *
 *					논리연산자
 *						&&, ||
 *							&& : 직렬연산자
 *							|| : 병렬연산자
 *							
 *									&&	||
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							T	T	T	T
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							T	F	F	T
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							F	T	F	T
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *							F	F	F	F
 *							ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *			
 *							&&(범위나 기간 포함) => 90부터 100까지
 *								score>=90&&score<=100
 *							||(범위를 벗어난 경우)
 *
 *					대입연산자
 *						=, +=, -=, *=, /=, %= ...
 *						   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 복합 대입 연산자	
 *							int a=10; => 10을 a에 대입
 *							
 *							int a=10;
 *							a++; => 한개 증가
 *							
 *							int a=10;
 *							a+=10; => a=a+10
 *
 *							int a=100;
 *							a-=10; => a=a-10
 *
 *			  3개 삼항연산자
 */
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(21)); // 2진법으로 변환해주는 메소드
	}

}
