/*
 		변수/연산자/제어문
 			--------- 명령문
 		=> 묶어서 사용
 		변수 : 배열/클래스
 		
 		명령문 : 관련된 명령
 				=> 입력 관련/출력 관련/요청 관련 => 메소드
 				=> 동작 => 조립해서 사용(객체지향 프로그램)
 						------------ 수정/추가 용이(유지보수)
 		메소드는 한개의 기능만 수행이 가능하게 만든다
 		=> 자바는 클래스 영역을 벗어날 수 없다(클래스 종속)
 		1. 메소드 구성요소
 			= 리턴형 : 사용자 요청에 대한 처리 결과값
 					 결과값은 반드시 한개만 사용이 가능하다
 					 			--------
 					 				| 여러개인 경우 => 배열/클래스/컬렉션
 					 => 결과값을 예측해서 설정
 			= 매개변수 : 사용자가 요청한 값
 					  웹에서 : 마우스클릭,엔터,버튼,입력창
 					  => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 					  		   ---------- 마우스,키보드
 			= 메소드명 : 식별자
 					  => 소문자로 시작한다
 			= return문장 : 처리에 대한 결과값을 보내준다, 메소드의 종료점
 			  --------- 마지막에만 사용하는것이 아니라 중간에서도 사용할 수 있다
 			  메소드(){
 			  	if(){
 			  		return;
 			  	}else{
 			  		return;
 			  	}
 			  }
 			  
 		2. 메소드 형식
 			[접근지정어][옵션] 리턴형 메소드명(매개변수...) => 선언부
 			{
 				구현부
 				- 변수선언
 				- 연산자
 				- 제어문
 				-------- 결과값 도출
 				- return 결과값;
 			}
 			=> 결과값이 없을 시, 자체 처리 => void(return 생략)
 											----------
 												| 모든 메소드는 return을 필요로 한다
 												| 컴파일러에 의해 자동으로 추가
 												| return,import java.lang.*,extends Object
 																----------- String,Math,System
 			
 			[접근지정어]
 			public : 모든 클래스에서 사용
 			protected : 같은 폴더안에서, 다른 폴더 안에서는 상속받는 클래스까지
 			default : 같은 폴더안에서만(접근지정어 생략시)
 			private : 자신의 클래스 => 은닉화
 			
 			[옵션]
 			static : 자동으로 메모리에 저장 => new
 			abstract : 추상메소드 => 선언만 할때(설계,요구사항분석)
 			final : 수정이 불가능 => String,Math...
 			
 			리턴형
			기본형(int,long,byte,char,double,boolean)
			참조형(배열,클래스) => String,int[]
			1개만 사용 가능
			
			매개변수
			0개 이상
			기본형 : Call By Value
			참조형 : Call By Reference
			매개변수가 3개 이상이면 배열,클래스
			
		모든 프로그램
			입력 => 변수에 대한 초기화
			처리부분(요청) => CRUD
						  ----					오라클
						  Create	추가			INSERT
						  Read	읽기(목록,상세보기)	SELECT
						  Update	수정			UPDATE
						  Delete	삭제			DELETE
			출력 => 사용자가 볼 수 있게 만든다 => HTML,CSS
			main() => 프로그램의 시작과 종료
		
		3. 메소드 유형
			리턴형	매개변수	메소드 원형
 			 O		  O		String substring(int begin)
 			 O		  X		String trim(),double random()
 			 X		  O		void main(String[] args)
 			 X		  X		void println()
 			 
 			 한개의 클래스 안에서 메소드명이 동일할 수 있다
 			 				----------
 			 					|
 			 				매개변수의 갯수나 데이터형이 다르다
 			 				aaa(int a)
 			 				aaa(double d)
 			 				aaa(int a,int b) => overloading(중복 정의 메소드)
 		
 		4. 메소드 호출
 			인스턴스 메소드 => new를 이용해서 메모리에 저장
	 			Scanner sc=new Scanner(System.in);
	 			sc.nextInt();
	 			String s="";
	 			s.trim();
 			클래스 메소드(static) => 공유 => 자동 저장
 				Math.random();
 				
 			static
 			클래스명.메소드명()
 				같은 클래스인 경우 => 클래스명 생략 가능
 				다른 클래스인 경우 => 클래스명 생략 불가
 		
 		5. return값 설정
 			int display(){		double display(){		String display(){
 				return 10;			return 10.5;			return "";
 			}					}						}
 			void display(){		int[] display(){
 				return;(생략가능)		return int[];
 			}					}
 		
 		6. 메소드 사용 목적
 			반복되는 기능 제거
 			코드관리 용이(기능별 분리)
 			소스가 간결하다
 			재사용성이 좋다(다른 클래스에서 사용)
 			
 */
// 5개의 정수를 전송 => 정렬한다 int[]
// 5자리 정수를 전송 => 거꾸로 출력 12345 => 54321
import java.util.Arrays;

public class 메소드_1 {
//	static int[] sortASC(int[] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}
//	static int[] sortDESC(int[] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}
	static int[] sort(int[] arr,String type) {
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {
					bCheck=arr[i]>arr[j];
				}else {
					bCheck=arr[i]<arr[j];
				}
				if(bCheck) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	// Call By Reference : 리턴형 없이, 값을 넘겨받을 변수 없이 메소드 내에서 처리
	static void sort_1(int[] arr,String type) {
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {
					bCheck=arr[i]>arr[j];
				}else {
					bCheck=arr[i]<arr[j];
				}
				if(bCheck) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	static String reverse(int n) {
		String result="";
		String nStr=String.valueOf(n);
		for(int i=nStr.length()-1;i>=0;i--) {
			result+=nStr.charAt(i);
		}
		return result;
	}
//	static int reverse(int n) {
//		String result="";
//		String nStr=String.valueOf(n);
//		for(int i=nStr.length()-1;i>=0;i--) {
//			result+=nStr.charAt(i);
//		}
//		return Integer.parseInt(result); // 정수n의 마지막 자리가 0일경우는 String으로 넘겨야한다
//	}
	static void process() {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.print("정렬전:");
		System.out.println(Arrays.toString(arr));
//		int[] result=sortASC(arr);
//		System.out.println(Arrays.toString(result));
//		result=sortDESC(arr);
//		System.out.println(Arrays.toString(result));
//		int[] result=sort(arr, "ASC");
//		System.out.println(Arrays.toString(result));
//		result=sort(arr, "DESC");
//		System.out.println(Arrays.toString(result));
		sort_1(arr, "ASC");
		System.out.println(Arrays.toString(arr));
		sort_1(arr, "DESC");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(reverse(123));
	}
	public static void main(String[] args) {
		process();
	}
}
