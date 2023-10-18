/*
 	인터페이스
 	
 	기본문법
 		변수는 사용할 수 없다(상수만이 사용가능하다)
 		int i; => X
 		int i=10;
 		=> public static final 생략
 		   static final int i=10; // 상수
 		   final int i=10; // 상수형 변수
 		   int i=10; // 변수
 		
 		메소드
 			구현이 안된 메소드 : 구현내용이 여러개인 경우
 				(public abstract) void display();
 			구현이 된 메소드 : 공통으로 사용되는 부분이거나 특정객체에서 사용하는 메소드일 경우
 				새로운 기능을 추가할때
 				(public) default void aaa(){}
 				(public) static void bbb(){}
 				=> 메소드나 상수를 선언 시 무조건 public
 	
 	상속
		인터페이스도 클래스이다
		상속 시 상위클래스이다
		extends,implements
	
	다중 상속 => ,로 구분
		interface <==extends==> interface
					
		interface <==implements==> class
				   
		
		class A
		interface B
		interface C
		class D extends A implements B,C
				-------	  ----------
				  확장		  구현
	
	
	
 */
package com.sist.main;
//interface A{
//	/*public static final*/ int a = 0;
//	/*public abstract*/ void aaa();
//	default void ooo() {
//		
//	}
//}
//class B implements A{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
interface A{
	void aaa();
}
interface B /*extends A*/{
	void bbb();
}
class C implements A,B{

	@Override
	public void aaa() {
		System.out.println("aaa()");
	}

	@Override
	public void bbb() {
		System.out.println("bbb()");
	}
	
}
public class MainClass2 {
	// 상수는 초기값이 필요하다
	final int a=10;
	public static void main(String[] args) {
//		B b=new C();
//		b.aaa();
//		b.bbb();
//		A a=new C();
//		a.aaa();
//		a.bbb();
		// 다중 상속의 문제점
		// A 혹은 B인터페이스 데이터형으로 클래스를 받는다면 사용하지 못하는 메소드가 발생한다
		// 이럴경우에는 다중 상속을 받는 클래스를 객체화하면 해결
		C c=new C();
		c.aaa();
		c.bbb();
	}
}
