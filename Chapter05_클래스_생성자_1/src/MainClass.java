/*
 		클래스
 		용도	1. 데이터형 클래스 => 사용자 정의 데이터형
 				=> 메모리 저장 / 메모리 읽기
 				=> 실무 / 프로젝트 => ~VO, ~DTO
 								---------- 캡슐화 목적
 				=> 관련된 데이터를 묶어서 사용 => 관리 및 추가 용이
 				=> 초기화
 					초기화 블록
 					생성자
 			2. 액션 클래스 => 메소드의 묶음
 				=> 게시판(목록,수정,상세보기,삭제,추가,검색)
 			3. 코드 재사용
 			   코드 관리 용이
 			   신뢰성
 			_____________________________________ 객체지향 프로그램
 			
 		기본문법 => 활용
 		=> 자바 / 오라클 / HTML / CSS / JavaScript
 									-----------
 										|
 									Ajax/jQuery/React
 												React-Query
 		=> JSP : 활용 => 사이트
 		=> 실무 : Spring / Spring-Boot
 			=> MSA(서버 분산) => DevOps(CI/CD) => Git
 			
 		자바
 		1. 변수
 		2. 연산자
 		3. 제어문
 		-------- 기본 문법
 		4. 배열
 		5. 메소드
 		--------
 		6. 클래스
 		   	1) 구성요소
 		   	[접근지정어][옵션] class ClassName{
 		   		---------
 		   		변수 : 클래스 전체, 다른 클래스에서 사용이 가능
 		   			  (멤버변수)
 		   			  1) 기본형
 		   			  2) 배열
 		   			  3) 클래스
 		   			=> 멤버변수(인스턴스변수)
 		   				=> new 사용 시 마다 따로 저장하는 변수
 		   				class ClassName{
 		   					int a;
 		   					int b;
 		   					String s;
 		   					int[] arr;
 		   					// 클래스 영역 전체에서 사용이 가능
 		   					// 다른 클래스에서도 사용이 가능
 		   				}
 		   				
 		   				생성시점
 		   				ClassName a=new ClassName();
 		   				ClassName b=new ClassName();
 		   				
 		   				---a---
 		   				 0x100	=>	new
 		   				-------		0x100-----
 		   								a	=>	0
 		   								b	=>	0
 		   								s	=>	null
 		   								arr =>	--arr--
 		   							----------	-------
 		   										
 		   			=> 공유변수(클래스변수)
 		   				=> 메모리 공간이 1개(오라클의 저장된 변수는 모두 공유변수이다)
 		   				=> static
 		   		---------
 		   		생성자
 		   		초기화 블록
 		   		
 		   		=> 변수의 초기화
 		   			1) 기본 디폴트 초기화
 		   				class ClassName{
 		   					int a;		0
 		   					long b;		0L
 		   					double c;	0.0
 		   					float f;	0.0F
 		   					boolean bb;	false
 		   					int[] arr;	null
 		   					String s;	null
 		   				}
 		   			2) 명시적인 초기화 => 우선시
 		   				class ClassName{
 		   					int a=10;
 		   					String name="홍길동";
 		   				}
 		   				
 		   				파일 읽기 / 크롤링 / 오라클 연결 / 제어문
 		   				-------------------------------
 		   				=> 클래스 블록에서는 사용할 수 없다
 		   				class ClassName{
 		   					int[] arr=new int[5];
 		   					--------------------- 선언
 		   					for(int i=0;i<arr.length;i++){
 		   						arr[i]=(int)(Math.random()*100);
 		   					}
 		   					--------------------- 구현
 		   				}
 		   				=> class영역에서는 선언만 가능하다
 		   				   int a; 선언 가능
 		   				   a=100; 구현 불가
 		   				   int a=100; 선언과 동시에 초기화는 가능
 		   				=> class영역에서 선언하려면
 		   				   초기화 블록,생성자 => 동시에 사용하는 빈도는 거의 없다
 		   				class A{
 		   					int a=100;
 		   					{
 		   						a=1000;
 		   						파일 읽기 / 자동 로그인...
 		   					}
 		   					A(){
 		   						a=2000;
 		   						배열 초기화...
 		   					}
 		   				}
 		   				a=100 => 1000 => 2000
 		   				명시적인 초기화 => 초기화 블록 => 생성자
 		   				
 		   		---------
 		   		메소드
 		   	}
 		   	
 		   	class Sawon{
 		   		사원 관리에 필요한 변수 설정
 		   	}
 		   	class SawonSystem{
 		   		사원 관리 기능 처리
 		   		Sawon[] sawons=new Sawon[10]; => 잘못된 코드이다, 사원을 추가할때 마다 호출 시 메모리에 새로운 공간이 지정된다
 		   		static Sawon[] sawons=new Sawon[10]; => static 클래스변수로 지정 시, 다시 호출해도 메모리에 올라가있는 것을 사용한다
 		   	}
 		   	
 		   	A => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=A;
 		   	B => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=B;
 		   	C => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=C;
 		
 		자바는 모든 코딩(변수,메소드...) => 클래스안에서만
 		static변수는 지역변수로는 사용이 불가능
 		클래스 블록안에서만 사용이 가능
 		
 		예)
 			class ClassName{
 				static int a;
 				int b;
 				void aaa(){
 					static int c; => 오류
 				}
 			}
 			
 			class A{
 				다른 클래스 접근
 				ClassName.a => static변수 접근
 				ClassName aa=new ClassName();
 				aa.b => 인스턴스변수 접근
 			}
 		
 		한개의 파일 => class를 여러개 사용이 가능
 		-------- class를 한개만 사용(권장)
 		
 		클래스 선언부 위에는 package,import외에는 없다
 		package : 소속 => 한번만 사용이 가능
 		import : 외부에 있는 클래스를 불러올때
 				 라이브러리 / 사용자 정의 클래스
 				 어려번 사용이 가능
 		
 		class A{
 		
 		}
 		class B{
 			반드시 main을 포함하는 class
 		}
 		컴파일 시에는 A.class, B.class
 		
 		데이터 저장 : 변수(멤버변수)
 		데이테 활용 : 메소드
 		데이터 값 주입 : 생성자
 		
 		생성자
 			클래스를 메모리에 저장할때 호출되는 메소드
 			A a=new A();
 					---
 			Scanner sc=new Scanner();
 						   ---------
 			
 			특징
 				클래스명과 동일
 				class A => A()
 				class B => B()
 				
 				리턴형이 없다
 				class A
 					A() => 생성자 | void A() int A() | => 메소드
 				
 				여러개를 만들 수 있다
 				매개변수의 갯수나 데이터형이 달라야한다 => 오버로딩
 				
 				상속에서 예외
 				생성자는 필요시에만 사용
 					서버연결 / 데이터 연결 / 자동 로그인
 					생성자는 반드시 필요하다
 						생성자를 만들지 않는 경우에는 컴파일 시 자동으로 추가 => 디폴트 생성자 : 매개변수가 없다
 						
 			용도
 				멤버변수의 초기화(명시적인 초기화가 불가능할때)
 				윈도우 초기화, 웹 초기화, 서버 연결, 오라클 연결...
 				셍성자는 한번만 호출할 수 있다
 					new 생성자()
 					new 생성자()
 					new 생성자()
 					=> 여러번 호출할순 있지만 서로 다른 메모리 공간을 가지고 있다
 				
 				생성자 호출시에는 반드시 new연산자가 필요하다
 				
 			오버로딩
 				생성자는 여러개를 만들 수 있다
 				생성자명이 동일해야 한다
 				매개변수의 갯수 혹은 데이터형이 달라야한다
 				class A{
 					A() => 디폴트 생성자는 아래의 생성자가 있을 경우에는 자동으로 추가되지 않는다
 					A(int a)
 					A(int a,int b)
 					A(double d)
 					A(String s)
 				}
 				
 				class A{
 					=> A() 디폴트 생성자를 자동으로 생성
 				}
 				class A{
 					A() => 자동 생성(X)
 				}
 				class A{
 					A(int a) => 자동 생성(X)
 				}
 				
 */
