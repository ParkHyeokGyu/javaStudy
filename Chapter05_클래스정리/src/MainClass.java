/*
 		브라우저(웹)
 			HTML/JavaScript/CSS만 인식한다
 			
 			브라우저 <=> 오라클/MySQL(데이터베이스)
 			서로 연결할 수 있는 프로그램이 없다
 			
 			브라우저 <=> 자바 <=> 오라클/MySQL(데이터베이스)
 			
 		클래스 => 필요한 모든 데이터를 모아서 한번에 저장하는 목적
 		1) 형식
 			*** 클래스명 => 식별자
				약속	대문자로 시작
					들여쓰기
					알파벳
					_MainClass => 임시 클래스
					실무	데이터형 => ~VO, ~DTO
						액션(기능) => ~DAO, ~Manager, ~Service
					
 		   	class 클래스명{
 		   		------------------------------
 		   			변수 선언 : 멤버변수,공유변수
 		   			=> 자동으로 default값 초기화
 		   			
 		   			멤버변수	new를 사용해서 객체 생성시마다 메모리에 따로 할당된다
 		   					사용		객체명.변수명
 		   					
 		   					저장위치	Heap => 프로그래머 관리 영역
 		   							관리 소홀 => GC
 		   							GC의 대상
 		   								객체가 null
 		   								사용하지 않는 객체
 		   								System.gc();
 		   							
 		   					사용범위	해당 클래스 전체
 		   							필요시에는 다른 클래스에서도 사용이 가능
 		   					
 		   					소멸시기	프로그램 종료
 		   							
 		   			공유변수(static)	컴파일러에 의해 자동으로 메모리에 할당된다
 		   							사용		객체명.변수명
 		   									클래스명.변수명
 		   							
 		   							저장위치	Method Area(static) => 한개만 저장이 가능
 		   							
 		   							사용범위	해당 클래스 전체
 		   									필요시에는 다른 클래스에서도 사용이 가능
 		   							
 		   							소멸시기	프로그램 종료
 		   			
 		   			따로 저장 / 한개 저장
 		   				인스턴스 변수
 		   				static : 데이터 목록,회원 목록,게시물 목록
 		   						 ------------------------
 		   						 	| 모든 사람이 공유(오라클)
 		   		------------------------------
 		   			생성자 : 반드시 필요로 한다(생성자가 없는 경우 컴파일러에 의해 자동으로 생성된다)
 		   				   멤버변수 초기화
 		   				   메모리 할당
 		   				   시작과 동시에 처리하는 명령문
 		   				   => 오라클 연결,네트워크 => 서버구동,자동로그인)
 		   				   
 		   				   특징	클래스명과 동일
 		   				   		리턴형이 없다
 		   				   		여러개를 만들 수 있다(오버로딩) => 중복 함수 정의
 		   				   			*** 오버로딩 조건
 		   				   				1) 힌개의 클래스에서 제작
 		   				   				2) 메소드명이 동일하다
 		   				   				3) 매개변수의 갯수나 데이터형이 다르다
 		   				   				4) 리턴형과는 관계가 없다
 		   				   		*** 다른 클래스에서 객체 생성시에는 반드시 public 지정
 		   				   
 		   			초기화 블록 : 멤버변수의 초기값 담당
 		   				인스턴스 블록 => 인스턴스 변수,static 변수에 대한 초기화
 		   				static 블록 => static 변수만 초기화 가능
 		   				
 		   				class ClassName{
 		   					변수 선언;
 		   					{
 		   						인스턴스 블록
 		   					}
 		   					static{
 		   						static 블록
 		   					}
 		   				}
 		   				인스턴스 블록과 static 블록은 자동으로 호출된다
 		   				상속이 불가능하다
 		   				
 		   			초기화 순서
 		   			1) 명시적인 초기화
 		   			2) 초기화 블록 : static 변수에 대한 초기화
 		   						 -------
 		   						 	| MyBatis초기화 => XML(파싱)
 		   			3) 생성자 : 인스턴스 변수
 		   			
 		   			A a=new A();
 		   				---	---
 		   				new	int malloc(sizeof(A))
 		   					기본형외의 데이터형은 크기를 알지 못한다
 		   					리턴형 : 메모리 주소값
 		   				
 		   				A()	변수의 초기값을 설정
 		   				
 		   				*** 생성자는 단독으로 호출할 수 없다
 		   					new연산자를 이용해야한다
 		   		------------------------------
 		   			메소드 : 클래스 영역에서만 선언 및 구현
 		   				사용자 정의 메소드 => 기능,반복제거
 		   				
 		   				= 멤버메소드 : new를 사용할때마다 메모리에 따로 할당
 		   				  => 다른 클래스와 통신할때 주로 사용
 		   				  [접근지정어] 리턴형 메소드명(매개변수목록){ : 선언부
 		   				  		구현부
 		   				  }
 		   				  => 객체명.메소드명()
 		   				     scan.nextInt()
 		   				     s.trim()
 		   				  => 리턴형	사용자 요쳥에 대한 결과값
 		   				  			한개만 설정이 가능하다
 		   				  			여러개일 경우 => 배열,클래스
 		   				  				클래스 : 상세보기
 		   				  				배열(고정) : 목록 => 컬렉션(가변)
 		   				  			반드시 사용해야한다
 		   				  				결과값이 있는 경우 : return 값
 		   				  				결과값이 없는 경우 : void => return 생략이 가능
 		   				  => 매개변수	사용자가 보내준 값
 		   				  			예)	로그인창 => id,pwd
 		   				  				검색기 => 검색어
 		   				  				클릭 => 번호
 		   				  				게시판 글쓰기,회원가입 => 클래스
 		   				  => 멤버메소드는 멤버변수나 static변수, 지역변수를 사용할 수 있다
 		   				  => 메소드 유형
 		   				  	 리턴형	매개변수
 		   				  	  O		  O
 		   				  	  O		  X
 		   				  	  ---------	R(SELECT)
 		   				  	  X		  O
 		   				  	  X		  X
 		   				  	  ---------	CUD(INSERT,UPDATE,DELETE)
 		   				  	 리턴형이 많을 수 있다
 		   				  
 		   				  => 사용법
 		   				  	 	class A{
 		   				  	 		int a=10;
 		   				  	 		void aaa(){
 		   				  	 			--- 구현
 		   				  	 			return;
 		   				  	 		}
 		   				  	 		int bbb(){
 		   				  	 			--- 구현
 		   				  	 			return int;
 		   				  	 		}
 		   				  	 	}
 		   				  	 	
 		   				  	 	1) 메모리 저장
 		   				  	 	   A aa=new A();
 		   				  	 	   
 		   				  	 	   -----aa-----
 		   				  	 	   	   0x100
 		   				  	 	   ------------   -----0x100-----
 		   				  	 	   				  
 		   				  	 	   				  -------a-------
 		   				  	 	   				  		10		 => aa.a
 		   				  	 	   				  ---------------
 		   				  	 	   				  		aaa()	 => aa.aaa()
 		   				  	 	   				  ---------------
 		   				  	 	   				  		bbb()	 => aa.bbb()
 		   				  	 	   				  ---------------
 		   				  	 	2) 리턴형이 있는 경우
 		   				  	 	   int a=aa.bbb();
 		   				  	 	   
 		   				  	 	3) 리턴형이 없는 경우
 		   				  	 	   aa.aaa();
 		   				  	 
						= 공유메소드 => static
						  [접근지정어] static 리턴형 메소드명(매개변수목록){
						  
						  }
						  static메소드는 static변수나 메소드 사용이 자유롭다
						  static메소드 안에서는 인스턴스 변수나 메소드를 사용하려면 반드시 객체를 생성 후 사용해야한다
						  
						= 상속을 방지 => final(종단메소드)
						= 선언만 한다 => 구현은 프로그램에 맞게 => abstract
						  버튼 클릭 => 설계(추상 클래스 / 인터페이스)
						
 		   				라이브러리 메소드	
 		   				라이브러리		프레임워크
 		   				완제품(jar)	레고(java) => 전자정부
 		   				
 		   			읽기 / 쓰기 => getter / setter		캡슐화
 		   			이미 만들어진 메소드를 변경 => 오버라이딩	다형성
 		   			새로운 기능 추가 => 오버로딩
 		   			재사용 => is-a / has-a			상속
 		   		------------------------------
 		   	}
 		   	가독성을 위해서는 위 형식을 권장한다
 		   
 		2) 메모리 저장
 		   	객체 생성 => new 생성자()
 		   	class A{}
 		   	new A() : 메모리 주소 리턴 => 필요한 경우 주소를 저장
 		   			  new Thread() => thread 동작
 		    		  A a=new A(); => A 클래스 제어
 		    
 		    A a=new A();
 		    
 		    A a;
 		    a=new A();
 		    
 		3) 호출
 		   
 			
 */
class A{
//	int a=10;
//	static int b=20;
	
//	void aaa() { // 멤버메소드에는 this가 생략되어있다
//		System.out.println(a);
//		System.out.println(b);
//	}
//	static void bbb() {
//		System.out.println(a); // 인스턴스 변수는 static 메소드에서 사용할 수 없다
//		A aa=new A();
//		System.out.println(aa.a); // 객체를 생성해야 접근할 수 있다
//		System.out.println(b);
//	}
	void display() {
		System.out.println("A:display Call...");
	}
	void ccc() {
		System.out.println("A:ccc Call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
//		A aa=new A();
//		System.out.println(aa.a);
//		System.out.println(aa.b);
//		System.out.println(A.b);
		
		new A().display();
		new A().ccc();
		// 여러개의 메소드나 변수를 제어하려면 객체를 생성하고 호출하는게 메모리 낭비를 줄일 수 있다
	}
}
