/*
 	1. 변수,배열 => int,String
 	2. 요청처리 => 연산자,제어문(메소드화)
 		연산자 : 산술연산자(+,%)
 			   비교연산자,논리연산자,대입연산자
 		제어문 : if,if~else
 			   for : 향상된 for => 출력
 			   		----------------- 웹,JavaScript
 			   							-----------
 			   								 |
 			   							  라이브러리
 			   							  forEach,map
 			   							  => VueJS,React,Redux
 			   while : 데이터베이스 연동(오라클에서 데이터 읽기)
 	
 	3. 분리작업 => 관련된 내용을 묶어서 사용
 		데이터 묶어서 사용
 			배열
 			클래스
 		명령문 묶어서 사용 => 입력/처리/출력 => 메소드
 		-----------------------------------
 		=> 객체지향 프로그램 : 재사용,수정,기능 추가,데이터 노출 방지
 						 ----- ---------- ----------- 캡슐화
 						   |	다형성(오버라이딩,오버로딩)
 						 변경해 사용 => 상속(is-a)
 						 있는 그대로 사용 => 포함(has-a)
 		-----------------------------------
 		1, 설계 => 인터페이스
 		2. 비정상 종료를 방지(오류를 사전에 처리) => 예외처리
 		3. 라이브러리 => 조립식 프로그램
 		   ------- 네트워크,데이터베이스 연동
 	
 	배열
 		연속적으로 메모리 할당 => 인덱스 이용
 		---- 메모리 크기가 동일해야 한다
 			 -------- 데이터형이 동일해야 한다
 		고정적이다(크기를 선언하면 수정이 어렵다)
 						   --- 큰 배열을 다시 만들어서 사용
 		--------------------------- 보완 : 컬렉션
 		
 		사용법
 			배열 선언
 				데이터형[] 배열명; => 권장사항
 				데이터형 배열명[]; => C언어
 			초기값 부여
 				명시적 초기화 => int,char
 					int[] arr={1,2,3,4,5};
 				
 				크롤링 초기화
 				파일
 				
 				입력 => int,char
 					int[] arr=new int[5];
 					arr[0]=sc.nextInt();
 					
 				난수 => int,char
 					int[] arr=new int[5];
 					arr[0]=(int)(Math.random()*100)+1;
 						저장해야할 데이터가 많을 경우
 						for문 => index이용
 					
 			필요시에 수정
 				arr[0] => 일반 변수와 동일
 				arr[0]=100 => arr[0]=1000
 				배열 : 변수명이 동일 => 인덱스번호 이용
 								  --------
 								  순차적 => for
 				
 			출력
 				향상된 for => 간결하다,속도가 빠르다
 				for(데이터형 변수명:배열,컬렉션)
 					-----		-------
 					  | 배열에 저장된 데이터형(일치,큰 데이터형을 사용)
 					=> 인덱스를 사용하지 않고 실제 데이터를 1개씩 읽어온다
 			
 			배열의 갯수 : 배열명.length
 			출력시에는 항상 0번부터 출력하는것은 아니다
 			필요시에는 length-1(거꾸로 출력)
 			배열의 범위를 초과하면 => ArrayIndexOutOfBoundsException
 			[0],[1]... => 인덱스,첨자
 			
 			자동초기화 => new를 이용하면 메모리 할당시에 자동 초기화
 				int 0, double 0.0, boolean false, char '\u0000'(null)
 				모든 클래스는 null
	 				int[] arr; => arr=null
	 				Stirng s; => null
 				int[] arr={1,2,3,4,5};
 				int[] arr=new int[5];
 						 ------------ 0,0,0,0,0
 			메모리 할당
 				int[] arr=new int[3];
 				---------
 				
 				arr			실제 저장되는 위치(Heap)
 							  arr[0]  arr[1]  arr[2] => 무조건 순차적
 				---			------------------------
 				100				0		0		0
 				---			100---------------------
 				
 */
import java.util.Scanner;

public class 배열_1 {
	public static void main(String[] args) {
		// 변수 선언 => year,month
		int year,month;
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=sc.nextInt();
		System.out.print("월 입력:");
		month=sc.nextInt();
		// 처리 => 달력을 만들기 위한 처리
		// => 1년 1월 1일 ~ 요청 날짜 => 총 날수 % 7 => 요일(1일자에 대한 요일)
		// 1. 전년도까지의 합
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400; // 윤년 조건
		// 2. 전달까지의 합
		int[] lastday= {
			31,28,31,30,31,30,
			31,31,30,31,30,31
		};
		// 문제 발생 => 2월(윤년 => 29, 윤년(X) => 28)
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			// 윤년이라면
			lastday[1]=29;
		}else {
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		// 3. +1
		total++;
		// 요일 구하기
		int week=total%7;
		/*
		 	char c=' ';
		 	switch(week){
		 	case 0:
		 		c='일';
		 		.
		 		.
		 		.
		 	}
		 */
		char[] strWeek= {'일','월','화','수','목','금','토'};
		// 달력 출력
//		System.out.println(year+"년도 "+month+"월 1일은 "+strWeek[week]+"요일입니다");
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strWeek.length;i++) {
			System.out.printf("%2c\t",strWeek[i]);
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}
}
