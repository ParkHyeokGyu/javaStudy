/*
 		1. 문자열을 입력 받아서 대문자 => 소문자, 소문자 => 대문자
 		2. 문자열을 입력 받아서 반대로 출력
 */

import java.util.Scanner;

public class 메소드_2 {
	// 문자열을 입력받는 기능 : 리턴형 => String, 매개변수(X)
	static String userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return sc.nextLine();
		// next() : 엔터시에 메모리에 저장 => 문자열 인식(공백전까지)
		// aaa aaa => aaa
		// nextLine() : 엔터시에 메모리에 저장(공백포함)
		// aaa aaa => aaa aaa
	}
	// 대문자 => 소문자, 소문자 => 대문자
	// 리턴형 / 매개변수(String)
	// => 메소드 안에서 처리
	static void alphaChange(String msg) {
		String result="";
		for(int i=0;i<msg.length();i++) {
			char c=msg.charAt(i);
			if(c>='A'&&c<='Z') {
				//result+=(char)(c+32);
				result+=String.valueOf(c).toLowerCase();
			}else if(c>='a'&&c<='z') {
				//result+=(char)(c-32);
				result+=String.valueOf(c).toUpperCase();
			}else {
				result+=c;
			}
		}
		System.out.println("결과값:"+result);
	}
	// 반대로 출력
	// => 결과값을 받아 출력
	static String alphaReverse(String msg) {
		String result="";
		for(int i=msg.length()-1;i>=0;i--) {
			result+=msg.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		String msg=userInput();
		System.out.println("msg:"+msg);
		alphaChange(msg);
		String resverse=alphaReverse(msg);
		System.out.println("결과값:"+resverse);
	}
}
