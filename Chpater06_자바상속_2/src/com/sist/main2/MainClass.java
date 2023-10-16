package com.sist.main2;
// 변수,메소드 오버라이딩
/*
 	오버라이딩
 	-------
 	1) 메소드명이 동일
 	2) 상속
 	3) 매개변수가 동일
 	4. 리턴형 동일
 	5) 축소는 불가능,확대는 가능 => 접근지정어
 	   ------------------
 	   private < default < protected < public
 */
class Super{
	int number=10;
	void display() {
		System.out.println("Super:display() Call...");
	}
}
class Sub extends Super{ // Super클래스를 확장해서 새로운 클래스를 만든다
	int number=20;
	void display() {
		System.out.println("Sub:display() Call...");
	}
	// 변경이 가능 => 오버라이딩
	// 접근지정어의 확대가 가능하다
//	protected void display() {
//	
//	}
	// 접근지정어의 축소는 불가능
//	private void display() {
//		
//	}
}
public class MainClass {
	public static void main(String[] args) {
//		Super su=new Super();
//		System.out.println("su.number="+su.number);
//		Sub sub=new Sub();
//		System.out.println("sub.number="+sub.number);
//		
//		Super su1=new Sub();
//		System.out.println("su1.number="+su1.number);
		// 클래스 선언에 따라 해당 클래스의 데이터를 제어
		// Super 생성 => Super 클래스의 데이터 제어
		
		// Super/Sub/Sub=Super
		Super s1=new Super();
		s1.display();
		Sub sub=new Sub();
		sub.display();
		Super su2=new Sub();
		su2.display();
		
		/*
		 	멤버변수 : 선언된 클래스형의 변수를 제어
		 	Super s=new Super() => Super가 가지고 있는 변수를 제어
		 	Sub s=new Sub() => Sub가 가지고 있는 변수를 제어
		 	Super s=new Sub()) => Super가 가지고 있는 변수를 제어
		 	
		 	메소드 : 생성자의 타입
		 	Super s=new Super() => Super가 가지고 있는 메소드를 제어
		 	Sub s=new Sub() => Sub가 가지고 있는 메소드를 제어
		 	Super s=new Sub()) => Sub가 가지고 있는 메소드를 제어
		 	
		 	=> 동적 바인딩
		 	   생성자에 따라서 메소드의 주소값이 달라진다
		 	   변수는 변경이 없다
		 */
	}
}
