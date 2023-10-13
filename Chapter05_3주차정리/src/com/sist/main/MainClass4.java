package com.sist.main;
class Sawon{
	int sabun;
	String name;
}
public class MainClass4 {
	// 메모리 주소 전송법
	// 메모리 주소에 있는 변수값을 변경
	// Call By Reference
	// 데이터베이스에 있는 값을 채워 온다
	// 배열/클래스는 적용되지만 String은 Call By Value형식으로 작동된다
	static void change(Sawon sa) {
		sa.sabun=2;
		sa.name="이순신";
	}
	public static void main(String[] args) {
		Sawon s=new Sawon();
		s.sabun=1;
		s.name="박문수";
		
		System.out.println(s.sabun);
		System.out.println(s.name);
		
		// 인스턴스의 주소값을 매개변수로 보내 통제
		change(s);
		System.out.println(s.sabun);
		System.out.println(s.name);
	}
}
