// 숫자 야구 게임
/*
 		1. 컴퓨터가 임의로 난수 발생 => 배열
 		2. 사용자가 입력
 		3. 힌트
 		4. 종료여부 확인
 		5. 조립
 */
import java.util.Scanner;

public class 메소드_3 {
	public static void main(String[] args) {
		// 컴퓨터가 임의로 난수 발생
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		// 사용자 입력
		int[] user=new int[3];
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력:");
			int input=sc.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다");
				continue;
				// for문(증가식으로 이동), while문(조건식으로 이동)
				// 처음부터 실행 => while
				// 특정부분 제외 => for
			}
			// 배열에 입력 숫자를 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 업습니다");
				continue;
			}
			
			// 힌트 제공
			int s=0,b=0;
			for(int i=0;i<3;i++) { // com
				for(int j=0;j<3;j++) { // user
					if(com[i]==user[j]) { // 같은 수가 있는지 확인
						if(i==j) {
							s++; // 동일한 위치
						}else {
							b++; // 다른 위치
						}
					}
				}
			}
			
			// 힌트 출력
			System.out.printf("Input Number:%d, Result:%dS-%dB\n",input,s,b);
			
			// 종료여부 확인
			if(s==3) {
				System.out.println("Game Over!!");
				break;
			}
		}
	}
}
