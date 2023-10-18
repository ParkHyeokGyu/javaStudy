/*
 	추상클래스 => 확장(보완) => 인터페이스
 	
 	인터페이스
 	1.추상클래스의 일종
    2.인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있다
               --------------
               | 인터페이스에 메소드를 구현할 수 없다
               | JDK 1.8 => 메소드를 구현할 수 있다
                            ---- 접근 지정어는 default나 static 사용
    3.형식 => 247page
      public interface 인터페이스명{
          ------------------
          변수
          => 상수형변수만 사용
             int a; => X
             int a=10;
             => public static final이 생략되어있다
          ------------------
          구현이 안된 메소드
          => void display();
             구현내용이 많은 경우
             프로그램에 맞게 구현해서 사용
             => public abstract void display();
                *** 인터페이스의 모든 메소드는 public이어야 한다
          ------------------
          구현이 된 메소드
          => default void aaa(){}
             static void bbb(){}
             => public 생략
          ------------------
          생성자가 존재하지 않는다
          => 추상클래스에는 존재한다
          ------------------
      }
    
      상속
      implements => 구현해서 사용
      
      interface ===> interface
      interface A
      interface B (extends) A
      
      interface ===> class
      interface A
      class B (implements) A
      
      class ===> interface
      class A
      interface B () A => 오류
      
      interface A
      interface B extends A => A,B
      interface C extends B => A,B,C
      interface D extends A,B
      					 ----- 여러개를 동시에 받을 수 있다
      					 
      interface A
      interface B
      class C implements A,B => 다중 상속
      
      interface A
      interface B
      class C
      class D extends C implements A,B
              -------   -----------
              | class 상속 | interface 상속
      
      인터페이스는 모든 변수나 메소드의 접근지정어는 public이어야 한다
      => 따로 명시하지 않아도 컴파일러에 의해 자동으로 추가된다
      변수는 반드시 명시적인 초기화를 해야한다
      
      4.사용처
        윈도우 이벤트 처리
        사용자 정의 => 클래스 관리(스프링:클래스 찾기(DL))
        => 인터페이스 대신 어노테이션으로 변경
      
      설계
      1.개발기간이 단축
        예)
        	예약
        	로그인
        	맛집선택
        	예약일 선택
        	예약 시간 선택
        	인원 확인
        	계약금을 전송
        	좌석 선택
      2.표준화
        상속받는 모든 쿨래스둘은 같은 매소드를 구현해야한다
      3.서로 다른 클래스들을 연결해주는 역할(스프링)
      
      *** 인터페이스는 자기 자신이 메모리에 할당될 수 없다
          => 구현된 클래스를 이용해서 메모리에 할당된다
          
          interface A
          class B implements A
          => A a=new B();
      -------------------------------------------------
      실무
      개발기간 : 8개월
      1.설계(요구사항분석) => 3개월 => 인터페이스 => 아키텍쳐
      2.데이터베이스설계 => 1개월 => DBA
      3.화면UI => 1개월 => 퍼블리셔
      4.구현 => 2개월 => 웹프로그래머
      5.테스트 배포 => 1개월 => 테스터
      
 */
package com.sist.main;
import javax.swing.*;
import java.awt.event.*;
public class MainClass3 extends JFrame implements ActionListener,MouseListener,KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
