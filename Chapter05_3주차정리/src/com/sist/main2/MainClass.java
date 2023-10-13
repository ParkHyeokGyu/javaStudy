/*
 	static 메소드
 		static 변수,static 메소드 호출 가능
 		인스턴스 변수,인스턴스 메소드는 반드시 객체 생성 후 사용
 	인스턴스 메소드
 		인스턴스나 static 상관없이 사용 가능
 	
 	this
 		멤버변수와 지역변수의 구분
 		변수가 동일한 이름이면 지역변수가 우선순위를 가진다
 		지역변수나 매개변수에서 찾은 다음 없을 경우 멤버변수에서 찾는다
 		
 			class A{
 				int a=20;
 				
 				void display(){
 					int a=10; => 지역변수
 					System.out.println(this.a); => 멤버변수
 				}
 				
 				void display(int a){ => 매개변수 : 지역변수의 일종
 					Systemout.out.println(a);
 				}
 			}
 		
 		this : 객체
 		this() : 생성자(자신의 생성자를 호출할때 사용)
 				 셍성자에서 사용이 가능하다
 				 생성자 첫줄에 온다
 				 
 				 class A{
 				 	A(){}
 				 	A(int a){
 				 		this();
 				 		System.out.println():
 				 		this(); => 오류
 				 	}
 				 }
 				 
 								  
 */
package com.sist.main2;
class Student{
	int hakbun;
	String name;
	String sex;
	
	public Student() {
		System.out.println("디폴트 생성자 호출");
		// Student 객체가 가지고 있는 멤버변수
		hakbun=1; // this.hakbun=1; 
		name="홍길동"; // this.name="홍길동";
		sex="남자"; // this.sex="남자";
		// 지역변수와 충돌이 없는 경우에는 this 생략이 가능하다
	}
	
	public Student(int hakbun,String name) {
		// this구분자 : 멤버변수와 지역변수를 구분
		this.hakbun=hakbun;
		this.name=name;
	}
	
	public Student(String sex) {
		this();
		this.sex=sex;
	}
	
	public Student(int h,String n,String s) {
		this(s);
//		hakbun=h;
//		name=n;
//		sex=s;
	}
	
	public void print() {
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	// 오버로딩 : 같은 메소드명으로 새로운 기능을 만든다
	/*
	 	void display(int a,int b,int c)
	 	void display(char c,double d,int a)
	 	void display(double d,double d1,double d2)
	 	
	 	display(10.5,'A',100) => double,char,int
	 	
	 */
}
public class MainClass {
	void display(int a,int b,int c) {
		System.out.println("display(int a,int b,int c) Call");
	}
	void display(char c,double d,int a) {
		System.out.println("display(char c,double d,int a) Call");
	}
	void display(double d,double d1,double d2) {
		System.out.println("display(double d,double d1,double d2) Call");
	}
	void display(double d,int d1,int d2) {
		System.out.println("display(double d,int d1,int d2) Call");
	}
	void display(double d,char d1,int d2) {
		System.out.println("display(double d,char d1,int d2) Call");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.print();
		
		Student s2=new Student("여자");
		s2.print();
		
		Student s3=new Student(2, "박문수");
		s3.print();
		
		Student s4=new Student(3, "심청이", "여자");
		s4.print();
		
		MainClass m=new MainClass();
		m.display(10.5, 'A', 100);
	}
}
