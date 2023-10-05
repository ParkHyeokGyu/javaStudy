/*
 		년도를 입력받아 윤년여부 확인		웹
 		1. 입력						회원가입에 필요한 데이터 입력
 									로그인(ID,PWD)
 		2. 윤년확인					오라클 연결해서 데이터 추가
 									로그인 여부 확인
 		3. 결과값 출력					로그인 이동
 									로그인(O):메인으로 이동, 로그인(X):다시 입력 요청
 									
 									브라우저 ===> 자바 ===> 오라클
 									------------------------ 라이브러리
 */

import java.util.Scanner;

public class 메소드_3 {
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=sc.nextInt();
		return year;
	}
	static boolean isYear(int year) {
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||year%400==0) {
			bCheck=true;
		}
		return bCheck;
	}
	static void print(boolean bCheck) {
		if(bCheck) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
	}
	static void process() {
		print(isYear(userInput()));
	}
	public static void main(String[] args) {
		process();
	}
}
