// if~else
/*
	예상되는 결과값이 두개로 나뉘어 나오는 경우
	단일조건문 => 여러개가 동시에 결과값이 있는 경우
	다중조건문 => 여러개중에 한개만 수행
 */
// 국어,영어,수학 => 평균,총점 => 평균이 60이상 60미만

import java.util.Scanner;

public class 제어문_조건문2_1 {
	public static void main(String[] args) {
		// 변수 선언
		int kor,eng,math,tot;
		double avg;
		// 초기화 => 명시적인 초기화,입력값을 받아서 저장,임의 발생
		/*
		 * int a=10
		 * Scanner
		 * random()
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수:");
		kor=sc.nextInt();
		System.out.print("영어점수:");
		eng=sc.nextInt();
		System.out.print("수학점수:");
		math=sc.nextInt();
		tot=kor+eng+math;
		avg=tot/3.0;
		
		System.out.println("======== 결과값 ========");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.2f\n",avg);
		
		if(avg>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		// 결과값 도출
	}
}
