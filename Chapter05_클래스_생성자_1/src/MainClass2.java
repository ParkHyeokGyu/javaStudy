import java.util.*;
class Student{
	// 멤버변수 => Heap => 프로그램 종료시까지 메모리 유지 => 다른 클래스에서 사용 가능
	String name;
	int kor,eng,math;
	Student(String name, int kor, int eng, int math) {
		// 매개변수 / 지역변수 => Stack
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 지역변수,매개변수 => 멤버변수순으로 찾는다
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Student[] std=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			System.out.print((i+1)+"번째 이름 입력:");
			String name=sc.next();
			System.out.print((i+1)+"번째 국어 입력:");
			int kor=sc.nextInt();
			System.out.print((i+1)+"번째 영어 입력:");
			int eng=sc.nextInt();
			System.out.print((i+1)+"번째 수학 입력:");
			int math=sc.nextInt();
			
			std[i]=new Student(name, kor, eng, math);
		}
		
		for(int i=0;i<std.length;i++) {
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",
					std[i].name,std[i].kor,std[i].eng,std[i].math,
					std[i].kor+std[i].eng+std[i].math,
					(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	}
}
