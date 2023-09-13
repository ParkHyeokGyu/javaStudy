import java.util.Scanner;

public class 문제14 {
	public static void main(String[] args) {
		// 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
		Scanner sc=new Scanner(System.in);
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
		
		System.out.print("정수 두개 입력:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a%b:"+(a%b));
	}
}
