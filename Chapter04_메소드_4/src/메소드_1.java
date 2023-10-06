/*
 		메소드 : 한개의 기능을 수행하는 명령문들의 집합
 		1) 메소드 구조			   ------ 변수,연산자,제어문
 			[접근지정어][옵션] 리턴형 메소드명(매개변수) => 선언부
 			{
 				구현부
 				...
 				return 값
 				=> void 선언 시, return 생략 가능
 							   컴파일러에 의해 자동으로 추가된다
 				=> return문장은 메소드의 종료를 의미하며, 반드시 필요하다
 			}
 			
 			메소드 호출 시, 어느 특정위치부터 실행할 수 없고 처음부터 끝까지 실행 후
 			호출한 위치로 되돌아와 아래 문장을 실행한다
 			
 			예)
 				void aaa(){
 					1문장		2-8
 					2문장		3-9
 					3문장		4-10
 					4문장		5-11
 					return;
 				}
 				
 				void main(){
 					4문장		1
 					aaa()
 					5문장		6
 					6문장		7
 					aaa()
 					7문장		12
 				}
 			=> 반복적인 문장이 있는 경우(반복 제거)
 			=> 기능별 분리하기 때문에 코드가 간결하다
 			   -------- 수정하기 편리,에러처리 편리
 			=> 다른 클래스와 연결시에 주로 사용
 			=> 메소드가 존재하면 좋은 점 : 분산이 가능(여러명이 동시에 개발이 가능하다)
 			
 		2) 리턴형 결정
 			사용자의 요청에 대한 결과값을 도출
 			=> 한개의 값만 넘겨줄 수 있다
 			   여러개일 시, 묶어서 넘겨준다
 			   			----- 배열,클래스
 			
 			예)
 				class Movie(){
 					String title;
 					Stirng director;
 					String actor;
 					double score;
 					int rank;
 				}
 			=> 사용자 정의 데이터형
 			=> 결과값이 있는 경우 => 결과값 설정(기본형,참조형)
 			=> 결과값이 없는 경우(메소드 자체에서 처리) => void
 			=> 리턴형과 결과값은 가급적이면 동일하게
 			   리턴형>=결과값
 			
 			예)
 				int 메소드명(){
 				--- 리턴형(long,double,float)
 					return 값;
 						  --- 결과값
 				}
 			=> boolean이나 String은 대체할 수 없다
 			
 		3) 매개변수 : 사용자로부터 요청을 받은 값
 			예)
 				로그인 요청 => id,pwd
 				아이디 체크 => id
 				우편번호 검색 => 동/읍/면
 				영화 검색 => 검색어
 			=> 여러개를 사용할 수 있다
 			=> 가급적이면 매개변수는 적게 사용하는 것이 좋다
 			=> 예측을 못하는 경우
 			   가변 매개변수(String...s)
 		
 		4) 메소드명
 			식별자 이용(변수명칭법과 동일)
 			1. 알파벳이나 한글로 시작한다
 			   ---- 운영체제에 영향이 없다(윈도우,리눅스,맥)
 			   ---- 소프트웨어 이식
 			   => 알파벳은 대소문자 구분
 			2. 숫자 사용이가능(앞에 사용 금지)
 			3. 특수문자(_,$)
 			4. 키워드는 사용할 수 없다
 			   ---- 변수명,메소드명,클래스명 => 키워드가 아니다
 			5. 공백이 없어야 한다
 			6. 메소드명의 길이는 제한은 없지만, 적절한 길이로 설정한다
 			   => 추가(board_insert(),boardInsert())
 			7. 약속
 			   => 소문자로 시작한다
 			   => 두개의 단어가 붙어있을 시, 두번째 단어의 첫자는 대문자(헝거리어식 표기법)
 			
 			식별자 적용 범위
 			변수,상수,메소드,클래스,인터페이스,열거형
						
 		5) 호출 => 실행과정
 			int max(int a,int b){
 				return a>b?a:b;
 			}
 			=> int max=max(10,20); => a=10, b=20
 			   --- --- a>b?a:b
 				| 리턴형의 데이터형보다 크게 받을 수 있다(double,long...)
 				
 			void max(int a,int b){
 				System.out.println(a>b?a:b);
 			}
 			=> max(10,20); => 받아서 저장하는 변수가 없다
 		
 		6) 메소드 유형
 			리턴형	매개변수
 			 O		  O
 			 => String
 			 	String substring(int begin)
 			 	String substring(int begin,int end)
 			 		   --------- 메소드명이 동일 => 매개변수의 갯수가 다르다
 			 				  	 => 두 메소드가 다르다(오버로딩)
 			 				  	 
 			 O		  X
 			 => Math
 			 	double random()
 			 	
 			 X		  O
 			 => 출력 담당
 			 	void println(String s)
 			 	
 			 X		  X
 			 => 거의 사용하지 않는다
 			    void println()
 				파일에 값 추가,파일 값 삭제,수정
 		
 		모든 프로그램
 		입력 : 사용자로부터 전송
 			 => Scanner,BufferedReader,Random
 			 			-------------- 예외처리, java.io
 			 => 윈도우,웹 => 입력장 => 버튼/엔터
 			 	------
 			 	<input type=text>
 			 	<input type=password>
 			 	<input type=button>
 		
 		처리(요청 처리) => 결과값,결과값이 없는 경우 => 여러개로 나눠서 처리
 					   ---- -------------
 					    |
 					   출력하는 메소드
 			 
 */
// 매개변수X 리턴형X => 자체 출력
// 리턴형이 없는 경우가 많이 존재한다 => 전역 변수를 사용할 시, 넘겨받을 변수를 따로 설정하지 않아도 된다
public class 메소드_1 {
//	static int a=10; // 전역 변수
//	static int aaa() {
//		int a=100;
//		return a;
//		a=100;
//	}
	// 구구단 전체
	static void gugudan() {
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%2d*%2d=%2d\t",j,i,(j*i));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		int a=aaa();
//		System.out.println(a);
		gugudan();
	}
}
