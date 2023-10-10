//class Student{
//	
//} => MainClass.java에서 이미 사용중이라 사용할 수 없다
class Card{
	String type;
	int number;
//	int width,height;
	static int width,height;
	
//	Card(){
//		System.out.println("메모리 생성 완료");
//	}
//
//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		System.out.println("메모리 해제");
//	}
}
/*
 		new Card()
 		---------------- => 주소를 이용하여 접근이 가능 (.)
 			--type----
 			
 			--number--
 			
 			--width---
 			
 			--height--
 			
 			----------
 		----------------
 		* 클래스는 여러개의 데이터를 한개로 묶어서 메모리에 저장 후 사용
 				----------- 클래스 설계
 							--------
 							=> new를 이용하여 메모리에 저장
 		* 주소에 대한 개념이 거의 없다
 		  --- &,*(C언어에서의 클래스 접근시 사용) => 자바에는 없다
 		* 상속 => super/this
 		* 한개,한명에 대한 정보를 설계
 		  사원이 10명 => 한개의 클래스로 메모리 공간을 10개 생성 => new 10번
 		------------------------------------------------------
 		사용자 정의 데이터형 Board => 게시판에 관련된 데이터들의 집합
 		메소드 묶음(액션 클래스) BoardSystem => 게시판과 관련된 기능들의 집합(읽기,쓰기...)
 		데이터형+메소드 혼합
 		--------------------------------
 						|
 					재사용이 가능,데이터 보호,수정,추가
 		
 		*** 클래스는 단순화 작업 => 시뮬레이션
 				  ----- 추상화 => 공통적으로 가지고 있는 특성
 			예)
 				시계
 				= 시침
 				= 분침
 				= 초침
 				컴퓨터
 				= 모니터
 				= 본체
 				= 키보드
 				= 마우스
 				사원
 				= 사번
 				= 이름
 				= 부서명
 				= 직위
 				= 근무지
 				= 입사일
 				= 연봉
 				
 		*** 클래스는 일반(기본형) 동일하게 사용
 			--- '.', 배열(index)
 			 |
 			형변환 => 상속(is-a),포함(has-a)
 			
 */
// 52개 저장 => new => 메모리 공간이 다르다(다른 값을 저장할 수 있다)
public class MainClass2 {
	public static void main(String[] args) {
		// Card 1장 생성
		Card card1=new Card();
		card1.type="♥";
		card1.number=1;
		card1.width=150;
		card1.height=200;
		
		Card card2=new Card();
		card2.type="♠";
		card2.number=2;
		card2.width=150;
		card2.height=200;
		
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.width="+card1.width);
		System.out.println("card1.height="+card1.height);
		System.out.println("==========================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.width="+card2.width);
		System.out.println("card2.height="+card2.height);
		// 변경
		card1.width=250;
		card1.height=300;
//		card2.width=250;
//		card2.height=300;
		System.out.println();
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.width="+card1.width);
		System.out.println("card1.height="+card1.height);
		System.out.println("==========================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.width="+card2.width);
		System.out.println("card2.height="+card2.height);
		
//		card1=null;
//		card2=null;
//		
//		System.gc();
	}
}
