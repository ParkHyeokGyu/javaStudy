/*
 	String toUpperCase()
 	String toLowerCase()
 */
public class 문자열_3 {
	public static void main(String[] args) {
		String msg="Hello Java";
//		msg=msg.toUpperCase();
//		System.out.println(msg.toUpperCase());
//		System.out.println(msg.toLowerCase());
//		msg=msg.toLowerCase();
//		System.out.println(msg);
		// 다시 저장하지 않는 경우에는 원본을 유지한다
		// 오라클에서 대소문자 구분(저장된 데이터)
		
		for(int i=0;i<msg.length();i++) {
			msg=msg.replace(msg.charAt(i), 
					(msg.charAt(i)>='A'&&msg.charAt(i)<='Z')?
							(char)(msg.charAt(i)+32):(char)(msg.charAt(i)-32));
		}
		System.out.println(msg);
		
	}
}
