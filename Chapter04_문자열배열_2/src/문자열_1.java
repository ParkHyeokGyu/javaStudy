/*
 		문자열 저장 => String => ""
 		한개 저장
 			String 변수명=""
 		여러개 저장
 			String[] 배열명={"","","","".....};
 			String[] 배열명=new String[5];
 		
 		String은 클래스 => 메소드(기능)
 			1. 메소드명 : 기능
 			2. 결과값 확인
 			3. () => 매개변수 확인
 			
 		length()
 			원형 : int length() => 문자의 갯수
 				 String s="Hello";
 				 int len=s.length();
 				 
 		toUpperCase()
 			원형 : String toUpperCase() => 대문자변환
 				 String s="Hello";
 				 String ss=s.toUpperCase();
 				 
 		toLowerCase()
 			원형 : String toLowerCase() => 소문자변환
 		
 		substring() : 문자를 자른다
 			원형 : String substring(int begin), String substring(int begin,int end)
 				 -------		  -----------
 				  리턴형:요청처리결과		매개변수:사용자요청
 				  	예) 
 				  	요청 => id,pwd => 결과값 boolean
 				  	boolean isLogin(String id,String pwd)
 				  String ss=s.substring(1);
 		
 		startsWith() : 시작문자열이 같은지 확인
 			원형 : boolean startsWith(String msg)
 				 if문에서 주로 처리
 				 String s="Hello Java";
 				 if(s.startsWith("H")) => true
 				 서제스트(자동 완성기)
 				 오라클 : LIKE 'A%' => A로 시작하는 단어
 				 
 		endsWith() : 끝나는 문자열이 같은지 확인
 			원형 : boolean endsWith(String msg)
 				 확장자 확인(jpg,png,gif....) => 갤러리 게시판
 				 오라클 : LIKE '%A' => A로 끝나는 단어
 		
 		contains() : 문자열 포함 여부 확인
 			원형 : boolean contains(String msg)
 				 검색
 				 오라클 : LIKE '%A%' => A를 포함하는 단어
 		
 		trim() : 좌우 공백 제거
 			원형 : String trim()
 				 로그인 입력,검색어 입력,회원가입
 				 유효성 검사
 				 
 		equals() : 같은 문자인지 확인(대소문자 구분)
 			원형 : boolean equals(String msg)
 				 로그인 처리(아이디,비밀번호)
 		
 		replace() : 문자,문자열 변경 => 데이터베이스
 			원형 : String replace(char c,char c1)
 								------- -------
 								  old	  new
 				 String replace(String s,String s1)
 			오라클:||(문자열결합),&(입력값) => 이미지(URL)
 		
 		valueOf() : 모든 데이터형을 문자열로 변환
 			원형 : String valueOf(int,boolean...)
 				 static => 해당 메소드는 메모리에 자동으로 할당되어있다
 				 String.valueOf() => 클래스로 접근이 가능하다
 		
 		toString() : 생략이 가능 => 객체의 주소값 출력
 		
 		indexOf() : 지정된 문자 위치값 확인(문자번호 0번부터 찾는다)
 			원형 : int indexOf(char c)
 				 int indexOf(String s)
 		
 		lastIndexOf() : 지정된 문자 위치값 확인(문자번호 length()-1부터 찾는다)
 			원형 : int lastIndexOf(char c)
 				 int lastIndexOf(String s)
 		
 		concat() : 문자열 겹합(+)
 			원형 : String concat(String s)
 			
 		split() : 특정 문자를 중심으로 잘라서 배열에 저장
 			원형 : String[] split(String regex)
 									   ------- 정규식
 		replaceAll() : 문자열 변환
 			원형 : String replaceAll(String regex)
 */
import java.util.Scanner;

public class 문자열_1 {
	public static void main(String[] args) {
//		문자열_1 a=new 문자열_1(); // 클래스 저장
//		System.out.println(a); // toString()이 생략되어있다
		// 변수 a의 주소값 출력
		
		String[] names={"홍길동","박문수","심청이","이순신","강감찬"};
		// String은 문자 저장에 제한이 없다
		/*
		 	Stack영역			Heap영억
		 	names			names[0]	[1]		[2]....
		 	----------		------------------------------------------
		 		100			"홍길동" | "박문수" | "심청이" | "이순신" | "강감찬"
		 	----------		|-----------------------------------------
		 					메모리 주소(100)
		 	
		 	1. 선언
		 		데이터형[] 배열명;
		 		데이터형 배열명[];
		 	2. 초기값
		 		데이터형[] 배열명={};
		 		데이터형[] 베열명=new 데이터형[갯수];
		 		배열명[0]="";
		 		for문
		 		난수발생
		 	3. 활용/변경,출력
		 			  --- for-each
		 		배열명[0]=""; => 값변경
		 */
		// 출력
		for(String name:names) { // 실제 저장값을 가지고 온다
			System.out.print(name+" ");
		} // 인덱스를 이용한것보다 속도가 빠르다
		System.out.println();
		// 인덱스를 이용한 출력
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+ " ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=sc.next();
		int index=0;
//		for(String n:names) {
//			if(n.equals(name)) {
//				break;
//			}
//			index++;
//		}
		for(int i=0;i<names.length;i++) {
			System.out.println(i);
			if(names[i].equals(name)) {
				index=i;
				break;
			}
		}
		System.out.println((index+1)+"번째");
	}
}
