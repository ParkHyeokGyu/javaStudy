package com.sist.main2;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("클래스 선택:");
		int select=sc.nextInt();
		// I i=new A();,new B();...
		// 데이터형을 동일하게 만든다
		I[] i= {new A(),new B(),new C(),new D(),new E()};
		i[select-1].execute();
//		if(select==1) {
//			A a=new A();
//			a.execute();
//		}
//		if(select==2) {
//			B a=new B();
//			a.execute();
//		}
//		if(select==3) {
//			C a=new C();
//			a.execute();
//		}
//		if(select==4) {
//			D a=new D();
//			a.execute();
//		}
//		if(select==5) {
//			E a=new E();
//			a.execute();
//		}
	}
}
