//	while => 메뉴

import java.util.Scanner;

public class 제어문_반복문3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) { // 무한루프(while이 가장 많이 사용)
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 가수 찾기");
			System.out.println("3. 노래 찾기");
			System.out.println("4. 상세보기");
			System.out.println("5. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=sc.nextInt();
			if(menu==5) {
				System.exit(0); // 프로그램 정상 종료(0)
			}
		}
	}
}
