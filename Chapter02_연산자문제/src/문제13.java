import java.util.Scanner;

public class 문제13 {
	public static void main(String[] args) {
		/*
		 *	사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해 보 자. 
		 *	예를 들어 사용자로부터 순서대로 입력받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출혁해야 한다. 
		 *	단 출력 양식은 다음과 같아야 한다.
		 */
		Scanner sc=new Scanner(System.in);
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
//		int c=(int)(Math.random()*100)+1;
		
		System.out.print("세개 정수 입력:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("a:"+a+",b:"+b+",c:"+c);
		System.out.println("a*b+c:"+(a*b+c));
	}
}
