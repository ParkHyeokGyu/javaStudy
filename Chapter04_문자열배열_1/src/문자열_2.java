import java.util.Scanner;
// 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
// ABBA => 문자 갯수가 짝수인지 판별 => length()
public class 문자열_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String msg="";
		while(true) {
			System.out.print("문자열 입력:");
			msg=sc.next();
			if(msg.length()%2==0) {
				break;
			}
		}
		boolean bCheck=true;
		for(int i=0;i<msg.length()/2;i++) {
			if(msg.charAt(i)==msg.charAt(msg.length()-i-1)) {
				bCheck=false;
			}else{
				bCheck=true;
				break;
			}
		}
		if(!bCheck) System.out.println("좌우대칭입니다");
		else System.out.println("대칭구조가 아닙니다");
		
//		int j=msg.length()-1;
//		for(int i=0;i<msg.length()/2;i++) {
//			char c=msg.charAt(i);
//			char c1=msg.charAt(j);
//			if(c!=c1) {
//				bCheck=false;
//				break;
//			}
//			j--;
//		}
//		if(bCheck==false) {
//			System.out.println("대칭구조가 아닙니다");
//		}else {
//			System.out.println("좌우대칭입니다");
//		}
	}
}
