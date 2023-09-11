/*
 * 자바언어의 특징
 * 	1. 실행방법
 * 		컴파일 방식 => 2진파일로 변경(컴퓨터가 인식하는 언어), C/C++, Java(기계어)
 * 			* 자바의 특징
 * 				C/C++
 * 					컴파일 시 운영체제마다 다른 컴파일을 한다
 * 					컴파일된 내용이 다르다
 * 				Java
 * 					운영체제마다 동일
 * 					컴파일된 파일 : 바이너리 코드
 * 					One Write
 * 
 * 		인터프리터 방식 => 한 줄씩 번역하여 실행, HTML/CSS
 * 
 * 		Java가 보안이 뛰어난 이유 : 컴파일과 인터프리터 방식을 두가지 모두 사용
 * 
 * 			자바소스
 * 		  	  ㅣ
 * 		 	 JVM(자바가상머신) => 파일(dll)
 * 		  	  ㅣ
 * 	  	  ㅡㅡㅡㅡㅡㅡㅡ
 *   	 ㅣ   ㅣ    ㅣ
 *     리눅스 윈도우   맥
 *     
 *	2. 실행과정
 *				 기계어로 변경(javac)			    한줄씩 번역(java)
 *		A.java ==================== A.class ==================== Hello
 *    프로그래머 코딩		ㅣ	       바이너리 코드          ㅣ	
 *   				   컴파일						   인터프리터
 *   
 *   	편집기 : 이클리스, 인텔리J
 *   
 * 	3. 개발환경 구축
 * 		JDK : 17(17이상의 버전은 한글이 깨짐)
 *  	스프링 : 14(편집기 : sts(스프링툴))
 *   	환경변수설정
 *			path : C:\jdk-17.0.2\bin
 *   		classpath : .;C:\jdk-17.0.2\lib
 *  
 *  	이클립스로 파일 생성
 *  		프로젝트 폴더 만들기
 *  		src => 자바파일 생성(class파일 생성)
 *  			주의점
 *  				파일명과 클래스명이 반드시 동일해야 사용이 가능
 *  				대소문자를 구분한다
 *  				클래스명은 첫자를 대문자, 새로운 단어가 결합할 때 첫자를 대문자
 *  				변수, 메소드는 소문자로, 상수는 대문자로 작성
 *  				{}, ;
 *  				모든 자바파일은 main이 필수
 *  				주석 (번역X) : //(한줄주석), /*(여러줄주석)
 *  							ctrl+/	    ctrl+shift+/
 *  
 *  System.out.println(); => sysout + (crtl+space)
 *  
 *  4. 자바의 구성도
 *  	class A => class 시작
 *  	{
 *  		public static void main(String[] args) => main 시작
 *  		{
 *  			System.out.println("Hello"); => 화면 출력
 *  		} => main 종료
 *  	} => class 종료
 *   
 */

public class 자바언어_실행방법 {
	
	public static void main(String[] args) {
		System.out.println("Hello Java!!");
	}

}
