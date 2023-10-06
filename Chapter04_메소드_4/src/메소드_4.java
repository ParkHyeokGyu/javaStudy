/*
 		절차적 언어 ======= 구조적 프로그램 ======= 객체지향 프로그램
 						 => 메소드			=> 메소드
 						 => 지역변수			=> 전역변수
 		
 		달력만들기
 		1. 년도,월을 사용자로부터 입력을 받는다
 		2. 전년도까지의 총날수(1년 1월 1일~)
 		3. 전달까지의 총날수
 		   ------------ +1(요청한 달의 1일자를 구한다)
 		4. 총날수%7 => 요일
 		5. 달력 출력
 		6. 조립
 */
import java.util.Scanner;

public class 메소드_4 {
	public static void main(String[] args) {
		// 년도,월을 사용자로부터 입력을 받는다
		Scanner sc=new Scanner(System.in);
		
		System.out.print("년도 입력:");
		int year=sc.nextInt();
		System.out.print("월 입력:");
		int month=sc.nextInt();
		
		// 전년도까지의 총날수(1년 1월 1일~)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		// 전달까지의 총날수
		int[] lastday= {
			31,28,31,30,31,30,
			31,31,30,31,30,31
		};
		if((year%4==0 && year%100!=0) || year%400==0)
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		// 요청한 달의 1일자를 구한다
		total++;
		
		// 총날수%7 => 요일
		int week=total%7;
		
		// 달력 출력
		String[] strWeek= {
			"일","월","화","수","목","금","토"	
		};
		
		System.out.println(year+"년도 "+month+"월 ");
		System.out.println();
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
		for(int i=1;i<lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t",i);
			week++;
			if(week>6) {
				System.out.println();
				week=0;
			}
		}
	}
}
