package com.sist.main;
class Member{
	// 변수 은닉화
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		Member m=new Member();
		m.setAge(10); // m.age
		m.setName("홍길동");// m.name
		System.out.println(m.getAge());
		System.out.println(m.getName());
	}
}
