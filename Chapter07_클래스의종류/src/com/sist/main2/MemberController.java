package com.sist.main2;
interface I{
	void display();
//	void aaa(); // 추가 시 상속받고있는 클래스들은 기능을 구현해야한다
	default void aaa() {
		System.out.println("default...");
	}
	// 공통적으로 사용하는 경우
	default void bbb() {
		System.out.println("bbb()");
	}
}
class A implements I{
	public void display() {
		System.out.println("A...");
	}
	public void bbb() {
		System.out.println("bbb() 오버라이딩");
	}
	// A클래스에 선언하게되면 interface에서는 접근할 수 없다
}
class B implements I{
	public void display() {
		System.out.println("B...");
	}
}
class C implements I{
	public void display() {
		System.out.println("C...");
	}
}
public class MemberController implements Controller{
	public void execute() {
		System.out.println("회원 관리 클래스");
	}
	public static void main(String[] args) {
		Object o=new A();
		o=new B();
		o=new C();
//		C c=(C)o;
//		c.display();
		I i=new A();
		i.display();
		i.aaa();
		i.bbb();
	}
}
