/*
 	언어	자바,파이썬
 	ML	HTML,XML
 	JS	Jquery(Ajax),React,Vue
 	기술	Spring,Spring-Boot
 	구조	AWS,MSA
 	분석	R,NumPy,Pandas,MatplotLib
 	머신러닝,딥러닝
 	
 	자바
 	= 데이터형 => 변수(2장)
	 	  정수	byte,int,long
	 	  		-----    ---- 데이터 분석(빅데이터)
	 	       	| 파일 입출력(io)
	 	  실수	double
	 	  논리	boolean
	 	  문자열	String
 	  
 	= 처리 => 연산자/제어문(3,4장)
	 	  단항연산자	증가연산자(++,--),!(부정연산자),(type)(형변환연산자)
	 	  									형변환 : 자동형변환,강제형변환
	 	  									---- 클래스에도 적용 가능
	 	  										 ---- 크기 비교 가능(상속,포함) => instanceof
	 	  이항연산자	산술연산자(+,-,*,/,%)
	 	  			비교연산자(==,!=,<,>,<=,>=)
	 	  			논리연산자(&&,||)
	 	  			대입연산자(=,+=,-=)
	 	  삼항연산자	?:
 	  
	 	  제어문
	 	  = 조건문
	 	    if(조건문) => 단일 조건문
	 	    if~else => 선택 조건문
	 	    if~else if~else => 다중 조건문
	 	    
	 	  = 반복문
	 	    for => 화면 출력(Front단)
			while => 데이터 베이스,파일(Back단)
			
	 	  = 반복제어문
	 	    break => 반복문 종료
 	    
 	= 배열 => 1차원 배열
	 	  클래스 배열
	 	  Music[] String[] => Collection(배열 보완)(12장)
 	
 	= 클래스(5,6,7장)
	 	  구성요소
	 	  = 멤버변수
		 	    인스턴스 변수 => 객체 호출 마다 메모리에 따로 저장
		 	    
		 	    정적(static) 변수 => 메모리에 한개의 공간만을 가짐
		 	    = 디자인 패턴 : 싱글톤 패턴 => 데이터 베이스 연동
		 	    = 팩토리 패턴
		 	      => 스프링 : 8개 패턴(컴바인드 패턴)
		 	      
		 	    데이터 보호 => 캡슐화(private) => 메소드로 접근(getter/setter)
	 	    
	 	  = 메소드 => 다른 클래스와 연결
		 	    인스턴스 메소드 => 객체 호출 마다 메모리에 따로 저장
		 	    = 객체명.메소드() => sc.next(),s.replace()
		 	    
		 	    정적 메소드 => 공유(한개의 메소드를 모든 객체에서 사용)
		 	    = 클래스명.메소드() => Math.random(),String.valueOf()
		 	    
		 	    접근지정어 : public
		 	    리턴형 : 기본형,클래스형,배열
		 	    = 한개의 값만 리턴할 수 있다
		 	      여러개의 값은 배열이나 클래스로 묶어 리턴 => 목록,상세보기,검색결과
		 	    메소드명 : 식별자
		 	    매개변수 : 여러개 사용 => 사용자가 보낸 요청값
		 	    = 3개 이상이면 => 클래스,배열
		 	      회원가입,게시물 글쓰기,영화정보 올리기
	 	      
	 	  = 생성자 => 멤버변수 초기화
	 	    	시작과 동시에 처리
	 	    	메모리 할당 시 호출
	 	    	클래스는 무조건 생성자를 1개이상 필요로한다
	 	    	= 없을 경우에는 컴파일러에 의해 자동으로 추가 => 디폴트 생성자(매개변수 없는 생성자)
	 	    	  매개변수 있는 생성자를 선언하였을 경우에는 반스디 디폴르 생성자를 선언해주어햐 한다
	 	    	  *** 자동 추가
	 	    	      1)import
	 	    	        import java.lang.* => String,Math,Object,System...
	 	    	      2)모든 클래스(라이브러리,사용자 정의 클래스)
	 	    	        상속(Object) => class MainClass extends Object
	 	    	      3)모든 메소드는 return(메소드 종료)이 필수
	 	    	        void일 경우에는 return 생략 가능
	 	    	      4)public A{
	 	    	        	public A(){}
	 	    	        }
	 	    	      5)자바에서 지원하는 모든 클래스는 예외처리가 필요
	 	    	        CheckException,UnCheckException
	 	    	        	   |	   ---------------- 예외처리 생략
	 	    	        	   |
	 	    	        네트워크 : URL,Socket...
	 	    	        IO : 파일 입출력
	 	    	        SQL : 오라클 연결
	 	    	        
	 	    	생성자를 사용하지 않고 초기화하는 방법
	 	    	= 초기화블록
	 	    	  인스턴스 블록 => 대신 생성자를 주로 이용
	 	    	  static 블록 => static 변수 => 이미 메모리에 할당되어 있기때문에 생성자를 호출하지 않아도 된다
	 	    	  
	 	    	  *** 먼저 명시적으로 초기화
	 	    	      초기화할 수 없는 상황 => 생성자,초기화블록으로 초기화
	 	    	      			  --- 외부에서 값을 읽어 초기화
	 	    	      			  --- 크롤링,파일,네트워크
 	= 객체지향의 3대 특성(6장)
 	  문법이 아니라, 권장사항이다
	  1)캡슐화 => 데이터보 호
	    변수를 은닉화 : private
	    기능으로 접근 : getter/setter => Lombok 라이브러리
	  2)재사용
	    상속 : 기존의 클래스를 확장,필요시에 변경해서 사용
	    class A
	    class B extends A
	  	포함 : 클래스를 변경하지 않고 있는 그대로 사용
	  	class A
	  	class B{
	  		A a=new A();
	  		특별한 경우에는 변경해서 사용할 수 있다
	  		A a=new A(){}; => 익명의 클래스
	  	}
	  	
	  	상속의 예외 조건 : static,생성자,초기화 블록,private(상속은 되지만 접근을 불가)
	  	상속관계의 클래스들끼리 클래스의 크기를 비교할 수 있다
	  		class A
	  		class B extends A => A > B
	  		자동 형변환 => 묵시적 형변환
	  			A a=new B();
	  			------------
	  			B b=new B();
	  			A a=b;
	  		강제 형변환 => 명시적 형변환
	  			A a=new B();
	  			B b=(B)a;
	  			
	  			라이브러이에서의 리턴형이 클래스인 경우 대부분 Object형으 리턴한다
	  			List names=new ArrayList();
				names.add("홍길동");
				String name=(String)names.get(0);
				
				class A{
					void display(){}
				}
				class B extends A{
					int a,b;
					void aaa(){}
				}
				A a=new B();
				상위 클래스로 접근할 경우 하위 클래스인 B클래스의 멤버변수에는 접근할 수 없다
	  3)다형성
	    		오버로딩				오버라이딩
	    상태		같은 클래스				상속을 받은 경우
	    리턴형	관계없다				동일
	    메소드명	동일					동일
	    매개변수	갯수나 데이터형이 다르다	동일
	    접근지정어	관계없다				축소(X),확대(O)
	    
	    				축소
	    			<----------
	    private < default < protected < public
	    			---------->
	    				확대
	    				
	    interface A{
	    	(public abstract) void disp();
	    	void aaa();
	    }
	    class B implements A{
	    	void disp(){} => default나 protected을 사용할 수 없다
	    	void aaa(){}
	    }
	    
 */
package com.sist.main;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("홍길동");
		String name=(String)names.get(0);
	}
}
