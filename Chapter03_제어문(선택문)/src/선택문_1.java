/*
	선택문은 범위가 지정되는 것이 아니다
		값 1개를 선택해서 사용
		
		switch(정수,문자,문자열){ => 실수(X)
			case 1:
				실행문장
				break; => 실행문장 수행 후 종료
			case 2:
				실행문자
				break; => 실행문장 수행 후 종료
			case 3:
				실행문장 => case 3을 수행 후 case 4 수행 후 종료
			case 4:
				실행문장
				break;
		}
		
		범위가 지정되면 다중조건문
		범위가 없이 값이 1개일때 switch~case(메뉴,키보드입력값,서버프로그램)
		
 */

import java.util.Scanner;

public class 선택문_1 {
	public static void main(String[] args) {
		// 3개의 정수 => 평균,총점,학점
		int kor,eng,math,tot,avg;
		double avg2;
		char score=' ';
		// switch => 실수는 사용할 수 없다 => 정수,문자,문자열만 가능
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 입력:");
		kor=sc.nextInt();
		System.out.print("영어 입력:");
		eng=sc.nextInt();
		System.out.print("수학 입력:");
		math=sc.nextInt();
		
		tot=kor+eng+math;
		avg2=tot/3.0;
		avg=(int)(avg2/10);
		// 10,9,8,7,6.....
		
		switch(avg) {
		case 10: // if(avg==10||avg==9) score='A';
		case 9:
			score='A';
			break; // 종료 명령
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("학점:"+score);
	}
}
