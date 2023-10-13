/*
 		1. 접근지정어 => 접근이 가능한 범위를 설정
 		   1) private : 멤버변수 선언
 		      => 자신의 클래스에서만 사용 가능 => 은닉화
 		      => private String id;
 		         private String pwd;
 		         
 		   2) default : 윈도우(버튼,기타 컴포넌트)
 		      => 같은 패키지에 있는 클래스
 		      => 접근지정어를 따로 지정하지 않은 경우
 		      => int num;
 		         JButton btn;
 		         
 		   3) protected : 거의 사용빈도가 없다
 		      => 같은 패키지에 있는 클래스
 		         다른 패키지에 접근(상속)
 		   
 		   4) public : 생성자,클래스,메소드 => 다른 클래스에서의 접근
 		      => 패키지 상관없이 모든 클래스에 접근이 가능
 		   
 		   private < default < protected < public
 		   오버라이딩할 시, 접근지정어의 축소는 불가능 확장은 가능
 		   
 		2. 관련된 클래스를 모아서 관리 => 찾기가 용이
 		   ------------------- 패키지(폴더 개념) => 클래스별 분리
 		   패키지명칭
 		   = 키워드는 사용할 수 없다
 		   = com(org).회사명.분리단위
 		     분리단위
 		     = vo : 클래스형 데이터
 		     = dao : 데이터베이스 연동
 		     = model : 브라우저로 전송
 		     = manager : 크롤링,파일 입출력
 		     = service : 데이터베이스 여러개를 한번에 처리(JOIN,SUBQUERY)
 		   
 		   패키지가 다른 경우
 		   = 반드시 import를 이용해서 클래스를 읽어온다
 		   패키지가 같은 경우
 		   = import없이 쿨래스룰 사용할 수 있다
 		     ------ 라이브러리만 불러오는게 아니라 사용자 정의 클래스도 불러올 수 있다
 		     import com.sist.dao.*;
 		     = 여러개 사용시에는 *
 		     = 한개만 사용시에는 클래스명 지정
 		     
 		*** 자바 소스코딩의 형식
 			package => 한번만 사용 가능
 			import => 여러개 사용 가능
 			public class ClassName{
 				멤버변수 선언
 				생성자
 				멤버메소드{
 					지역변수 선언 => 메소드 종료 시 사라진다
 				}
 			}
 			=> 가독성을 위하여 위의 형식을 권장한다
 			
 		*** 패키지를 사용하면
 			default로 선언된 메소드,변수,생성자는 사용할 수 없다
 */
package com.sist.main;

public class MainClass2 {
	public static void main(String[] args) {
		
	}
}
