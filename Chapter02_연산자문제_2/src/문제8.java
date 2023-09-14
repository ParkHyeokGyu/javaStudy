import java.util.Scanner;

public class 문제8 {
	public static void main(String[] args) {
		// 윤년여부
		// 4년마다 한번씩, 100년마다 제외, 400년마다 한번씩
		Scanner sc=new Scanner(System.in);
		System.out.print("년 입력:");
		int year=sc.nextInt();
		System.out.println(
				(year%4==0 && year%100!=0) || year%400==0
				?year+"년은 윤년이다":year+"년은 윤년이 아니다"
		);
	}
}
