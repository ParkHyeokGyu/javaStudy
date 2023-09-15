/*
 * 3개의 정수 => 총점, 평균, 학점
 * A,B,C,D,F
 * A>=90 B>=80 C>=70 D>=60
 * 100~97 A+ 96~93 A0 92~90 A-
 */

import java.util.Scanner;

public class 단일조건문_5 {
	public static void main(String[] args) {
		System.out.println("\"홍길동\"");
		Scanner sc=new Scanner(System.in);
		int kor,eng,math;
		int tot;
		double avg;
		
		System.out.print("국어점수 입력:");
		kor=sc.nextInt();
		System.out.print("영어점수 입력:");
		eng=sc.nextInt();
		System.out.print("수학점수 입력:");
		math=sc.nextInt();
		
		tot=kor+eng+math;
		avg=tot/3.0;
		
		System.out.println("국어점수:"+kor+", 영어점수:"+eng+", 수학점수:"+math);
		System.out.printf("총점:%d, 평균:%.2f\n",tot,avg);
		
//		int temp=(int)avg/10;
//		
//		if(temp==10||temp==9) 
//			System.out.println("학점:A");
//		if(temp==8) 
//			System.out.println("학점:B");
//		if(temp==7) 
//			System.out.println("학점:C");
//		if(temp==6) 
//			System.out.println("학점:D");
//		if(temp<6) 
//			System.out.println("학점:F");
		
		char score='A';
		char op=' ';
		
		if(avg>=90&&avg<=100) {
			score='A';
			if(avg>=97)
				op='+';
			if(avg>=93&&avg<=96)
				op='0';
			if(avg>=90&&avg<=92)
				op='-';
		}
		if(avg>=80&&avg<90) {
			score='B';
			if(avg>=87)
				op='+';
			if(avg>=83&&avg<=86)
				op='0';
			if(avg>=80&&avg<=82)
				op='-';
		}
		if(avg>=70&&avg<80) {
			score='C';
			if(avg>=77)
				op='+';
			if(avg>=73&&avg<=76)
				op='0';
			if(avg>=70&&avg<=72)
				op='-';
		}
		if(avg>=60&&avg<70) {
			score='D';
			if(avg>=67)
				op='+';
			if(avg>=63&&avg<=66)
				op='0';
			if(avg>=60&&avg<=62)
				op='-';
		}
		if(avg<60)
			score='F';
		
		System.out.println("학점:"+score+op);
		
	}
}
