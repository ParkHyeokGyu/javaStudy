import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
//		1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		System.out.println(num>0?"양수":"음수");
	}
}
