import java.util.*;
public class MainClass2 {
	static int[] lastday= {
		31,28,31,30,31,30,
		31,31,30,31,30,31
	};
	static String[] strWeek= {
		"일","월","화","수","목","금","토"	
	};
	static int year,month,week;
	// 클래스안에 있는 모든 메소드에서 사용이 가능
	// 년도,월 입력
	static void userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=sc.nextInt();
		System.out.print("월 입력:");
		month=sc.nextInt();
	}
	// 요일 구하기
	static void dayTotal() {
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			// 윤년이라면
			lastday[1]=29;
		}else {
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		// +1
		total++;
		// 요일 구하기
		week=total%7;
	}
	static void print() {
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strWeek.length;i++) {
			System.out.printf("%2s\t",strWeek[i]);
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		userInput();
		dayTotal();
		print();
	}
}
