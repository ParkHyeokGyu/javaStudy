/*
 *	변수 초기화
 *		변수 추출
 *		변수 선언(데이터향)
 *		변수 초기화
 *			명시적인 초기화
 *				int a=10;
 *			입력값 받기
 *				Scanner => 키보드 입력값을 받을 때 사용
 *				BufferedReader => 예외처리가 필요
 *			임의값 받기
 *				랜덤
 *				크롤링
 */
import java.util.Scanner;
public class 변수의초기화 {

	public static void main(String[] args) {
//		int a=100;
//		int b=(int) (Math.random()*100)+1; // Math.Random => double형으로 0.0~0.99(1.0미만)까지
//		Scanner scan=new Scanner(System.in); // System.in => 키보드 입력값
//		
//		System.out.println("정수 입력:");
//		int c=scan.nextInt();
//		System.out.println(c);
		
		// a를 20,b를 10으로 바꾸려면
		int a=10;
		int b=20;
		int temp = a; // 임시 변수를 선언
		a=b; // a=20;
		b=temp; // b=10;
		
		System.out.println(a+","+b);
		
	}

}
