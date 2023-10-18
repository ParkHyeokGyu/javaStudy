/*
 	인터페이스
 	=> 서로 다른 클래스를 연결해서 사용
 	=> 결합성이 낮은 프로그램
 	=> 개발자가 같은 메소드를 사용 => 표준화
 	=> 관련된 클래스를 묶어서 한개의 이름으로 관리
 	   ------------------------------
 	   Model의 형식이 동일하기때문에 interface로 묶어준다
 	   
 	   class A
 	   class B extends A
 	   
 	   A a=new A(); => A에 있는 변수,메소드만 호출
 	   B b=new B(); => B에 있는 변수,메소드만 호출
 	   A c=new B(); => A에 있는 변수,B에 있는 메소드 호출
 	   							 ------------ 오버라이딩 된 메소드 호출
 	   
 	   interface I => aaa()
 	   class A implements I
 	   => aaa() bbb()
 	   class B implements I
 	   class C implements I
 	   
 	   I i=new A();
 	   => I에 존재하는 메소드중에 A클래스에서 오버라이딩한 메소드를 호출
 	      i.aaa() => bbb()는 i에 존재하지 않기에 호출 불가
 	   I i=new B();
 	   I i=new C();
 	   상위클래스 객체명=new 하위클래스()
 	   => 접근 : 변수와 메소드 모두 상위클래스로 접근
 	            하위클래스에 오버라이딩된 메소드가 있다면 하위클래스의 메소드 호출
 	   => 인터페이스를 통해서 클래스에 접근
 	      인터페이스에 있는 메소드만 가지고 있어야 효율적이다
 	      
 	      interface A{
 	          void aaa();
 	          void bbb();
 	      }
 	      class B implements A{
 	          void aaa();
 	          void bbb();
 	          void ccc();
 	      }
 	      A a=new B();
 	      => B클래스의 ccc()에 접근할 수 없다
 */
package com.sist.main;

public class MainClass {

}
