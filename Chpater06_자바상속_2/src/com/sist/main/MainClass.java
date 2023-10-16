/*
 	상속
 	자바 상속 => 1) 멤버변수, 2) 메소드
 				 ------
 				  | static,private
 				 접근지정어
 				 ------
 				  | public/protected/default,private
 				    ---------------- ------- -------
 				     |				  |		  | 상속을 받을 수 있지만,접근 불가능
 				     |				  | 패키지가 같은 경우
 				     | 패키지와 관계없이 받을 수 있다
 			=> 생성자,초기화 블록을 상속 받을 수 없다
 	*** 클래스 여러개를 한개의 객체로 접근시에는 상위 클래스를 이용한다
 				Student
 				|	  |
 			HStudent UStudent
 			
 			HStudent h=new HStudent();
 			UStudent u=new UStudent();
 			--------------------------
 			Student h=new HStudent();
 			h=new UStudent();
 			
 	*** 모든 클래스를 한개의 객체로 연결이 가능하다
 		Object o=new MainClass();
 		o=new MainClass1()...
 		Object는 모든 데이터형을 묶을 수 있다
 			Object o=10;
 			o=10.5;
 			o=true...
 		자바의 매개변수가 객체인 경우에는 Object형으로 받는다 => 형변환 필요
 	
 	형식
 	class 하위 클래스 extends 상위 클래스
 	=> 단일 상속만 가능
 	
 	다중 상속은 불가능하다
 	----------------
 	class Man{
 		String name;
 		int age;
 	}
 	class Woman{
 		String name;
 		int age;
 	}
 	// 자바에서는 존재하지 않는다(다중 상속 => C,C++)
 	// 자바에도 다중 상속이 있다 => 인터페이스
 	class Humna extends Man,Woman{ => 다중 상속
 		중복된 변수
 	}
 	
 */
package com.sist.main;

public class MainClass {
	public static void main(String[] args) {
		
	}
}
