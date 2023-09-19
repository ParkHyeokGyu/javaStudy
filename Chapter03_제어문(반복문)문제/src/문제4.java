import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
//		4) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
			sum+=i;
		
		System.out.printf("1~%d까지의 합:%d",num,sum);
	}
}
