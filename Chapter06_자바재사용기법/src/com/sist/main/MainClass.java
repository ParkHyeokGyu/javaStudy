/*
 	재사용 기법
 		기존의 클래스를 사용(라이브러리)
 		=> 라이브러리는 상속보다는 포함해서 사용한다
 		   -------
 		    | 상속을 할 수 없는 클래스 => 종단 클래스
 		      종단 클래스 : public final class ClassName
 		      ---------------------------------------
 		      => java.lang
 		         String,Math,System,StringBuffer...
 		         => 변경할 수 없다(완제품)
 		
 		상속(is-a)
 		포함(has-a)
 		--------------- 클래스를 비교할 수 있다
 		class A{
 			int a,b,c,d,e,f;
 		}
 		class B{
 			int a,b;
 		}
 		A > B => X, 상속이나 포함상태가 아니라 크기를 비교할 수 없다
 		
 		class A{
 		
 		}
 		class B extends A{
 		
 		}
 		A > B => O, 상속을 내리는 클래스의 범위가 받는 클래스보다 크다
 					B의 클래스의 메모리 크기는 A클래스보다는 클 수 있다
 					long(8) < float(4) => 바이트따라 크기를 비교하는게 아닌 수를 얼마나 표현할 수 있는지에 따른다
 					범위의 기준 : 공통성
 					
	 					식물
	 					|
	 					나무
	 					|
	 				---------
	 				|		|
	 				침엽수	활엽수
	 				
		class A
		class B{
			A a;
		}
		B클래스가 A클래스를 포함하고 있다
		=> 포함클래스(A < B)
		
		포함 : 변경없이 있는 그대로 사용
		상속 : 변경이 필요한 부분 => 오버라이딩
		
		예)
			윈도우 => 자동차 모양으로 윈도우 변경해서 사용
					=> 상속
					class Login extends JFrame{}
			윈도우 => 사각형으로 사용
					=> 포함
					class Login{
						JFrame f=new JFrame();
						// 메소드에 선언하는 것은 포함 클래스가 아니다
						// 클래스 영역안에 선언해야 포함클래스라 불린다
						public void display(){
							JFrame f=new JFrame();
							// 메소드안에서 선언할 시,지역변수에 해당된다
						}
					}
					
					Login log=new Login();
					log.f.메소드();
		
 */
package com.sist.main;

public class MainClass {
	public static void main(String[] args) {
		
	}
}
