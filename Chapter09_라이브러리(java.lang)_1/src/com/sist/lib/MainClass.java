/*
 	java.lang / java.util / java.text / java.io / java.net / java.sql
 	=> 표준 자바 JDK1.0
 	=> javax(웹,윈도우) => 확장 JDK1.2
 	
 	java.lang => package가 다르면 import를 사용해서 클래스를 가지고 와야 한다(java.lang은 생략이 가능)
 		Object : 모든 클래스의 상위 클래스(모든 클래스는 Object 상속을 받는다)
 				 모든 데이터형을 받을 수 있는 클래스
 				 모든 데이터형을 모아서 관리
 				 Object[] obj={"",'',10,10.5,new A()};
 				 -------------------------------------
 				  | 자바스크립트(배열 자체가 Object이기때문에 사용할 수 있다)
 				 기능만 가지고 있다(메소드)
 				 주요 기능
 				 1)toString() : 자주 사용된다, 객체를 문자열화
 				   => 오버라이딩이 가장 많이되는 메소드
 				   => 기본 출력 : 객체의 주소값
 				   => 객체를 출력할때 toString()이 생략되고 있다
 				   => String toString()
 				 2)clone() : 객체를 복제해서 새로운 객체 생성
 				   => 스프링에서 주로 사용
 				      ----
 				       | 싱글톤(한개의 객체만 생성해서 재사용하는 방식)
 				              -------- 필요시에는 여러개 생성 가능(clone())
 				       | 응용 => JSP에서 (웹) => 알고리즘이 필요 없다
 				       | 스프링 => 디자인 패턴/알고리즘
 				   => Object clone() throws CloneNotSupportedException
 				      ------ 1.예외처리 2.형변환
 				   => 1.원형(리턴형,메소드명,매개변수)
 				      2.사용처
 				      3.70~80% 이미 만들어져있다(라이브러리)
 				        20~30% 사용자 정의 => 라이브러리+사용자 정의(조립식)
 				        => 라이브러리 중심으로 프로그램 구현 => CBD(ComponentBaseDevelope)
 				        => 프로그래머 vs 개발자
 				              |		   | 없는 것을 만드는 사람(C,C++)
 				           이미 존재하는 기능을 조립(자바,C#)
 				        => Python / C/C++ / Java / C# ==> 해외 점유율
 				        => Java / C/C++ / Python / C# ==> 국내 점유율
 				           => 특성
 				              미국,유렵 => 아키텍쳐(설계)
 				              인도 => 구현
 				              일본 => 무선 발전
 				              한국 => 유선 발전 => 웹사이트(자바)
 				 3)finalize() : 소멸자(객체 메모리 해제시에 자동 호출)
 				                => 멀티미디어(스트리밍 서비스)
 				                => 멜론/지니뮤직/OTT
 				                => 아프리카 TV
 				                => protected void finalize()
 				 4)equals() : 객체 비교시에 주로 사용
 				              String에서 오버라이딩이 된 메소드를 주로 사용
 				              => boolean equals(Object obj)
 				                        --------
 				                        == : 주소값을 비교한다, 실제 메모리에 저장된 값
 				                        equals : 객체가 가지고 있는 데이터가 같은지 여부
 				              문자열은 자체가 주소이다
 				              ----
 				               | 문자열이 같은 경우에는 같은 주소
 				               | 문자열은 같지만 다른 주소에 저장시에는 new를 이용한다
 				               
 		String : 문자열을 저장하는 데이터형/클래스형
 		         --------- 기능을 사용할 수 있다
 		         비교
 		         = equals => 같은 문자열인지 확인
 		           => 로그인,아이디 중복체크
 		           => 아이디 찾기,비밀번호 찾기
 		           => 상세보기
 		           => boolean equals(String s)
 		           => 같은 문자열은 같은 주소를 가지고 있다
 		              new를 이용하면 다른 주소에 저장
 		         
 		         = startsWith/endsWith
 		           => boolean startsWith(String s)
 		              s로 시작하는 문자열
 		              자동 완성기 => 대소문자 구분
 		           => boolean endsWith(String s)
 		              s로 끝나는 문자열
 		              사용빈도가 거의 없다
 		         
 		         = contains : 문자열 포함 여부
 		           => 자바스크립트도 동일
 		           => boolean contains(String s)
 		              문자열중에 s 포함 여부
 		              가장 많이 사용 되는 메소드
 		         
 		         문자열 분리
 		         = split()
 		           => 원하는 문자별로 분리
 		           => String[] split(String s) => 크롤링
 		           			   ---------------
 		           			    | 정규식을 이용한다
 		              			  표현법
 		              			  기호 => \\기호
 		           				  ------------
 		           				  ^ => ^A => A로 시작하는 모든 문자열
 		           				             startsWith("A"),A%(오라클)
 		           				             <img src^="http|https">
 		           				             
 		           				  $ => A$ => A로 끝나는 모든 문자열
 		           				             endssWith("A")
 		           				             <img src$="jpg|png|gif">
 		           				             
 		           				  + => A+ => A로 시작 => 1개 이상 문자열 => AB,ABC...
 		           				  
 		           				  * => A* => A로 시작 => 0개 이상 문자열 => A,AB...
 		           				             <img src*="aaa"> => aaa가 포함된 모든것
 		           				             
 		           				  | => a|b => a 또는 b
 		           				              한 글자씩 가져온다
 		           				  
 		           				  [] => 문자의 범위
 		           				        [A-Z] 대문자 전체 ^[A-Z] 대문자로 시작하는
 		           				        [a-z] 소문자 전체
 		           				        [0-9] 숫자
 		           				        [가-힣] 한글 전체
 		           				        
 		           				  {} => 문자의 갯수
 		           				        {3} 3글자 이상, {1,3} 1글자에서 3글자 사이
 		           				        
 		           				        IP 정규식
 		           				        211.238.142.1...
 		           				        [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.
 		           				        => . 임의의 한 글자
 		           				           .. 두 글자
 		           				  => 오라클/JavaScript/CSS에서도 쓰인다
 		           				  
 		         = substring()
 		           => 문자열을 자른다
 		           => String substring(int s)
 		              String s="Hello Java"
 		                        0123456789 => 문자열의 시작은 0부터
 		              s.substring(6) => 6부터 나머지 전체 => "Java"
 		              
 		           => String substring(int s,int e) => s~e-1
 		              s.substring(1,4) => 1부터 4전까지 => "ell"
 		           
 		           => 화면의 문자가 길어지면 사용 (...)
 		         
 		         문자열 변환
 		         = replace
 		           => String replace(char c1,char c2)
 		           					   old     new
 		           		     replace('A','B')
 		           		     
 		           => String replace(String s1,String s2)
 		           			 replace("파이선","자바)
 		         
 		         = replaceAll => 정규식
 		         
 		         문자 위치 찾기
 		         = intdexOf => 앞에서부터 찾기
 		           => int indexOf(chac c)
 		           => int indeexOf(String s)
 		           
 		         = lastIndexOf => 뒤에서 찾기
 		           => int lastIndexOf(char c)
 		           => int lastIndexOf(String s)
 		         ------------------------------
 		         => char[]을 쉽게 제어가 가능하게 만든 클래스
 		           
 		            Hello Java
 		            0123456789
 		            s.indexOf('a') => 7
 		            s.lastIndexOf('a') => 9
 		            => 경로명/웹사이트 주소
 		            
 		         기타
 		         = length() : 문자의 갯수
 		           => int length()
 		           
 		         = trim() : 좌우 공백 제거
 		           => String trim()
 		              사용자 입력이 있는 경우
 		              
 		         = valueOf() : 모든 데이터형을 문자열로 변환
 		           => static String valueOf(int a)
 		              모든 데이터형이 오버로딩되어있다
 		              String.valueOf(10) => "10"
 		         
 		         = charAt()
 		           => char charAt(int index)
 		              한글자를 잘라 문자로 변환
 		         
 		         = concat()
 		           => String concat(String s)
 		              문자열 결합 => +
 		         
 		StringBuffer : 보완(String을 보완)
 		=> 문자열 결합(최적화) => append()
 		
 		Wrapper : 기본타입의 데이터를 객체로 저장
 		          ------ 쉽게 사용이 가능하게 만들기 위해 기능을 첨부한 클래스화
 		          정수형 317page
 		          	byte	Byte
 		          	short	Short
 		          	int		Integer
 		          	long	Long
 		          실수형
 		          	float	Float
 		          	double	Double
 		          논리형
 		          	boolean	Boolean
 		          문자형
 		          	char	Character
 		          -------------------
 		          웹
 		          주소 => 유일하게 서버와 연결
 		          => 사용자가 값을 서버로 전송
 		             URL주소?page=10
 		                   -------- String page="10"
 		                   				   ---------
 		                   				   int로 변경후에 사용
 		                   				   int a=Integer.parseInt(page)
 		          -------------------
 		          => 박싱(오토박싱)/언박싱
 		          	 Integer i=10; // 박싱
 		          	 int j=i; // 언박싱
 		             => 서로 호환이 된다
 		
 		System
 			println() : 화면 출력
 			gc() : 메모리 회수 요청
 			exit() : 프로그램 종료
 			
 		Math
 			random() : 임의의 수 발생 => double(0.0~0.99)
 			ceil() : 올림 메소드 => double
 			=> ceil(165/10.0) => 17
 			=> Math의 모든 메소드가 static로 되어있다
 			   Math.ceil(),Math.random()...
 			
 		Thread : 한개의 프로그램 안에서 여러개의 프로그램을 동시에 실행 => 시분할
 		         서버는 여러명이 접속시에 따로 동작이 가능하게 만들어 준다
 		         
 */
