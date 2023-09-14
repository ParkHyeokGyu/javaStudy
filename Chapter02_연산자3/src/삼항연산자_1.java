/*
 *	컴퓨터와 가위바위보
 *		0 => 가위
 *		1 => 바위
 *		2 => 보
 *	
 *		1. 컴퓨터 난수 발생
 *		2. 사용자 입력
 *		3. 컴퓨터와 사용자의 가위바위보 출력
 *		4. 결과값
 *
 *		컴퓨터	사용자
 *		가위(0)	가위(0)	S	0
				바위(1)	W	-1
				보(2)	L	-2
 *		바위(1)	가위(0)	L	1
				바위(1)	S	0
				보(2)	W	-1
 *		보(2)	가위(0)	W	2
				바위(1)	L	1
				보(2)	S	0
 */

import java.util.Scanner;

public class 삼항연산자_1 {
	public static void main(String[] args) {
		// 컴퓨터
		int com=(int)(Math.random()*3);
		// 사용자
		Scanner sc=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user=sc.nextInt();
		System.out.print("컴퓨터:");
		System.out.print(com==0?"가위":"");
		System.out.print(com==1?"바위":"");
		System.out.print(com==2?"보":"");
		System.out.println();
		System.out.print("플레이어:");
		System.out.print(user==0?"가위":"");
		System.out.print(user==1?"바위":"");
		System.out.print(user==2?"보":"");
		System.out.println();
		
		int result=com-user;
		System.out.println(result==0?"비겼습니다":(result==-1||result==2?"이겼습니다":"졌습니다"));
	}
}
