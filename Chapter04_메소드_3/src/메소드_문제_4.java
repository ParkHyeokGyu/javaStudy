// 알파벳을 입력받아 대문자,소문자,숫자,기타 출력

import java.util.Scanner;

public class 메소드_문제_4 {
	static char userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=sc.next().charAt(0);
		return c;
	}
	static String check(char c) {
		String res="";
		if(c>='A' && c<='Z')
			res=c+"는(은) 대문자입니다";
		else if(c>='a' && c<='z')
			res=c+"는(은) 소문자입니다";
		else if(c>='0' && c<='9')
			res=c+"는(은) 숫자입니다";
		else
			res=c+"는(은) 알파벳이나 숫자가 아닙니다";
		return res;
	}
	static void print(String res) {
		System.out.println(res);
	}
	static void process() {
		char c=userInput();
		String res=check(c);
		print(res);
	}
	public static void main(String[] args) {
		process();
	}
}
