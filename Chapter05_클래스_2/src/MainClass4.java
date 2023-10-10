/*
 		1. 명시적 초기화
 		2. 초기화 블록
 		3. 생성자
 		
 		=> 클래스의 블록 : 선언만 가능하며 구현을 할 수 없다
 								  ---- 메소드 호출
 								       연산 처리
 								       제어문 처리
 								       파일 읽기
 								       키보드 입력값 받기
 								       변수값 변경
 */
class Student{
//	int a; // 선언만 하거나
	int a=10; // 선언과 동시에 초기화는 가능하다 => 명시적 초기화
//	a=10; // 구현 불가
	
	{
		a=100; // 초기화 블록 => 자동 처리
		// 자동 로그인
		// 크롤링해서 데이터 저장
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		
	}
}
