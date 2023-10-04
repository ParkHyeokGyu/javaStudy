// 로그인 처리
// 사용자로부터 받는 값 => id,pwd
// 로그인 여부 확인 => void(해당 메소드에서 처리), 결과값을 받을 경우
// => 결과값을 받아서 처리 : boolean,int(0,1),String
import java.util.Scanner;

public class 메소드_7 {
	static String userInput(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return sc.next();
	}
	static boolean isLogin(String id,String pwd) {
		final String ID="admin";
		final String PWD="1234";
		boolean bCheck=false;
		if(id.equals(ID)&&pwd.equals(PWD)) {
			bCheck=true;
		}
		return bCheck;
	}
	static void process() {
		String id=userInput("아이디");
		String pwd=userInput("비밀번호");
		boolean bCheck=isLogin(id, pwd);
		// boolean => bXxx
		// isXxx() => 리턴형 boolean
		if(bCheck) {
			System.out.println("메인화면으로 이동...(response.sendRedirect('main.jsp'))");
		}else {
			System.out.println("ID나 비밀번호가 틀립니다(history.back())");
		}
	}
	public static void main(String[] args) {
		process();
	}
}
