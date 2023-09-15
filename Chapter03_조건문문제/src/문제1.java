import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		//정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		if(num>=50)
			System.out.println(num+"은 50이상의 수");
		if(num<50)
			System.out.println(num+"은 50미만의 수");
	}
}
