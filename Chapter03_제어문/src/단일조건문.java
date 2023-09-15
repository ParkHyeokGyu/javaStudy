/*
	if(조건문){ => 반드시 true나 false
		조건문이 true일때 수행 가능
	}
	
	두 개의 정수, 연산자(+,-,*,/)
 */

import java.util.Scanner;

public class 단일조건문 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		char op;
		System.out.print("첫번째 정수 입력:");
		num1=sc.nextInt();
		System.out.print("두번째 정수 입력:");
		num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		op=sc.next().charAt(0);
		
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		if(op=='/') {
			// 중첩조건문
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			if(num2!=0)
				System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		if(!(op=='+'||op=='-'||op=='*'||op=='/'))
			System.out.println("잘못된 연산자 입니다");
	}
}