package com.sist.lib;
import java.io.*;
public class MainClass {
	public static void main(String[] args) {
		/*String s1="Hello";
		String s2="HEllo";
		// 새로운 메모리 공간에 Hello 저장
		String s3=new String("Hello");
		// 주소가 같은지 확인 => ==
		if(s1==s3) {
			System.out.println("같은 주소를 가지고 있다");
		}else {
			System.out.println("다른 주소를 가지고 있다");
		}
		
		// 실제 저장된 데이터(문자열) => equals()
		if(s1.equals(s3)) {
			System.out.println("같은 문자열을 가지고 있다");
		}else {
			System.out.println("다른 문자열을 가지고 있다");
		}
		
		// 대소문자 구분 없이 비교 equalsIgnoreCase() => 검색
		// 대소문자 구분 비교 equals() => 로그인*/
		
		/*String data="홍길동|박문수|이순신|강감찬|을지문덕";
		String[] names=data.split("\\|");
		for(String s:names) {
			System.out.println(s);
		}*/
		
		// 다중 검색 => N(name),S(subject),C(content) => 게시물 검색 옵션
		/*String data="NSC";
		String[] ss=data.split("");
		for(String s:ss) {
			System.out.println(s);
		}
		data.substring(1, 5);*/
		
		/*String[] data= {
			"a.png",
			"b.jpg",
			"c.gif",
			"d.java",
			"e.java",
			"f.zip"
		};
		
		//확장자 찾기
		for(String s:data) {
			String ss=s.substring(s.lastIndexOf('.')+1);
//			System.out.println(ss);
			if(ss.equals("java")) {
				System.out.println(s);
			}
		}
		
		for(String s:data) {
			String ss=s.substring(s.lastIndexOf('.')+1);
			if(ss.equals("png") || ss.equals("jpg") || ss.equals("gif")) {
				System.out.println(s);
			}
		}*/
		
		// 컴파일러에 알려만 준다 => 통과 요청 => CheckedException
		// 에러시 복구가 어렵다, 예외회피, 예외선언 => throws
		// => 소스코딩을 자유롭게 한다
		// 에러 발생 시 복구 => try~catch
		try {
			FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
