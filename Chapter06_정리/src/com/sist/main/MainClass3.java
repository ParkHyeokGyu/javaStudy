/*
 	1. 194page 상속
 	2. 199page 논리적 포함 관계
 				
 				동물
 				 |		n 추상화 => 공통점이 많이 있다
 				포유류	| 
 				 |		u 구체적
 				인간
 				 |
 			-----------
 			|		  |
 			남자		  여자
 			
 		abstract => 추상적인 => 공통적인 내용을 모아둔것
 		게시판
 			글쓰기,상세보기,목록,수정,삭제,검색
 			
 			답변형 게시판
 			묻고 답하기
 			갤러리 게시펀
 			댓글형 게시판
 		
 		추상클래스/인터페이스 설계 시 => 벤치마킹
 	3. 201~202,204,206page
 	   단일상속 => 변수의 충돌
 	   오버라이딩 => 재정의 => 기존의 메소드 변경
 	   => 변수 오버라이딩/메소드 오버라이딩
 	   오버로딩 => 중복 함수 정의 => 새로운 기능 추가
 	   
 	   207page
 	   접근지정어
 	   => private변수는 접근이 불가능하다
 	   
 	   211page
 	   생성자
 	   class A{
 	      public A(){}
 	   }
 	   class B extends A{
 	      public B(){
 	      	super(); => new A(); 호출 => 생성자 첫줄에 사용
 	      				this() => 생성자 첫줄에 사용
 	      }
 	   }
 	   B b=new B(); => new A(); => new B();
 	   
 	   자신의 객체 => this
 	   자신의 생성자 호출 => this()
 	   상위 클래스의 객체 => super
 	   상위 클래스의 생성자 호출 => super()
 	   => 상속을 받은 클래스는 자신과 관련된 메소드나 변수 및 상위 클래스의 변수,메소드 사용 가능
 	   => 상속을 내린 클래스는 자신의 메소드나 변수만 사용 가능
 	   
 	   217page => final => 변수는 상수형이다
 	   					   메소드는 확장을 할 수 없다 => java.lang
 	   					   
 	   221page
 	   객체의 형변환 : 클래스의 크기가 서로 다르다
 	   			   --------- 반드시 상속,포함
 	   			   class A{
 	   			      int a,b;
 	   			   }
 	   			   class B{
 	   			      int a;
 	   			   }
 	   			   --------- 위의 두 클래스는 크기를 잴 수 없다
 	   			   class A
 	   			   class B extends A
 	   			   ----------------- A > B
 	   			   class A{
 	   			      B b=new B(); => 포함
 	   			   }
 	   			   class B
 	   			   ----------------- A > B
 	   			   
 	   			   묵시적 형변환 => 자동 형변환
 	   			   class A
 	   			   class B extends A
 	   			   
 	   			   A a=new B();
 	   			   ------------ B b=(B)a; => 강제 형변환
 	   			   B b=new B();
 	   			   A a=b;
 	   			   
 	   			   클래스도 데이터형이다
 	   			   => 자바에서 지원하지 않는 데이터형 => 사용자 정의 데이터형
 	   
 	   *** 제어자
 	       접근지정어 : private,protected,public,default
 	       그 외 : static,final,abstract,synchronizer
 	       static : 공통적인 => 공유
 	       			클래스,메소드,변수 => 지역변수에는 사용할 수 없다
 	       final : 마지막
 	       		   클래스,메소드,변수,지역변수
 	       		   예)
 	       		   		public final class A
 	       		   		 => 확장할 수 없는 클래스
 	       		   		    상속을 할 수 없는 클래스
 	       		   			String,Math,System
 	       		   		public final void display(){}
 	       		   		 => 오버라이딩이 불가능
 	       		   		public final int a=10;
 	       		   		=> 값을 변경할 수 없다(상수)
 	       abstract : 추상적인(공통),미완성
 	       			  추상클래스나 인터페이스에서 사용 가능
 	       synchronizer : 동기적인(네트워크,쓰레드)
 	       				  비동기(속도) : AJax
 	       				  동기(안정성)
 	
 	조합
 	---------------------------------------
 	대상				조합
 	클래스	public default final abstract
 			protected/private => 사용 시 오류
 	변수		private final,static
 	메소드	public final static abstract
 	지역변수	final
 */
package com.sist.main;

public class MainClass3 {
	public static void main(String[] args) {
		
	}
}
