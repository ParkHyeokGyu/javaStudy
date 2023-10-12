package com.sist.manager;
// 같은 패키지상에 있는 경우 => default/protected/public 접근 가능
// import를 사용하지 않아도된다

import java.util.Scanner;
/*
 	캡슐화 / 오버라이딩 / 상속 / 포함
 	
 */
public class StudentSystem {
	public Student[] students=new Student[3];
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			
			students[i]=new Student();
			System.out.print((i+1)+"번째 학번 입력:");
			students[i].hakbun=sc.nextInt();
			System.out.print((i+1)+"번째 이름 입력:");
			students[i].name=sc.next();
			System.out.print((i+1)+"번째 국어 입력:");
			students[i].kor=sc.nextInt();
			System.out.print((i+1)+"번째 영어 입력:");
			students[i].eng=sc.nextInt();
			System.out.print((i+1)+"번째 수학 입력:");
			students[i].math=sc.nextInt();
		}
	}
	
	public void output() {
		for(int i=0;i<students.length;i++) {
			System.out.println("학번:"+students[i].hakbun);
			System.out.println("이름:"+students[i].hakbun);
			System.out.println("국어:"+students[i].hakbun);
			System.out.println("영어:"+students[i].hakbun);
			System.out.println("수학:"+students[i].hakbun);
		}
	}
}
