// 국어,영어,수학 점수 입력 => 총점 평균 출력

import java.util.Scanner;

public class 메소드_문제_3 {
	static int userInput(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		int n=sc.nextInt();
		return n;
	}
	static int tot(int kor,int eng,int math) {
		return kor+eng+math;
	}
	static double avg(int tot) {
		return tot/3.0;
	}
	static char hak(int avg) {
		char c='A';
		switch (avg) {
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		return c;
	}
	static void print(int kor,int eng,int math,int tot,double avg) {
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
				kor,eng,math,tot,avg);
	}
	static void print(int kor,int eng,int math,int tot,double avg,char hak) {
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c\n",
				kor,eng,math,tot,avg,hak);
	}
	static void process() {
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int tot=tot(kor, eng, math);
		double avg=avg(tot);
		char hak=hak((int)(avg/10));
		print(kor, eng, math, tot, avg, hak);
	}
	public static void main(String[] args) {
		process();
	}
}
