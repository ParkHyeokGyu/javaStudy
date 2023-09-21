// do~while
// updown game => 단점

import java.util.Scanner;

public class 제어문_반복문4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		int user=0;
		int cnt=1;
		do {
			System.out.println(cnt+"번째 게임");
			System.out.print("입력:");
			user=sc.nextInt();
			if(user<com) {
				System.out.println("up");
			}else if(user>com) {
				System.out.println("down");
			}else {
//				break;
				System.exit(0);
			}
			cnt++;
		}while(true);
	}
}
