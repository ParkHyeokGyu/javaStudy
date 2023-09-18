import java.util.Scanner;

public class 문제2 {
	public static void main(String[] args) {
//		2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		if(num%3==0)
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수가 아니다");
	}
}
