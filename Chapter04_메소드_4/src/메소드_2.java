// 리턴형O 매개변수X
// 아이디 찾기
import java.util.Scanner;

public class 메소드_2 {
	static String idInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 입력:");
		return sc.next();
	}
	// 아이디 중복 체크
	static boolean idCheck(String id) {
		boolean bCheck=false;
		String[] ids= {
			"hong","admin","lee","park","shim"
		};
		for(String i:ids) {
			if(id.equals(i)) {
				bCheck=true;
				break;
			}
		}
		return bCheck;
	}
	static void process() {
		String id=idInput();
		boolean bCheck=idCheck(id);
		
		if(bCheck) {
			System.out.println(id+"는 이미 사용중인 아이디입니다");
		}else {
			System.out.println(id+"는 사용가능한 아이디입니다");
		}
	}
	public static void main(String[] args) {
		process();
	}
}
