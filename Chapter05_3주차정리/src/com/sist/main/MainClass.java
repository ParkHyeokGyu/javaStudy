/*
 		1. 객체지향 프로그램
 		   클래스를 만드는 목적
 		   1) 재사용이 가능
 		      = 상속 => 기존의 클래스를 변경해서 사용할 목적
 		      class GenieMusic
 		      => class Melon extends GenieMusic
 		      				 ------- 기존의 클래스를 확장
 		      = 포함 => 기존의 클래스를 그대로 사용
 		      class Melon{
 		      	GenieMusic gm=new GenieMusic();
 		      }
 		      
 		   2) 데이터를 보호 : 캡슐화
 		      => 접근지정어
				 private => 클래스에서 사용하는 멤버변수는 은닉화
				 			메소드에서 기능을 제작
				 					-------
				 					읽기(getter) / 쓰기(setter)
				 					
		   3) 수정이 가능 / 추가 가능 => 다형성
		      --------  -------
		      오버라이딩   오버로딩
		
		   목적 => 유지보수 용이
		   
		2. 클래스를 만드는 과정
		   1) 클래스 구성 요소
		      class MainClass{
		      	--------------------------
		      	변수 => 1개의 데이터를 저장
		      	인스턴스 변수
		      	=> 여러개를 따로 저장해서 사용이 가능
		      	   ------------- new 이용
		      	공유 변수,클래스 변수 : static 변수
		      	=> 컴파일러에 의해 자동으로 생성 => 1개만 생성이 가능
		      	예)
		      		String name; => 자동 초기화 : 클래스인 경우에는 null
		      			null => 클래스 객체는 반드리 메모리 주소를 가진다(주소 지정이 안된 경우)
		      			A a; => null
		      			a=new A(); => NullPointerException
		      		int age; => 0
		      		String address; => null
		      		String phone; => null
		      		double ki; => 0.0
		      		char c; => '\0'
		      		boolean b; => false
					=> 한번을 메모리에 저장시킨다 => default 초기화
					=> 필요한 값으로 변경해서 사용
					
				*** 데이터는(변수)는 반드시 외부에서 접근하거나 변경,손실 방지 => 은닉화
					모든 변수는 private 사용
		      	--------------------------
		      	
		      	--------------------------
		      	
		      	--------------------------
		      }
		      
		      *** 코드 영역
		          class{
		          	  선언만 가능 : 변수 선언,메소드 선언
		          	  => 메소드 호출,연산 처리,제어문 사용 : 구현 불가
		          }
		          method{
		              선언(지역벽수),메소드 호출,연산 처리,제어문 사용
		              => 사용자의 요청을 처리 및 결과값 리턴
		          }
		          => 생성자와 초기화 블록도 메소드이다
		             사용자 정의로 만든 메소드나,생성자는 반드시 호출해서 사용해야한다
		             예외로 초기화 블록은 컴파일러에 의해 호출되며 한번만 수행된다(초기화 담당)
		             
		             -------------------
		             생성자 => 다른 클래스에서 접근이 가능하게 만들어야한다 => public
		                     무조건 생성하는 것이 아니다
		                     클래스에는 반드시 생성자가 있어야 한다
		                     => 생성자가 없는 경우에는 컴파일러가 자동으로 생성
		                     					----------------- 매개변수가 없는 생성자(디폴트 생성자)
		                     class A{
		                     	A(){} => 자동 생성
		                     }
		                     class A{
		                     	A(int a){} => 사용자가 생성자를 정의한 경우, 컴파일러에 의해 디폴트 생성자는 생성되지 않는다
		                     }
		                     *** 컴파일러가 자동 생성하는것들
		                         1) import : import.java.lang.*;
		                         			 			 ------
		                         			 			  | String,System,Math
		                         2) void Method(){
		                            	return; => 생략하는 경우, 자동으로 추가
		                            }
		                         3) 자바의 모든 클래스는 Object클래스를 상속받고 있다
		                            class A extends Object
		                                    -------------- Object에서 지원하는 모든 메소드를 사용할 수 있다
		                         4) 생성자가 없는 경우에는 디폴트 생성자를 추가해준다
		                         5) 자바의 모든 클래스는 예외처리를 가지고있다
		                         				   ------
		                         				    | 컴파일 시 / 런타임 시
		                     
		                     1) 역할
		                        = 멤버변수에 대한 초기화 담당
		                        = 메모리에 저장 시 반드시 호출되는 메소드
		                        = 모든 클래스는 생성자가 1개 이상 존재한다
		                        
		                     2) 특징
		                        = 생성자의 이름은 클래스명과 동일하다
		                        = 리턴형이 없다(*** void는 리턴형이다)
		                          class A => int A(),void A() => 일반 메소드
		                        = 다튼 클래스에서 사용할때에는 메모리 할당 후 사용할 수 있다 => public
		                        = 필요시에 여러개의 생성자를 제작할 수 있다
		                          같은 이름으로 여러개를 만들어서 다른 기능 수행
		                          ---------------
		                           | 오버로딩(중복함수정의)
		                             1) 조건
		                                = 메소드명이 동일하다
		                                = 매개변수의 갯수나 데이터형이 다르다
		                                  void aaa(int a)	aaa{int)
		                                  void aaa(int b)	aaa(int)
		                                  => 매개변수의 변수명이 다른것은 해당되지 않는다
		                                = 리턴형은 관계가 없다
		                                  void aaa()	aaa()
		                                  int aaa()		aaa()
		                                = 같은 클래스에서 제작
		                                = 생성자,멤버메소드에서도 적용
		                                       ------- println(),println(String s)...
		                                               substring(int s),substring(int s,int e)...
		                                               
		                     3) 사용처
		                        = 인스턴스 변수가 명시적인 초기화가 안되는 경우
		                        		                  -------- 파일 읽기,데이터베이스,크롤링
		                        = 시작과 동시에 처리하는 명령문
		                          예) 자동 로그인,ID 등록,윈도우 화면 디자인
		                             서버 => 서버가 동작, 클라이어트 => 데이터베이스 연결
		                         			 	
		             초기화 블록 => 생성자 없이 멤버변수 초기화
		             	컴파일러에 의해 자동 호출
		             	
		             	인스턴스 블록
		             	class A{
		             		int a;
		             		{
		             			a=(int)(Math.random()*100)+1;
		             		}
		             		A(){
		             			a=(int)(Math.random()*100)+1;
		             		}
		             		=> 인스턴스 변수흫 초기화해야할땐 초기화블록보다 생성자를 주로 사용한다
		             		   초기화블록으로 a변수를 먼저 초기화해주지만 A를 사용하려면 생성자를 호출해야하기 떄문이다
		             	}
		             	
		             	static 블록 => 자동으로 메모리 할당 => 생성자를 사용하지 않아도 된다
		             	class A{
		             		static int a;
		             		static{
		             			a=100;
		             		}
		             	}
		             	A aa=new A(); => aa.a
		             	A.a => 생성자 호출 없이도 클래스에 직접접근하여 사용 가능
		             	
		             	*** 주의점
		             		class A{
		             			int a;
		             			static int b;
		             			{
		             				a=100;
		             				b=200;
		             			}
		             			static{
		             				a=1000; => static블록에서는 인스턴스변수를 초기화할 수 없다
		             				           인스턴스 변수는 객체가 생성되어야 사용할 수 있다
		             				           A a=new A();
		             				           a.a=1000;
		             				b=2000;
		             			}
		             		}
		             		
		             	초기값에 대한 호출 순서
		             	1) 명시적인 초기화
		             	2) 초기화 블록
		             	3) 생성자
		             	*** 변수
		             	    멤버변수 / static 변수 / 지역변수 => 반드시 초기화를 해야 사용할 수 있다
		             	
		             -------------------
		             메소드 => 다른 클래스와의 통신을 위하여 => public
		             	형식)
		             		멤버메소드
		             		public 리턴형 메소드명(매개변수목록){
		             			=> static메소드나 static변수 사용 가능
		             			=> 인스턴스 사용 가능
		             		}
		             		
		             		=> 호출 => 객체명.메소드()
		             		   Scanner sc=new Scanner(System.in);
		             		   sc.nextInt();
		             		
		             		static 메소드
		             		public static 리턴형 메소드명(매개변수목록){
		             			=> static메소드나 static변수만 사용 가능
		             			=> 인스턴스 사용 불가
		             			   만약 사용하려면 반드시 객체 생성 후 사용해야한다
		             		}
		             		=> 호출 => 클래스명.메소드()
		             		   Math.random();
		             		   
		             		   String s="";
		             		   s.substring();
		             		   s.trim();
		             		   s.replace();
		             		   -------------- 멤버메소드
		             		   String.valueOf()
		             		   -------------- static 메소드
		             		   
		             		   Calendar c=Calendar.getInstance(); => new(X)
		             		   => 추상 클래스
		             		
		             		= 리턴형
		             		  	사용자 요청에 대한 처리 결과값(한개만 사용 가능)
		             		  	기본형
		             		     	정수,실수,문자,논리
		             		  	참조형
		             		     	배열,클래스
		             		  	결과값이 없는 경우
		             		     	void => return 생략 가능
		             		    결과값이 있는 경우 => 반드시 받아서 저장한다
		             		     	int aaa() => int a=aaa();
		             		  	메소드 호출 시, 특정부분부터 수행하는것이 아닌 처음부터 return까지 수행한다
		             		  
		             		= 메소드명
		             		  	변수명칭법과 동일하다(식별자)
		             		  	길이의 제한은 없다
		             		  	자바 개발자의 액속사항
		             		     	소문자로 시작
		             		     	소프트웨어의 이행에 있어 한글보다는 영문을 사용한다
		             		     	------------
		             		     	서버는 리눅스를 사용한다 => 차세대 운영체제(우분투)
		             		     	개발 : 윈도우/맥 => 호스팅 : 리눅스
		             		  
		             		= 매개변수
		             		  	사용자 요청값 => 로그인(id,pwd,check)
		             		  	=> 사용자의 입력,마우스 클릭,키보드 이용 => 매개변수로 처리
		             		  	매개변수의 갯수는 제한이 없다 => 3개 이상일 시 배열이나 클래스로 처리
		             		  	메소드 호출시 마다 메모리에 할당된다 => 임시변수
		             		  	매개변수는 지역변수의 일종 => 메소드 종료시 사라진다
		             		  	=> 자동 해제(메모리에서 자동 처리)
		             		  	=> 초기값을 주는 경우
		             		  	   메소드 호출시에 초기화를 해준다
		             		  	   예)
		             		  	   		public void disp(int a){}
		             		  	   		disp(10); => 매개변수의 값 설정
		             		  	   	
		             		  	*** 클래스도 데이터형이다
		             		  	
		             -------------------
		      
		   2) 메모리 저장
		   3) 활용(호출)
		
		3. 클래스의 종류
		   1) 일반 클래스
		   2) 추상 클래스
		   3) 인터페이스
		   4) 내부 클래스
		      = 멤버클래스,지역클래스,익명클래스
		        class A{
		        	class B{
		        		멤버클래스
		        	}
		        }
		        class A{
		        	public void disp(){
		        		class B{
		        			지역클래스
		        		}
		        	}
		        }
		        class A{
		        	B b=new B(){
		        		익명클래스
		        		상속없이 오버라이딩
		        	}
		        }
		   5) 종단 클래스 : 상속을 할 수 없는 클래스
		      final class => String,Math,System...
		
		4. 비정상 종료를 방지하는 프로그램 구현 => 예외처리
		
		
		CRUD
		회원가입 / 회원정보 / 회원수정 / 회원탈퇴
 		   
 */
package com.sist.main;

public class MainClass {
	int a=100;
	static int b=100;
	public static void aaa() {
		MainClass m=new MainClass();
//		System.out.println(a); // 인스턴스 변수 a는 static 메소드에서 사용할 수 없다
		System.out.println(m.a); // 객체를 생성해야 인스턴스 변수가 메모리에 할당된다
		System.out.println(b);
	}
	public static void main(String[] args) {
		
	}
}
