import java.util.Scanner;
// equals (==)
// 주소값을 비교한다
public class 문자열8 {
	public static void main(String[] args) {
		final String MID="admin",MPWD="1234";
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=sc.next();
		System.out.print("비밀번호 입력:");
		String pwd=sc.next();
		// equals() => 대소문자 구분
		// equalsIgnoreCase() => 대소문자 구분(X)
		if(id.equalsIgnoreCase(MID)&&pwd.equals(MPWD)) {
			System.out.println(id+"님 로그인되었습니다");
		}else {
			System.out.println("ID나 Password가 틀립니다");
		}
	}
}
