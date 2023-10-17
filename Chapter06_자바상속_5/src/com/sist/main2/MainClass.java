package com.sist.main2;
class Movie{
	// 공통요소
	/*
	 	예약을 한다
	 	영화목록을 보여준다
	 	상세보기
	 	영화 추천
	 */
	void reserve() {
		System.out.println("예약을 한다");
	}
	void list() {
		System.out.println("영화목록을 보여준다");
	}
	void detail() {
		System.out.println("상세보기");
	}
	void recommand() {
		System.out.println("영화 추천기능 수행");
	}
}
class CGV extends Movie{
	// 접근지정어를 확대하여 오버라이딩 할 수있다
	@Override
	public void reserve() {
		System.out.println("CGV 예약");
	}
}
class MegaBox extends Movie{
	@Override
	void reserve() {
		System.out.println("MegaBox 예약");
	}
	// 확장 => Movie가 가지고 있는 기능 외에 다른 기능을 추가
	public void print() {
		System.out.println("MegaBox:print() Call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
		CGV cgv=new CGV();
		cgv.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		// 한개의 객체만 생성 => 상위 클래스 이용
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 한개의 객체로 이용
		Movie mm=new CGV(); // Movie안에 있는 메소드만 호출 가능
							// 오버라이딩된 메소드는 오버라이딩 메소드를 호출
		mm.reserve();
		
		mm=new MegaBox(); // print()를 호출할 수 없다
		mm.reserve();
		
		// 생성자와 클래스가 다른 경우 => 오버라이딩 된 메소드를 호출한다
		/*
		 	생성자와 클래스명이 다른경우
		 	Movie m=new CGV()
		 	m을 통해 접근시에 => Movie안에 있는 메소드와 멤버변수에만 접근이 가능
		 	
		 	class Movie{
		 		int a;
		 		void print(){}
		 	}
		 	class CGV extends Movie{
		 		int b;
		 		void aaa(){}
		 		------------------
		 		int a=1000; => 멤버변수 오버라이딩
		 		void print(){cgv} => 메소드 오버라이딩
		 		------------------ 상속받은 데이터는 내부적으로 메모리에 저장되어있다
		 	}
		 	
		 	Movie m=new CGV();
		 	m.a,m.print() 호출시엔 오버라이딩된 멤버들이 호출된다
		 	m의 생성자 타입이 CGV()로 선언 => 메소드의 주소값이 변경되었다
		 	
		 	Movie(멤버변수) m=new CGV()(멤버메소드);
		 	변수는 Movie 클래스, 메소드는 CGV 클래스의 것을 사용한다
		 	
		 	관련된 클래스가 여러개일 때
			 	기능별로 분리
			 	한개의 객체로 제어 => Object(모든 클래스의 최상위 클래스)
			 	배열
			 	Object[] obj={10,"aaa",10.5,'A',new Movie()};
		 */
//		Object o=10;
//		int i=(int)o;
		
		Object o=new CGV();
		CGV cc=(CGV)o;
		// Object형을 하위 클래스로 형변환을 하는 이유는
		// Object 클래스에는 하위 클래스의 메소드에 접근할 수 없기때문이다
		
		// 자바에서 클래스 객체를 리턴하는 메소드는 많이 존재한다
	}
}
