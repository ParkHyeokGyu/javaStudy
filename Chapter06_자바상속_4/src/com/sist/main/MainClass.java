/*
 	1. 상속
 		=> 멤버변수,메소드 => 상속의 주 목적은 변수보다는 메소드에 있다
 		   -----
 		    | 접근지정어(private,default(패키지가 다른 경우 상속 불가))
 		=> 메소드를 재사용하거나 변경해서 사용(기능)
 		=> 객체 지향 관련 => 메소드중심
 		=> 라이브러리에는 대부분 변수가 없고 메소드로 이루어져있다
 						  --- 변수가 있다면 상수로 가지고 있다
 		=> 형식
 		   단일 상속만 가능
 		   class SubClass extends SuperClass{
 		   		SuperClass가 가지고 있는 모든 메소드 사용이 가능
 		   		=> 변경해서 사용이 가능(오버라이딩)
 		   }
 		   기존의 클래스를 확장(수정,추가)
 		
 		=> 호출
 		   class A
 		   class B extends A
 		        ---       ---
 		         | Sub     | Super => Super>Sub
 		        상속을 내리는 클래스의 범위는 상속받는 클래스의 범위보다 크다
 		        모든 클래스의 상위 클래스는 Object이다
 		        => 자바에서 지원하는 라이브러리의 메소드의 대부분은 Object형을 리턴한다
 		        
 		   => 확장(클래스 사용시에는 확장된 클래스를 사용한다)
 		      B b=new B(); // 기본
 		      A a=new B(); // 특별한 경우
 		      				  A로부터 상속받은 클래스가 여러개일때
 		      
 		      상위 클래스는 하위 클래스에 있는 메소드를 접근할 수 없다
 		      B b=new B();
 		      A a=new B(); => 오버라이딩된 메소드만 접근가능하다
 		      class A{
 		      	------------
 		      	int a,b; => c
 		      	void aaa(){}
 		      	void bbb(){}
 		      	------------ a
 		      }
 		      class B extends A{
 		      	------------
 		      	int c,d;
 		      	------------ 상속
 		      	int a,b;
 		      	void aaa(){} => 오버라이딩시
 		      	void bbb(){} => 오버라이딩시
 		      	void ccc(){}
 		      	------------
 		      	------------ b
 		      }
 		      
 		      A a=new A();
 		      B b=new B();
 		      A c=new B(); => A가 가지고 있는 변수
 		      				  B에서 오버라이딩된 메소드
 		      				  오버라이딩을 하지 않았다면 A클래스의 메소드에 접근
 		      c 접근 불가능 : 변수(c,d), 메소드(ccc())
 		      
 		      쿨래스 객체명 => 객체는 클래스에 있는 변수,메소드만 사용한다
 		      상위 클래스=하위 클래스
 		      -------- -------
 		       | 변수	    | 메소드 => 메소드는 상위 클래스에 있는것만 가능
 		       
 */
package com.sist.main;
class A{
	int a=10,b=20;
	void aaa() {
		System.out.println("A:aaa() Call...");
	}
	void bbb() {
		System.out.println("A:bbb() Call...");
	}
}
class B extends A{
	int a=100,b=200,c=300,d=400;
	void aaa() {
		System.out.println("B:aaa() Call...");
	}
	void bbb() {
		System.out.println("B:bbb() Call...");
	}
	void ccc() {
		System.out.println("B:ccc() Call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		
		// 이 기법을 가장 많이 사용
		B bb=new B();
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		
		// 인터페이스(클래스 여러개를 묶어서 사용)
		A cc=new B();
		System.out.println("cc.a="+cc.a);
		System.out.println("cc.b="+cc.b);
		cc.aaa();
		cc.bbb();
		
		// 멤버변수 : 클래스 타입, 메소드 : 생성자 타입
	}
}
