package com.sist.main;

// 클래스가 다른 패키지에 있다면 import를 해줘야한다
import com.sist.manager.*;

public class MainClass {
	public static void main(String[] args) {
		StudentSystem system=new StudentSystem();
		system.input();
//		system.output();
		for(Student std:system.students) {
			System.out.println(std.hakbun);
			System.out.println(std.name);
			System.out.println(std.kor);
			System.out.println(std.eng);
			System.out.println(std.math);
		}
	}
}
