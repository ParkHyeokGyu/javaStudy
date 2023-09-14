// 증감연산자,부정연산자,형변환연산자

import java.util.Scanner;
// 한 개의 정수를 입력 받아 1을 증가한 값을 출력
public class 단항연산자 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int a=sc.nextInt();
////		++a;
////		a++;
////		a+=10;
//		int b=a++;
//		System.out.println(a);
//		System.out.println(b);
		
		boolean bCheck=true;
		System.out.println(bCheck);
		bCheck=!bCheck;
		System.out.println(bCheck);
		
		boolean aa=true;
		while(true) {
			aa=!aa;
			if(aa==true) {
				System.out.println("사용자");
			}else {
				System.out.println("컴퓨터");
			}
		}
	}
}
