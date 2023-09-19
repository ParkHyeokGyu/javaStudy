// 정수 1개를 받아서 해당 구구단 출력

import java.util.Scanner;

public class 제어문_반복문3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dan;
		System.out.print("단 입력:");
		dan=sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
		}
	}
}
