import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
		// 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값,합계와 평균을 구해보자.
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수 입력:");
		int kor=sc.nextInt();
		System.out.print("영어점수 입력:");
		int eng=sc.nextInt();
		System.out.print("수학점수 입력:");
		int math=sc.nextInt();
		int tot=kor+eng+math;
		double avg=tot/3.0;
		
		System.out.println("국어점수:"+kor+", 영어점수:"+eng+", 수학점수:"+math);
		
		int max=kor;
		if(max<eng)
			max=eng;
		if(max<math)
			max=math;
		
		int min=kor;
		if(min>eng)
			min=eng;
		if(min>math)
			min=math;
		
		System.out.printf("최대값:%d, 최소값:%d, 총점:%d, 평균:%.2f",max,min,tot,avg);
	}
}
