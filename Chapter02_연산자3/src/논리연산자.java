/*
 *	&&, || => 범위가 있는 경우
 *	ㅣ	ㅣ
 *	포함	미포함
 *
 *	형식
 *		(조건) && (조건) => 조건을 사용하는 연산자(부정연산자,비교연산자)
 *		-----	-----
 *		true	true => true
 *		true	false => false
 *		false	true => false
 *		false	false => false
 *
 *		(조건) || (조건) => 조건을 사용하는 연산자(부정연산자,비교연산자)
 *		-----	-----
 *		true	true => true
 *		true	false => true
 *		false	true => true
 *		false	false => false
 */

/*
 *	1~12 입력
 *	12,1,2 => 겨울
 *	3,4,5 => 봄
 *	6,7,8 => 여름
 *	9,10,11 => 가을
 */

import java.util.Scanner;

public class 논리연산자 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("월 입력:");
		int month=sc.nextInt();
		
		System.out.print(month+"월은 ");
		System.out.print(month>=3&&month<=5?"봄":"");
		System.out.print(month>=6&&month<=8?"여름":"");
		System.out.print(month>=9&&month<=11?"가을":"");
		System.out.print(month==12||month==1||month==2?"겨을":"");
	}
}
