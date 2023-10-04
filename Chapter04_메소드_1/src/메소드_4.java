/*
 		리턴형(처리 결과값 => 반드시 한개만 사용 가능) => 여러개일때 배열
 		1) 로그인 요청
 		   --------
 		   boolean => 경우의 수가 두개일때
 		   경우의 수가 3개인 경우 => id,pwd,login => String,int
 		2) 기본형 => int,long,double
 		3) 영화 정보 요청 => class
 		4) 정렬 => 10 40 50 20 30 => 배열
 		
 		예) 정수 => 사칙연산
 		    +	int plus(int,int)
 		    -	int minus(int,int)
 		    *	int gop(int,int)
 		    /	String div(int,int) => 예상 결과값(int,double,String)
 */
/*
  		1. 기능별로 나눠서 처리(한가지 기능만 수행)
  			예)
  				사람 <===> 자판기
  				--- 행위자(액터) => 유스케이스 다이어그램
  		2. 반복이 있는 경우
  		3. 다른 클래스와 연결
 */
// 연산
// 1. 정수 1개를 입력 받아 구구단 출력
import java.util.Scanner;
public class 메소드_4 {
	public static void main(String[] args) {
		// 절차적 언어 => 순서대로 코딩 => 재사용을 할 수 없다
		Scanner sc=new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		int dan=sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		}
	}
}
