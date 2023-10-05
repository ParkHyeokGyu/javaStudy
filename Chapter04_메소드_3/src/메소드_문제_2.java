// 정수 1개 입력 => 3의 배수 여부 확인

import java.util.Scanner;

public class 메소드_문제_2 {
//	static int userInput() {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int n=sc.nextInt();
//		return n;
//	}
	static String check(int n) {
		String s="";
		if(n%3==0 && n!=0)
			s=n+"는 3의 배수입니다";
		else
			s=n+"는 3의 배수가 아닙니다";
		return s;
	}
	static void print(String s) {
		System.out.println(s);
	}
	static void process() {
		int n=메소드_문제_1.userInput();
		String s=check(n);
		print(s);
	}
	public static void main(String[] args) {
		process();
	}
}
