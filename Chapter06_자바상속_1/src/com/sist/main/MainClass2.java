package com.sist.main;
class A{
	int a=10,b=20;
	void aaa() {
		System.out.println("A:aaa() Call...");
	}
}
// B클래스는 A클래스에 있는 모든 것을 사용할 수 있다(a,b,aaa())
// A클래스는 B클래스에 있는 모든 것을 사용할 수 없다(자신것만 사용 가능)
class B extends A{
	int a=100,b=200;
	int c,d;
	// 오버라이딩 => 상속받은 메소드 변경
	void aaa() {
		System.out.println("B:aaa() Call...");
	}
	void bbb() {
		System.out.println("B:bbb() Call...");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		A a=new A(); // B클래스에 있는 변수나 메소드는 사용이 불가능
		System.out.println("a=>"+a.a);
		System.out.println("b=>"+a.b);
//		System.out.println("c=>"+a.c);
//		System.out.println("d=>"+a.d);
		a.aaa();
		B b=new B();
		// b => a,b,c,d,aaa(),bbb()
		System.out.println("a=>"+b.a);
		System.out.println("b=>"+b.b);
		System.out.println("c=>"+b.c);
		System.out.println("d=>"+b.d);
		b.aaa();
		b.bbb();
		// A > B => 클래스의 크기 => 범위(상속을 내린 클래스가 크다)
		/*
		 	A a=new B();
		 	B b=new A(); // 오류
		 */
		A aa=new B();
		// aa => a,b,aaa()만 접근이 가능
		System.out.println("aa.a=>"+aa.a);
		System.out.println("aa.b=>"+aa.b);
//		System.out.println("aa.c=>"+aa.c);
		aa.aaa();
//		aa.bbb();
		// 멤버변수 => A aa
		// 메소드 => new B() 생성자
		B bb=(B)aa; // 상위 클래스 => 하위 클래스로 받는 경우 => 형변환
		System.out.println("bb.a=>"+bb.a);
		System.out.println("bb.b=>"+bb.b);
		System.out.println("bb.c=>"+bb.c);
		System.out.println("bb.d=>"+bb.d);
		bb.aaa();
		bb.bbb();
//		B cc=(B)new A(); // 오류 => 객체 생성 후 형변환을 해야한다
		/*
		 	상속 : 하위 클래스로 접근하는 깃이 기본
		 	class A
		 	class B extends A
		 	B b=new B();
		 		static,private,생성자,초기화블록 => 상속예외
		 		상위 클래스는 공통적으로 사용하는 메소드나 변수를 가진다
		 	A => 여러개의 클래스를 한개의 클래스로 제어
		 	
		 	학생			회사원
		 	---			----
		 	학번			사번
		 	----------------
		 	이름			이름
		 	나이			나이
		 	----------------
		 	학년			연차
		 	
		 	----------------------
		 	먹는다()		먹는다()
		 	잠을 잔다()	잠을 잔다()
		 	----------------------
		 	공부한다()		업무를 한다()
		 	
		 		사람
		 		--------
		 		이름
		 		나이
		 		먹는다()
		 		잠을 잔다()
		 	----------------
		 	 |			  |
		 	학생			회사원
		 	---			----
		 	학번			사번
		 	학년			연차
		 	공부한다()		업무를 한다()
		 	---------------------- 반복 제거
		 	*** 단일 상속만 가능하다
		 	
		 	상위 클래스는 하위 클래스가 가지고 있는 변수나 메소드를 사용할 수 없다
		 	하위 클래스는 상위 클래스에서 내려준 변수나 메소드를 사용할 수 있다
		 							  ----
		 							  static 변수는 상속은 아니지만 사용할 수 있다(공통으로 사용 가능)
		 	객체 생성
		 	하위 클래스로 객체 생성
		 	class A
		 	class B extends A
		 	=> B b=new B();
		 	=> A a=new B();
		 	=> A bb=new B();
		 	   B cc=(B)bb;
		 	   
		 	class 동물
		 	class 사람 extends 동물
		 	class 개 extends 동물
		 	class 소 extends 동물
		 	class 말 extends 동물
		 	class 돼지 extends 동물
		 	
		 	동물 ani=new 사람();
		 	ani=new 개();
		 	ani=new 소();
		 */
	}
}
