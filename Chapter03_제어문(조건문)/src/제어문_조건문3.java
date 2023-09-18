/*
	다중조건문 => 결과값이 1개만 도출
	형식
		if(조건문){
			조건이 true일 떄 => 수행 후 if문 종료
				  ㅣ
				  ㅣ false일 떄
		}else if(조건문){
			조건이 true일 떄 => 수행 후 if문 종료
				  ㅣ
				  ㅣ false일 떄
		}else if(조건문){
			조건이 true일 떄 => 수행 후 if문 종료
				  ㅣ
				  ㅣ false일 떄
		}
		...
		...
		else{ => 생략 가능, 위의 조건이 없는 경우에 처리
		
		}
		
		한개의 문장만 수행
 */
// 국어,영어,수학 점수를 입력받아 총점,평균,학점,합격여부

import java.util.Scanner;

public class 제어문_조건문3 {
	public static void main(String[] args) {
		// 데이터를 저장할 공간 => 변수
		int kor,eng,math,tot;
		double avg;
		char score=' '; // 명시적인 초기화
		// 입력값을 받는다
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수:");
		kor=sc.nextInt();
		System.out.print("영어점수:");
		eng=sc.nextInt();
		System.out.print("수학점수:");
		math=sc.nextInt();
		// 초기화
		tot=kor+eng+math;
		avg=tot/3.0;
		// 학점 => 평균 >=90 A, >=80 B, >=70 C, >=60 D, 60< F
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		// 결과값 출력 => 제어문,연산자 => dos,브라우저,모바일
	}
}
