import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
		// 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println(num+"은 양수");
		if(num<0)
			System.out.println(num+"은 음수");
	}
}
