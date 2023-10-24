package com.sist.seoul;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1),자연(2):");
		int num=scan.nextInt();
		
		SeoulManager s=new SeoulManager();
		Seoul[] loc=s.seoulAllData(num);
		for(Seoul ss:loc) {
			System.out.println(ss.getNo()+"."+ss.getName());
		}
	}
}
