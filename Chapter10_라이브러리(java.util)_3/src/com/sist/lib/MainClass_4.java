package com.sist.lib;
import java.util.*;
/*
 	class A{
 		int a,b;
 		public void aaa(){}
 		public void bbb(){}
 	}
 	class B extends A{
 		int c;
 		public void ccc(){}
 		--------상속--------
 		int a,b;
 		public void aaa(){}
 		public void bbb(){}
 		-------------------
 	}
 	
 	B b=new B();
 	=> a,b,c,aaa(),bbb(),ccc() => B가 가지고 있는 변수와 메소드 사용
 	A a=new A();
 	=> a,b,aaa(),bbb() => A가 가지고 있는 변수와 메소드 사용
 	A b=new B(); => A가 가지고 있는 메소드를 오버라이딩 했다면 B의 메소드 사용
 	=> a,b,aaa(),bbb()
 */
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon(int sabun,String name,String dept) {
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	
	public void print() {
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
}
public class MainClass_4 {
	public static void main(String[] args) {
		// Object 대신 저장해야되는 데이터형을 설정 => 모든 매개변수,리턴형이 변경된다
		// 컬렉션은 제네릭 사용을 권장한다
		// 데이터 저장시에 동일한 데이터형만 저장이 가능하게 만들어준다
		// 분석이 쉬워진다 => 가독성이 높다 => 명시적
		// 제네릭 => 폴더별로 저장 => 찾기가 쉽다
		// 제네릭은 선언하면 다른 데이터형은 저장할 수 없다
		// 제네릭 => <클래스> => 기본형은 반드시 Wrapper
		// ArrayList<int> X => ArrayList<Integer>
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1, "홍길동1", "개발부"));
		list.add(new Sawon(2, "홍길동2", "영업부"));
		list.add(new Sawon(3, "홍길동3", "총무부"));
//		list.add("Hello"); // Sawon 클래스만 저장 가능
		
		for(int i=0;i<list.size();i++) {
//			Object obj=list.get(i); // Object로 받을시엔 Sawon의 메소드를 사용할 수 없다
//			obj.print(); // clone(),finalize(),toString()
//			Sawon obj=(Sawon)list.get(i); // 제네렉을 설정하지 않으면 형변환을 해야한다
//			obj.print();
			Sawon obj=list.get(i);
			obj.print();
		}
		// list => Object
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add("홍길동");
		list.add(4);
		list.add(5);
		
		for(int i=0;i<list.size();i++) {
			Object val=list.get(i);
			System.out.println(val);
		}*/
	}
}
