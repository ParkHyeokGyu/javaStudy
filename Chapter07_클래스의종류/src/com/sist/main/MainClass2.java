/*
 	클래스의 종류
 	1)사용자 정의 일반 클래스
 	  = 데이터형(여러개의 변수를 모아 한번에 저장)
 	    ~VO(ValueObject) => Spring
 	    ~DTO(Data Transfer Object) => MyBatis
 	    ~Bean => JSP
 	    
 	  = 액션클래스 : 데이터형 클래스를 제어 => 메소드
 	    ~DAO(Data Access Object) => 오라클 연결
 	    ~Manager => 파일입출력,크롤링,Open API
 	    ~Service => DAO 여러개를 묶어 관리
 	    			DAO : 게시판
 	    			DAO : 댓글
 	    ~Controller => 자바에서 브라우저 연동
 	    ~RestController => 자바 ==> 자바스크립트
 	    					  JSON
 	    
 	2)추상클래스 => 단일 상속
 	  = 관련된 클래스를 모아서 관이(서로 다른 클래스를 연결해서 사용)
 	    미완성 클래스 => 메소드를 구현하지 않고 선언만
 	    => new를 이용해서 메모리 할당을 할 수 없다
 	    => 사용시에는 반드시 상속을 내려서 구현후에 사용
 	    			   -------------- 오버라이딩
 	  = 선언만 한 메소드가 존재할 수 있다
 	  = 인스턴스 변수,메소드 사용 가능
 	  = 형식
 	    public abstract class ClassName{
 	    	---------------
 	    	변수 영역
 	    	---------------
 	    	메소드 => 구현
 	    	public void display(){}
 	    	=> 공통으로 사용 => 필요시에 오버라이딩하여 사용할 수 있다
 	    	---------------
 	    	메소드 => 선언 => 없을 수 있다
 	    	public abstract void display();
 	    	=> 상속을 받는 클래스는 반드시 선언된 메소드를 구현해야한다
 	    	=> 구현이 안되는 경우
 	    	   버튼,마우스,키보드 => 디폴트가 불가능
 	    	---------------
 	    }
 	    
 	  public abstract class A
 	  public class B extends A{}
 	  A a=new B();
 	  => 구현된 클래스를 이용해서 메모리 할당
 	  
 	  *** 추상클래스 => 공통성을 가지고 있는 클래스
 	      예)
 	         게시판		목록출력,검색,글쓰기,내용보기,수정하기,삭제하기
 	         묻고답하기		목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,답변하기
 	         댓글게시판		목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,댓글
 	         후기게시판		목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,업로드
 	         
 	      1)공통으로 사용되는 메소드를 찾는다
 	      2)추상메소드(구현이 안된 메소드)
 	        => 클래스를 묶어서 한개의 이름을 제어
 	           설계 => 프로그램에 맞게 구현
 	           클래스 하나로 모든 게시판을 제어할 수 있다
 	        => 추상클래스 확인
 	           1)선언된 클래스와 생성자가 다른 경우
 	           2)메모리 할당시 메소드 이용
 	             List list=new ArrayList();
 	             
 	3)인터페이스 => 다중 상속,추상클래스의 일종
 	4)내부클래스
 	
 	=> 버튼,마우스,키보드 => 디폴트 값을 잡을 수 없다(프로그램에 따라 다르다)
 	   구현이 되어 있지 않다
 	   abstract class ActionListener{
 	   		버튼클릭();
 	   		더블클릭();
 	   }
 	   abstract class MouseListener{
 	   		마우스클릭_Left();
 	   		마우스클릭_Right();
 	   }
 	   abstract class KeyListener{
 	   		키보드클릭();
 	   		키보드UP();
 	   }
 	   
 	   게임 제작
 	   class Game1 extends ActionListener
 	   class Game2 extends MouseListener
 	   class Game3 extends KeyListener
 	   
 	   class Game4 extends Game1
 	   class Game5 extends Game4
 	   
 	   class Game implements ActionListener,MouseListener,KeyListener
 	   => 추상클래스 보완
 	      1)다중 상속
 	      2)구현이 안된 메소드만 사용
 	      3)변수 => 상수
 	      4)다른 클래스에 영향이 없게 만든다
 	      
 	      			메소드호출	인	
 	      			======>	터 <=====> 객체
 	         개발코드			페	
 	      			<======	이 <=====> 객체
 	      		  	  리턴값	스	
 	      		
 */
package com.sist.main;
import java.util.*;
abstract class 도형{
	// 선,사각형,삼각형,원...
	public abstract void draw(); // 추상 메소드
	public void select() {
		System.out.println("검정색을 사용한다");
	}
}
class 선 extends 도형{

	@Override
	public void draw() {
		System.out.println("선을 그린다");
	}
	
}
class 사각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
	
}
class 원 extends 도형{

	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
	@Override
	public void select() {
		System.out.println("빨간색을 사용한다");
	}
}
class 삼각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	@Override
	public void select() {
		System.out.println("파랑색을 사용한다");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("도형 선택:원(1),사각형(2),선(3),삼각형(4):");
		int mode=sc.nextInt();
		
		도형 a=null;
		if(mode==1) {
			a=new 원();
		}else if(mode==2) {
			a=new 사각형();
		}else if(mode==3) {
			a=new 선();
		}else if(mode==4) {
			a=new 삼각형();
		}
		a.draw();
		a.select();
		
//		if(mode==1) {
//			원 a=new 원();
//			a.draw();
//			a.select();
//		}else if(mode==2) {
//			사각형 a=new 사각형();
//			a.draw();
//			a.select();
//		}else if(mode==3) {
//			선 a=new 선();
//			a.draw();
//			a.select();
//		}else if(mode==4) {
//			삼각형 a=new 삼각형();
//			a.draw();
//			a.select();
//		}
	}
}
