/*
 	배열
 		묶어서 관리
 			변수 => 같은 유형의 변수가 3개 이상일때 => 변수명을 한개로 관리
 				같은데이터형
 				다른데이터형 => 클래스
					VO(Spring),DTO(MyBatis),Bean(JSP)
					
 			명령문 => 관련된 명령끼리 묶어서 구조적 프로그램
 					메소드
 		
		 	데이터 묶기(변수)
		 	명령문 묶기(명령문) => 소스코딩
		 			  ㅣ
		 			 입력
		 			 처리
		 			 출력
		
		장점
			여러개의 변수명을 한개로 합쳐서 사용
			데이터마다 구분 => 인덱스(순차적) => 반복문
		단점
			고정적이다 => 메모리 할당
			크기변경이 불가능하다 => 큰 배열을 생성
			같은 데이터형만 저장
	-----------------------------------------------
	1.배열선언
		데이터형[] 배열명; 자바(권장)
		데이터형 배열명[]; C
		
	2.초기화
		int[] arr={1,2,3,4,5} => 배열크기:5
			  --- 변수식별자와 동일
		int[] arr=new int[5];
				  ---------- 0으로 모두 초기화
				  
				스택		힙
				arr	ㅣ
				----ㅣ
				  	ㅣ
				----ㅣ
					ㅣ
	  arr=new int[5]ㅣ		104		108		112		116
					ㅣ	--------------------------------
					ㅣ	100	ㅣ	0	ㅣ	0	ㅣ	0	ㅣ200
					ㅣ	--------------------------------
					ㅣarr+0*4 => 100
					ㅣ	
						ㅣ
						arr[0]	arr[1]....arr[4]
						------------------------
							일반변수와 동일
				
	3.값 변경
		1번째 값 변경
		arr[0]=100;
		arr[4]=200;
		
	4.출력
		int[] arr
		for(int a:arr){ => 배열의 데이터형과 변수의 데이터형은 동일해야한다
			
		}
 */

import java.util.Scanner;
// 3명의 학생 국어,영어,수학,총점,평균
public class 배열_생성 {
	public static void main(String[] args) {
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int tot1,tot2,tot3;
		double avg1,avg2,avg3;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 학생의 국어 점수 입력:");
		kor1=sc.nextInt();
		System.out.print("첫번째 학생의 영어 점수 입력:");
		eng1=sc.nextInt();
		System.out.print("첫번째 학생의 수학 점수 입력:");
		math1=sc.nextInt();
		
		System.out.print("두번째 학생의 국어 점수 입력:");
		kor2=sc.nextInt();
		System.out.print("두번째 학생의 영어 점수 입력:");
		eng2=sc.nextInt();
		System.out.print("두번째 학생의 수학 점수 입력:");
		math2=sc.nextInt();
		
		System.out.print("세번째 학생의 국어 점수 입력:");
		kor3=sc.nextInt();
		System.out.print("세번째 학생의 영어 점수 입력:");
		eng3=sc.nextInt();
		System.out.print("세번째 학생의 수학 점수 입력:");
		math3=sc.nextInt();
		
		tot1=kor1+eng1+math1;
		tot2=kor2+eng2+math2;
		tot3=kor3+eng3+math3;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",
				kor1,eng1,math1,tot1,tot1/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",
				kor2,eng2,math2,tot2,tot2/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",
				kor3,eng3,math3,tot3,tot3/3.0);
	}
}
