import java.util.*;

public class 배열_2 {
	public static void main(String[] args) {
		int year,month;
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=sc.nextInt();
		System.out.print("월 입력:");
		month=sc.nextInt();
		
		// 라이브러리 이용(API)
		Calendar cal=Calendar.getInstance();
		// 클래스 저장 => 싱글톤
		// 세팅 => year,month,day
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		week=week-1;
		int lastday=cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막 날짜
		
//		System.out.println(year+"년도 "+month+"월 1일자는 "+strWeek[week]+"요일입니다");
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strWeek.length;i++) {
			System.out.printf("%2c\t",strWeek[i]);
		}
		System.out.println();
		for(int i=1;i<=lastday;i++) {
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
}
