/*
 * 	1. 목표
 * 		데이터형(메모리 공간의 크기)
 * 		변수/상수
 * 		연산자(가공)
 * 		재어문/객체지향/예외처리/클래스의 종류/재사용(is-a,has-a)
 * 	
 * 	1. 프로그램의 기본
 * 		데이터를 저장하는 방법
 * 		데이터를 한개만저장 : 변수/상수,리터럴 : 실제 저장할 값
 * 					* 매모리 저장공간의 별칭(주소 (0~....))
 * 		자바의 메모리 구조
 * 			ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 			method => method,static
 * 			ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 			stack => 지역변수,매개변수
 * 				* 메모리 자체 관리(블록이 끝나면 메모리에서 사라진다)
 * 			ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 			heap => 클래스 블록
 * 				* 사용자가 관리(자동 메모리 회수 : 가비지 컬렉터)
 * 			ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 
 * 		실제 메모리(RAM : 휘발성 메모리(프로그램 종료 시 저장된 데이터가 사라진다))
 * 
 * 			100을 저장하려할 때
 * 			0ㅡㅡㅡㅡㅡㅡㅡㅡ
 * 				사용중
 * 			4ㅡㅡㅡㅡㅡㅡㅡㅡ
 * 				사용중
 * 			8ㅡㅡㅡㅡㅡㅡㅡㅡ
 * 				100 저장 => 이름(별칭) 부여
 * 			12ㅡㅡㅡㅡㅡㅡㅡㅡ
 * 				  .
 * 				  .
 * 				  .
 * 
 * 		자바에서 제공하는 메모리 크기(자료형,데이터형)
 * 			정수
 * 				byte => 1byte(8bit) => 0,1을 8개 저장할 수 있는 공간
 * 					byte b = 100;
 * 					ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 					부호 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1
 *					ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *					부호 : 양수(0)/음수(1)
 *					01111111
 *						2^0*1=1
 *						2^1*1=2
 *						2^2*1=4
 *						  .
 *						  .
 *						  .
 *						2^6*1=64 => 127,-128(2의 보수(양수 표현에서 +1) => -128~127
 *									byte a = 128; => 에러(범위를 벗어남)
 *					
 *					사용처 : 파일 읽기/파일 쓰기/업로드/다운로드시 사용
 * 				short => 16bit(2byte) => C언어 호환성
 * 					사용 빈도가 거의 없다
 * 					-32768~32767
 * 				int => 4byte => 일반적인 모든 순자는 int
 * 					int i = 100;
 * 					default
 * 					-21억4천~21억4천
 * 				long => 8byte(64bit)
 * 					long l = 100L;, long l = 200; => 200L
 * 					빅데이터/금융권
 * 				* int와 long을 구분
 * 					L(l) => 100L(long), 100(int)
 * 			실수
 * 				float => 4byte
 * 					float f = 10.5; => 에러 => 10.5F(O)
 * 						* double형으로 인식
 * 					소수점 이하 6자리 표현
 * 				double => 8byte => default
 * 					double d = 'A'; => d = 65.0
 * 					double d = 10; => d = 10.0
 * 					double d = 10.5F; => d = 10.5
 * 					double d = 10L; => d = 10.0
 * 						* double형은 모든 데이터형을 받을 수 있다
 * 					소수점 이하 15자리 표현
 * 				* 10.5(double)(10.5d => d생략), 10.5F(float)
 * 			문자
 * 				char => 2byte(멀티 바이트)
 * 					char c = 'A';, char c = 65; ('A')
 * 					한 개의 문자만 사용 가능 => 'A','홍'
 * 					정수형(글자마다 번호) => A(65),a(97)
 * 						연산 처리 시 정수형으로 자동 변환
 * 						'A'+1 => 65+1 => 66
 * 				1byte(아스키),2byte(Unicode)
 * 					C/C++		자바
 * 				범위 : (0~256)	(0~65535)
 * 				한글(자음+모음) : 한글자당 2byte => UTF-8(아스키로 인식 => Unicode로 변환하여 출력)
 * 			논리
 * 				boolean => 1byte => true,false
 * 					boolean b = true;, b = false;
 * 					조건문
 * 			참조형(사용자 정의) => 배열,클래스
 * 
 * 			* byte < char < int < long < float < double
 * 					 short
 * 				메모리 크기로 따지는 것이 아닌 수표현으로 따진다
 * 
 */
public class 자바데이터형 {

	public static void main(String[] args) {
		byte _byte=127;
		int _int=20000;
		long _long=20000; // 20000L
		float _float=10.5f;
		double _double=100; // 100.0 => 자동 형변환
		char _char=65; // 'A'
		boolean _boolean=true;
		
		System.out.println("_byte:"+_byte);
		System.out.println("_int:"+_int);
		System.out.println("_long:"+_long);
		System.out.println("_float:"+_float);
		System.out.println("_double:"+_double);
		System.out.println("_char:"+_char);
		System.out.println("_boolean:"+_boolean);
	}

}
