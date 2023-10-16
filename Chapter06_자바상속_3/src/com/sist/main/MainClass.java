package com.sist.main;
class A{
	private int a;
//	public A() {}
	public A(int a) {
		this.a=a;
	}
}
class B extends A{
	// 상속내리는 클래스에 매개변수가 있는 생성자를 사용할땐 디폴트 생성자를 명시해주는 것이 좋을듯?
	// 상속받을땐 상속을 내리는 클래스의 생성자와 동일한 생성자를 가지고 있어야한다
	// 상속 내리는 클래스의 생성자를 호출해줘야한다 => A클래스의 메모리 할당을 하기위해
	// B클래스의 호출 순서 => A=>B
//	public B() {
//		super(); // 상속받는 클래스의 생성자에는 super()가 생략이 가능하다
//	}
	
	public B(int a) {
		super(a);
	}
}
public class MainClass {
	public static void main(String[] args) {
		
	}
}
