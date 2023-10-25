package com.sist.student;
import java.util.*;
public class UserMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// 학생 관리 클래스
		StudentManager sm=new StudentManager();
		
		while(true) {
			System.out.println("=========== 메뉴 ===========");
			System.out.println("1.학생 목록");
			System.out.println("2.상세보기");
			System.out.println("3.추가하기");
			System.out.println("4.수정하기");
			System.out.println("5.삭제하기");
			System.out.println("6.검색하기");
			System.out.println("7.프로그램 종료");
			System.out.println("===========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==7) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}else if(menu==1) {
				// 학생 정보를 받아서 출력
				ArrayList<Student> list=sm.studentAllData();
				for(Student s:list) {
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}else if(menu==2) {
				System.out.print("학번 입력:");
				int hakbun=scan.nextInt();
				Student s=sm.studentDetailData(hakbun);
				System.out.println("학번:"+s.getHakbun());
				System.out.println("이름:"+s.getName());
				System.out.println("국어:"+s.getKor());
				System.out.println("영어:"+s.getEng());
				System.out.println("수학:"+s.getMath());
				System.out.println("총점:"+(s.getKor()+s.getEng()+s.getMath()));
				System.out.printf("평균:%.2f\n",((s.getKor()+s.getEng()+s.getMath())/3.0));
			}else if(menu==3) {
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.print("국어 입력:");
				int kor=scan.nextInt();
				System.out.print("영어 입력:");
				int eng=scan.nextInt();
				System.out.print("수학 입력:");
				int math=scan.nextInt();
				
				Student std=new Student(sm.hakbunMaxData(), name, kor, eng, math);
				sm.studentInsert(std);
			}else if(menu==4) {
				System.out.print("수정할 학번 입력:");
				int hakbun=scan.nextInt();
				System.out.print("이름 입력:");
				String name=scan.next();
				System.out.print("국어 입력:");
				int kor=scan.nextInt();
				System.out.print("영어 입력:");
				int eng=scan.nextInt();
				System.out.print("수학 입력:");
				int math=scan.nextInt();
				
				Student std=new Student(hakbun, name, kor, eng, math);
				sm.studentUpdate(std);
			}else if(menu==5) {
				System.out.print("삭제할 학번 입력:");
				int hakbun=scan.nextInt();
				sm.studentDelete(hakbun);
			}else if(menu==6) {
				System.out.print("이름 입력:");
				String name=scan.next();
				ArrayList<Student> list=sm.studentFindData(name);
				for(Student s:list) {
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}
		}
	}
}
