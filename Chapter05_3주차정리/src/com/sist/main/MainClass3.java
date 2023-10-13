package com.sist.main;
class Human{
	int age;
	String name;
}
public class MainClass3 {
	public static void main(String[] args) {
		Human hong=new Human();
		hong.age=20;
		hong.name="홍길동";
		
		System.out.println(hong.age);
		System.out.println(hong.name);
		
		// 대입이 가능하다
		Human shim=hong;
		// hong과 shim은 같은 메모리 주소를 가지고 있다
		shim.age=30;
		shim.name="심청이";
		System.out.println(shim.age);
		System.out.println(shim.name);
		System.out.println(hong.age);
		System.out.println(hong.name);
		
		System.out.println(hong);
		System.out.println(shim);
		
		int a=10;
		int b=a; // 메모리에 있는 값을 대입
//		a=20;
//		System.out.println(b);
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
	}
}
