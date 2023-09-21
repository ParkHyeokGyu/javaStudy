import java.util.Scanner;

public class 제어문_반복제어문3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴 선택:");
			int menu=sc.nextInt();
			if(menu<1||menu>9) {
				System.out.println("없는 메뉴입니다");
				continue;
			}
			if(menu==9) {
				//System.exit(0); => 시스템이 종료되기 때문에 while문 바깥 문장은 수행하지 못한다
				break;
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다");
		}
		
		System.out.println("프로그램 종료");
	}
}
