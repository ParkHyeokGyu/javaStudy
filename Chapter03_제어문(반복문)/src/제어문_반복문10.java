import java.util.Scanner;
// 사용자가 정수 1개 입력 => 입력받은 수까지의 합을 출력
public class 제어문_반복문10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
			sum+=i;
		
		System.out.println("1부터 "+num+"까지의 합:"+sum);
	}
}
