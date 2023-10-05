// UpDown게임

import java.util.Scanner;

public class 메소드_문제_6 {
	static int getRand() {
		return (int)(Math.random()*100)+1;
	}
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력(1~100):");
		int user=sc.nextInt();
		return user;
	}
	static String calc(int com,int user) {
		String res="";
		if(com>user) {
			res="입력된 값보다 큰 수를 입력하세요";
		}else if(com<user) {
			res="입력된 값보다 작은 수를 입력하세요";
		}else {
			res="Game Over!!";
		}
		return res;
	}
	static void process() {
		int com=getRand();
		Scanner sc=new Scanner(System.in);
		while(true) {
			int user=userInput();
			String res=calc(com, user);
			System.out.println(res);
			if(res.equals("Game Over!!")) {
				System.out.print("게임을 다시 할까요?(y|n):");
				char c=sc.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("새로운 게임을 시작합니다");
					process();
				}else {
					System.out.println("게임 종료");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// 컴퓨터 임의의 숫자 추출
//		int com=(int)(Math.random()*100)+1;
//		
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.print("정수 입력(1~100):");
//			int user=sc.nextInt();
//			
//			if(com>user) {
//				System.out.println("입력된 값보다 큰 수를 입력하세요");
//			}else if(com<user) {
//				System.out.println("입력된 값보다 작은 수를 입력하세요");
//			}else {
//				System.out.println("Game Over!!");
//				break;
//			}
//		}
		process();
	}
}