class Sawon{
	int sabun;
	String name;
	String dept,job,loc;
	// Sawon(){} => Sawon s=new Sawon(); 디폴트 생성자 호출
	Sawon(){
		sabun=1;
		name="홍길동";
		dept="개발부";
		job="대리";
		loc="서울";
	}
	// 매개변수 생성자
	Sawon(int sabun, String name, String dept, String job, String loc) {
		// 지역변수를 우선시한다
//		sabun = sabun;
//		name = name;
//		dept = dept;
//		job = job;
//		loc = loc;
		
		// this => 자기 자신 객체
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.loc = loc;
	}
	
	/*
	 		this => 자신 객체
	 		멤버변수와 메소드의 매개변수명이 동일할 시 구분하기 위하여 사용한다
	 		모든 클래스는 this를 가지고 있다
	 		자기 자신 객체의 주소값을 가지고 있다
	 */
	
}
public class MainClass {
	public MainClass() {} // new MainClass() 디폴트 생성자는 적어주지 않아도 자동으로 추가
	public static void main(String[] args) {
		Sawon s=new Sawon();
		System.out.println(s.sabun);
		System.out.println(s.name);
		System.out.println(s.dept);
		System.out.println(s.job);
		System.out.println(s.loc);
		
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);
		System.out.println(s1.name);
		System.out.println(s1.dept);
		System.out.println(s1.job);
		System.out.println(s1.loc);
		
		Sawon s2=new Sawon(2, "박문수", "영업부", "과장", "경기");
		System.out.println(s2.sabun);
		System.out.println(s2.name);
		System.out.println(s2.dept);
		System.out.println(s2.job);
		System.out.println(s2.loc);
	}
}
