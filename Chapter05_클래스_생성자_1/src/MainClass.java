/*
 		클래스
 		용도	1. 데이터형 클래스 => 사용자 정의 데이터형
 				=> 메모리 저장 / 메모리 읽기
 				=> 실무 / 프로젝트 => ~VO, ~DTO
 								---------- 캡슐화 목적
 				=> 관련된 데이터를 묶어서 사용 => 관리 및 추가 용이
 				=> 초기화
 					초기화 블록
 					생성자
 			2. 액션 클래스 => 메소드의 묶음
 				=> 게시판(목록,수정,상세보기,삭제,추가,검색)
 			3. 코드 재사용
 			   코드 관리 용이
 			   신뢰성
 			_____________________________________ 객체지향 프로그램
 			
 		기본문법 => 활용
 		=> 자바 / 오라클 / HTML / CSS / JavaScript
 									-----------
 										|
 									Ajax/jQuery/React
 												React-Query
 		=> JSP : 활용 => 사이트
 		=> 실무 : Spring / Spring-Boot
 			=> MSA(서버 분산) => DevOps(CI/CD) => Git
 			
 		자바
 		1. 변수
 		2. 연산자
 		3. 제어문
 		-------- 기본 문법
 		4. 배열
 		5. 메소드
 		--------
 		6. 클래스
 		   	1) 구성요소
 		   	[접근지정어][옵션] class ClassName{
 		   		---------
 		   		변수 : 클래스 전체, 다른 클래스에서 사용이 가능
 		   			  (멤버변수)
 		   			  1) 기본형
 		   			  2) 배열
 		   			  3) 클래스
 		   			=> 멤버변수(인스턴스변수)
 		   				=> new 사용 시 마다 따로 저장하는 변수
 		   				class ClassName{
 		   					int a;
 		   					int b;
 		   					String s;
 		   					int[] arr;
 		   					// 클래스 영역 전체에서 사용이 가능
 		   					// 다른 클래스에서도 사용이 가능
 		   				}
 		   				
 		   				생성시점
 		   				ClassName a=new ClassName();
 		   				ClassName b=new ClassName();
 		   				
 		   				---a---
 		   				 0x100	=>	new
 		   				-------		0x100-----
 		   								a	=>	0
 		   								b	=>	0
 		   								s	=>	null
 		   								arr =>	--arr--
 		   							----------	-------
 		   										
 		   			=> 공유변수(클래스변수)
 		   				=> 메모리 공간이 1개(오라클의 저장된 변수는 모두 공유변수이다)
 		   				=> static
 		   		---------
 		   		생성자
 		   		초기화 블록
 		   		---------
 		   		메소드
 		   	}
 		   	
 		   	class Sawon{
 		   		사원 관리에 필요한 변수 설정
 		   	}
 		   	class SawonSystem{
 		   		사원 관리 기능 처리
 		   		Sawon[] sawons=new Sawon[10]; => 잘못된 코드이다, 사원을 추가할때 마다 호출 시 메모리에 새로운 공간이 지정된다
 		   		static Sawon[] sawons=new Sawon[10]; => static 클래스변수로 지정 시, 다시 호출해도 메모리에 올라가있는 것을 사용한다
 		   	}
 		   	
 		   	A => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=A;
 		   	B => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=B;
 		   	C => SawonSystem s=new SawonSystem();
 		   		 sawons[0]=C;
 		
 		자바는 모든 코딩(변수,메소드...) => 클래스안에서만
 		static변수는 지역변수로는 사용이 불가능
 		클래스 블록안에서만 사용이 가능
 		
 		예)
 			class ClassName{
 				static int a;
 				int b;
 				void aaa(){
 					static int c; => 오류
 				}
 			}
 			
 			class A{
 				다른 클래스 접근
 				ClassName.a => static변수 접근
 				ClassName aa=new ClassName();
 				aa.b => 인스턴스변수 접근
 			}
 		
 		한개의 파일 => class를 여러개 사용이 가능
 		-------- class를 한개만 사용(권장)
 		
 		클래스 선언부 위에는 package,import외에는 없다
 		package : 소속 => 한번만 사용이 가능
 		import : 외부에 있는 클래스를 불러올때
 				 라이브러리 / 사용자 정의 클래스
 				 어려번 사용이 가능
 		
 		class A{
 		
 		}
 		class B{
 			반드시 main을 포함하는 class
 		}
 		컴파일 시에는 A.class, B.class
 */
class A{
	
}
public class MainClass {
	public static void main(String[] args) {
		
	}
}
