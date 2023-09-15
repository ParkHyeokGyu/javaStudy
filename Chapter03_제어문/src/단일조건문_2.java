/*
 * 정수를 1개 입력받는다
 * >>11
 * 같은 숫자입니다
 * >>88
 * >>77
 * 같은 숫자입니다
 */

import java.util.Scanner;

public class 단일조건문_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력(1~99):");
		int num=sc.nextInt();
		if(num>=1&&num<99) {
			int a=num/10;
			int b=num%10;
			if(a==b)
				System.out.println("같은 숫자입니다");
			if(a!=b)
				System.out.println("다른 숫자입니다");
		}
		if(num<1||num>99)
			System.out.println("잘못된 입력값입니다");
	}
}
