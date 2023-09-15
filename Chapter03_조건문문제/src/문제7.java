import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        	작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        	나머지는 F)
		 */
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
		System.out.println("총점:"+tot+", 평균:"+avg);
		
		if(avg>=90)
			System.out.println("A");
		if(avg>=80&&avg<90)
			System.out.println("B");
		if(avg>=70&&avg<80)
			System.out.println("C");
		if(avg>=60&&avg<70)
			System.out.println("D");
		if(avg<60)
			System.out.println("F");
	}
}
