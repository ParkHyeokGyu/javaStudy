import java.util.*;

public class 배열_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=sc.nextInt();
		System.out.print("월 입력:");
		int month=sc.nextInt();
		System.out.print("일 입력:");
		int day=sc.nextInt();
		
		// 메모리에 할당 => 싱글톤(한개만 생성)
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // mont는 0부터
		cal.set(Calendar.DATE, day);
		
		char[] strWeek={'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도"+month+"월 "+day+"일은 "+strWeek[week-1]+"요일입니다");
	}
}
