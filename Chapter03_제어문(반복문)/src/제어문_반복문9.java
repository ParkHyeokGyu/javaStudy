/*
	updown게임
		컴퓨터 난수 발생 : 1~100
		힌트 : up,down
		정답이 나올때까지 반복
			무한루프 : for(;;), while(true)
 */

import java.util.Scanner;
// import java.lang.* => 시스템에서 자동으로 추가 => System,Math,String....
public class 제어문_반복문9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		int user=0;
		int count=0;
		
		for(;;) {
			System.out.print("입력:");
			user=sc.nextInt();
			if(user<1||user>100) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			count++;
			if(user==com) {
				System.out.println("정답");
				System.out.println("입력횟수 :"+count);
//				break;
				System.exit(0);
			}else if(user<com)
				System.out.println("up");
			else
				System.out.println("down");
		}
	}
}
