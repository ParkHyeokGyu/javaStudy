/*
 	7장 정리
 	JSP,Spring,Spring-Boot => 기본 자바
 	HTML,CSS,JavaScript
 	데이터 저장 => 오라클,MySQL
 	데이터 분석 => 파이썬
 	
 	*** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 				 ------- 강제화
 		interface I{
 			void aaa();
 			void bbb();
 			void ccc();
 			default void ddd(){}
 			default void eee(){}
 			default void kkk(){}
 		}
 		class A implements I{
 			void aaa();
 			void bbb();
 			void ccc();
 			=> 인터페이스에 있는 메소드들을 구현해야한다
 			void ddd();
 		}
 		class B implements I{
 			void aaa();
 			void bbb();
 			void ccc();
 			=> 인터페이스에 있는 메소드들을 구현해야한다
 			void eee();
 		}
 		class C implements I{
 			void aaa();
 			void bbb();
 			void ccc();
 			=> 인터페이스에 있는 메소드들을 구현해야한다
 			void kkk();
 		}
 		=> 인터페이스에 선언된 메소드 이외의 다른 기능을 추가하게 되면 비효율적이다
 		=> I i=new A();
 		   i를 가지고 A클래스가 가지고 있는 메소드를 제어
 		   A클래스에 추가된 ddd()메소드는 접근할 수 없다
 		   
 		=> A,B,C클래스의 유형이 같을 경우 한개의 이름으로 제어
 		   서로 다른 클래스를 묶어서 관리
 		   관리(소스코딩이 간결)
 		   인터페이스의 메소드
 		   예)
 		       오라클 MySQL MSSQL DB2 SQLITE 사이베이스
 		       -----------------------------------
 		       				 |
 		       			DriverManager
 		       			
 		       => SQL문장 : ANSI(표준화)
 		       => 오라클		MySQL
 		          VARCHAR2	VARCHAR
 		          CLOB		TEXT
 		          NUMBER	INT/DOUBLE
 		   	   => 데이터형은 서로 다르지만 표준화된 SQL문장을 가지고 있다
 		   	   
 	컬렉션(CRUD)
 	Collection
 	----------
 	|
 	List
 	|
 	-----------------------------------------
 	|			|		|			|		|
 	ArrayList	Vector	LinkedList	Stack	Queue
 	
 	1)인터페이스 VS 추상클래스
 	  ------------------------------------------------------
 	  					인터페이스				추상클래스
 	  ------------------------------------------------------
 	  	구현메소드		선언된 메소드			선언된 메소드/구현된 메소드
 	  				void display1();
 	  				JDK1.8부터는
 	  				구현된 메소드 사용
 	  				= default
 	  				default void display2();
 	  				= static
 	  				인터페이스명으로만 접근 가능
 	  				*** 접근지정어가 아니다
 	  ------------------------------------------------------
 	  	인스턴스변수	사용할 수 없다			사용 가능
 	  				=> 공용				private 변수 가능
 	  				=> 상수형 변수만 가능
 	  				=> public
 	  				=> openjdk
 	  				jdk 1.9부터는
 	  				private 변수 가능
 	  ------------------------------------------------------
 	  	생성자		생성자가 없다			생성자가 있다
 	  ------------------------------------------------------
 	  	접근범위		모든 내용을 공개			접근지정어에 따라 다르다
 	  				=> 변수,메소드			모든 접근지정어 사용
 	  ------------------------------------------------------
 	  	상속			다중 상속				단일 상속
 	  				implements			extends
 	  			interface => interface
 	  					extends
 	  			intreface => class
 	  					implements
 	  				=> 사용자 정의,라이브러리
 	  				   단일 상속이 중심이다
 	  				=> 윈도우의 경우에는
 	  				   여러개를 받는다
 	  ------------------------------------------------------
 		*** 공통점	new로 메모리 할당이 불가능하다
 				   	new를 사용할 순 있지만 해당 인터페이스에 선언된
 				   	메소드들을 모두 구현해야한다 => 익명의 클래스
 				   	==> 상속을 내려서 상속받은 클래스로 구현하는것이 좋다
 		*** 목적		서로 다른 클래스를 연결해서 사용이 가능
 				  	관련된 클래스를 모아 사용할때 주로 사용
	  ------------------------------------------------------
	  	인터페이스의 구성요소
	  	public interface interface명{
	  		------------------------------------------
	  		상수 : 반드시 초기값 설정(명시적)
	  		(public static final) int a=10;
	  		=> 생략이 되면 접근지정어와 제어어를 추가
	  		------------------------------------------
	  		구현이 안 된 메소드 : 프로그램에 맞게 구현
	  		=> 개발자가 알아서 구현
	  		(public abstract) void display();
	  		------------------------------------------
	  		구현이 된 메소드
	  		=> 공통으로 사용되는 부분
	  		=> 필요 시 변경해서 사용
	  		(public) default void display(){}
	  				 ------- 접근지정어가 아니다
	  		(public) static void display(){}
	  		=> static 접근은 인터페이스명.메소드명();
	  		------------------------------------------
	  	}
	  	*** 만약에 기능추가가 있을 경우에는 default를 이용한다
 */
package com.sist.main;

interface I{
	// public을 생략하면 컴파일러에 의해 자동으로 추가
	int a=10;
	static void display() {
		System.out.println("I:display() Call");
	}
}
class A{
	public static void aaa() {
		System.out.println("A:aaa() Call");
	}
}
class B extends A{
	public void bbb() {
		aaa();
		A.aaa();
	}
}
class C implements I{
	public void ccc() {
		// static메소드일 경우에는 인터페이스명으로만 접근
		// default메소드일 경우에는 바로 접근 가능
		I.display();
	}
}
public class MainClass {
	public static void main(String[] args) {
		
	}
}
