import java.util.Scanner;

public class 문제12 {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
		Scanner sc=new Scanner(System.in);
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
		
//		System.out.print("첫번쨰 정수 입력:");
//		int a=sc.nextInt();
//		System.out.print("두번쨰 정수 입력:");
//		int b=sc.nextInt();
		
		System.out.print("정수 두개 입력(10 20):");
		int a=sc.nextInt();
		int b=sc.nextInt();
				
		System.out.println("a:"+a+",b:"+b);
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+(a*b));
	}
}
