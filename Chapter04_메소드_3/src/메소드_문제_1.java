// 정수 한개를 입력받아 짝수,홀수 여부 출력

import java.util.Scanner;

public class 메소드_문제_1 {
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int n=sc.nextInt();
		return n;
	}
//	static String a(int n) {
//		String s="짝수";
//		if(n%2!=0)
//			s="홀수";
//		return s;
//	}
	static String a(int n) {
		String s="";
		if(n%2==0)
			s=n+"는 짝수입니다";
		else
			s=n+"는 홀수입니다";
		return s;
	}
//	static void print(int n,String s) {
//		System.out.println(n+"는 "+s+"입니다");
//	}
	static void print(String s) {
		System.out.println(s);
	}
	static void process() {
		int n=userInput();
		String s=a(n);
		print(s);
	}
	public static void main(String[] args) {
		process();
	}
}
