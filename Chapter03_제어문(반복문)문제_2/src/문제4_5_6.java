import java.util.Scanner;

public class 문제4_5_6 {
	public static void main(String[] args) {
//		4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
		char ch='9';
		if(ch>='0'&&ch<='9') {
			System.out.println(ch+"는 숫자('0' ~ '9')이다");
		}
//		5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
//	    출력하는 프로그램을 작성하시오
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.printf("%d + %d = %d\n",i,j,i+j);
				}
			}
		}
//		6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
//		   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
		Scanner sc=new Scanner(System.in);
		System.out.print("시작:");
		int num1=sc.nextInt();
		System.out.print("끝:");
		int num2=sc.nextInt();
		int sum=1;
		for(int i=num1;i<=num2;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
