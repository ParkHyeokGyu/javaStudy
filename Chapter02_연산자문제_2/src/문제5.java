import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
		// 농구공 5개씩 한박스
		// 40개 = 8상자, 26개 = 6상자
		Scanner sc=new Scanner(System.in);
		System.out.print("농구공 갯수 : ");
		int ball=sc.nextInt();
		int box=ball/5;
		System.out.println("필요한 상자의 수 : "+(ball%5>0?box+1:box));
		System.out.println("필요한 상자의 수 : "+(int)(Math.ceil(ball/5.0))); // 올림함수
	}
}
