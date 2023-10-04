// 알파벳을 입력받아서 대문자,소문자 판별
// 메소드 1개(입력 받아 처리), 2개(입력,처리)

import java.util.Scanner;

public class 메소드_6 {
	static char alphaInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		return sc.next().charAt(0);
		// 자바 단점 => char를 받아서 처리하는 기능이 없다
		// String으로 받아서 char를 분리
	}
	static void result(char c) {
		// 결과값을 넘겨주지 않고 자체 처리 => void
		if(c>='A'&&c<='Z') {
			System.out.println(c+"는 대문자");
		}else if(c>='a'&&c<='z') {
			System.out.println(c+"는 소문자");
		}else {
			System.out.println(c+"는 앞파벳이 아닙니다");
		}
	}
	static void process() {
		char alpha=alphaInput();
		result(alpha);
	}
	public static void main(String[] args) {
		process();
	}
}
