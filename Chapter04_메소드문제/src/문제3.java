import java.util.Scanner;

public class 문제3 {
//	년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
//	년도 입력 메소드
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		return sc.nextInt();
	}
//	윤년 처리
	static boolean a(int year) {
		boolean bCheck=false;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			bCheck=true;
		}
		return bCheck;
	}
//	출력 
	static void b() {
		int year=userInput();
		boolean bCheck=a(year);
		if(bCheck) {
			System.out.println(year+"년도는 윤년입니다");
		}else {
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
	}
	public static void main(String[] args) {
		b();
	}
}
