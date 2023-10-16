package com.sist.main2;
// 메모리
// 상위 클래스 => 하위 클래스 순으로 메모리 할당
class Super{
	int a;
//	public Super() {
//		a=100;
//		System.out.println("Super 생성자 호출...");
//	}
	public Super(int a) {
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Super{
	int a;
	public Sub() {
		// 상위 클래스의 생성자가 디폴트 생성자인 경우에만 생략 가능
//		super(); // 생략이 되어있다
		// Super super=new Super();
		super(100);
		// 매개변수 있는 생성자일 경우 반드시 호출해야한다
		a=1000;
		System.out.println("Sub 생성자 호출...");
		// this는 자신을 나타내주는 객체
		System.out.println("Sub:a="+this.a);
		// super는 상위 클래스를 나타내는 객체
		System.out.println("Super:a="+super.a);
		
		/*
		 	Heap
		 	----------------------
		 		super---------
		 			a => super.a (Super -> a)
		 		--------------
		 		
		 		this----------
		 			a => this.a (Sub -> a)
		 		--------------
		 	
		 	----------------------
		 */
	}
}
/*
 	217page
 	클래스 중에 final 클래스
 			-----------
 			public final class{}
 			확장이 안되는 클래스
 			상속을 받을 수 없다
 			String,Math,System...
 			java.lang
 */
public class MainClass {
	public static void main(String[] args) {
		Sub sub=new Sub();
	}
}
