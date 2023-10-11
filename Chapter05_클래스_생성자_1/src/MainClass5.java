import java.util.*;
class Join{
	int mno;
	String name;
	String address;
	String phone;

	Join(int mno, String name, String address, String phone) {
		this.mno = mno;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}
class JoinSystem{
	// 객체 생성시마다 따로 메모리에 저장된다
//	Join[] member=new Join[5];
	// 객체 생성시마다 동일한 메모리 사용
	static Join[] member=new Join[5];
}
public class MainClass5 {
	public static void main(String[] args) {
		JoinSystem js1=new JoinSystem();
		Join j=new Join(1, "홍길동", "서울", "010-1111-1111");
		js1.member[0]=j;
		
		for(int i=0;i<js1.member.length;i++) {
			if(js1.member[i]!=null) {
				System.out.println(js1.member[i].name);
			}
		}
		System.out.println("---------------------");
		JoinSystem js2=new JoinSystem();
		Join j1=new Join(2, "심청이", "경기", "010-2222-2222");
		js2.member[1]=j1;
		
		for(int i=0;i<js2.member.length;i++) {
			if(js2.member[i]!=null) {
				System.out.println(js2.member[i].name);
			}
		}
	}
}
