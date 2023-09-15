/*
 *	변수 => 저장(데이터)
	연산자 => 결과값,사용처,형식
	제어문 => 흐름(동작),사용처,형식
	
	제어문의 종류
	* 제어문은 무저건 1개의 문장만 수행할 수 있다
		if(조건문)
			문장1 => 제어
			문장2 => 일반문장 ({}으로 묶지 않아, 수행(X))
			
		조건문
			단일조건문
				if(조건문){ => 조건문(비교연산자,논리연산자,부정연산자)
					조건문이 true일 경우에 수행할 문장
				}
				
				단점은 속도가 느리다(단일 조건문 여러개 사용시) => 독립문장이기 때문이다
				중복이 있는 경우에 사용
			선택조건문
				true와 false를 나눠서 작업
				
				if(조건문){
					조건문이 true일 경우에 수행할 문장
				}else{
					조건문이 false일 경우에 수행할 문장
				}
			다중조건문
				한번만 수행할 때 주로 사용
				
				if(조건문){
					조건문이 true일 경우에 수행할 문장 => 수행 후 if문 종료
					false일 경우, 아래의 조건문 수행
				}else if(조건문){
					
				}else if(조건문){
					
				}else{ => 생략가능
					위의 조건들에 부합하지 않는 경우 수행할 문장
				}
				
				예)
				int score=80;
				if(score>=90)
					A
				if(score>=80)
					B
				if(score>=70)
					C
				if(score>=60)
					D	=> 단일조건문 주의사항, 다중 조건문을 사용하여 한번만 수행하게끔 해야한다
				if(score<60)
					F
					
				int a=15; => 3, 5의 배수
				if(a%3==0) => 3의 배수만 처리하고 if문을 종료한다
				else if(a%5==0) => 5의 배수 조건문은 수행하지 않는다
				else if(a%7==0)
		선택문
		반복문
		반복제어문
 */
// 정수 1개를 입력받아 짝수/홀수

import java.util.Scanner;

public class 제어문의종류 {
	public static void main(String[] args) {
		// Scanner는 클래스 => 키보드로 입력해 저장, 엔터 시 메모리에 저장
		// 정수 : nextInt(), 문자열 : next(), 실수 : nextDouble(), 논리 : nextBoolean()
		// 문자는 없다 => next()로 문자열을 받아 String 메소드 charat(0)를 사용하여 첫자를 가져온다
		// 클래스를 저장시 new 사용
		Scanner sc=new Scanner(System.in);
		// System.in / System.out => 자바 표준 입출력
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("짝수");
		if(num%2!=0)
			System.out.println("홀수");
	}
}
