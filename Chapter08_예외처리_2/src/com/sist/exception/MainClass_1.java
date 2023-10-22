/*
 	객체지향 3대 특성
 	1)캡슐화 : private 변수 / 읽기/쓰기 기능은 메소드로 접근
 	2)재사용
 	  상속(is-a) / 포함(has-a)
 	3)수정 / 추가 => 다형성
 	  오버라이딩 / 오버로딩
 	
 	클래스의 종류
 	1)추상 클래스 : 단일 상속,멤버 변수,생성자,구현된 메소드,구현이 안된 메소드
 	2)인터페이스 : 다중 상속,상수만 사용 가능,구현이 안된 메소드
 	            => 구현된 메소드 : default / static
 	  => 미완성 클래스(메소드 구현이 안된 상태)
 	  => 단점 : 메모리 할당을 할 수 없다(new 사용 불가)
 	  => 상속을 내려서 구현 후 사용 가능 => 오버라이딩
 	  => 관련된 클래스들을 한 개의 객체명으로 관리
 	  
 	  상속
 	  				extends
 	      class =================> class
 	  				extends
 	  interface =================> interface
 	  				implements
 	  interface =================> class
 	  
 	  class A
 	  class C
 	  class B extends A,C => 다중 상속 불가
 	  
 	  class A
 	  class C extends A
 	  class B extends C
 	  
 	  interface A
 	  interface B extends A
 	  interface C extends B
 	  interface D extends A,B => 다중 상속
 	  
 	  class A
 	  interface B
 	  interface C
 	  class D extends A implements B,C
 	  
 	  interface A
 	  interface B
 	  class C implements A,B
 	  
 	  interface의 역할 => Container,Controller => 모아주고 제어하는 역할
 	  					--------------------
 	  					스프링 => AOP
 */
package com.sist.exception;

public class MainClass_1 {
	public static void main(String[] args) {
		
	}
}
