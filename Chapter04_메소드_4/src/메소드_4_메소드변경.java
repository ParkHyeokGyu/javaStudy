import java.util.Scanner;

public class 메소드_4_메소드변경 {
	static int input(String msg) {
		// 년도,월을 사용자로부터 입력을 받는다
		Scanner sc=new Scanner(System.in);
		
		System.out.print(msg+" 입력:");
		return sc.nextInt();
	}
	// 윤년 처리
	static int[] lastday(int year) {
		int[] lastday= {
			31,28,31,30,31,30,
			31,31,30,31,30,31
		};
		if((year%4==0 && year%100!=0) || year%400==0)
			lastday[1]=29;
		else
			lastday[1]=28;
		return lastday;
	}
	static int getWeek(int year,int month,int[] lastday) {
		// 전년도까지의 총날수(1년 1월 1일~)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		// 전달까지의 총날수
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		// 요청한 달의 1일자를 구한다
		total++;
		
		// 총날수%7 => 요일
		int week=total%7;
		return week;
	}
	static void print(int year,int month,int week,int[] lastday) {
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
	static void process() {
		int year=input("년도");
		int month=input("월");
		int[] lastday=lastday(year);
		int week=getWeek(year, month, lastday);
		print(year, month, week, lastday);
	}
	public static void main(String[] args) {
		process();
	}
}
