/*
 	split() => String[]
 */

import java.util.Arrays;

public class 문자열_5 {
	public static void main(String[] args) {
//		String actor="하정우,임시완,배성우,김상호";
//		String[] movie=actor.split(",");
//		System.out.println(Arrays.toString(movie));
//		String actor="하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|"); // "|" 적용하려면 \\를 써야한다
//		System.out.println(Arrays.toString(movie));
//		String name=" Hello Java ";
//		System.out.println("자르기전:"+name.length());
//		name=name.trim(); // 좌우에 있는 공백 제거
//		System.out.println(name);
//		System.out.println("자른후:"+name.length());
		
		// replace() => 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s);
		
		// 문자열결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20) {
//			msg=msg.substring(0,20)+"...";
			msg=msg.substring(0,20).concat("...");
		}
		System.out.println(msg);
	}
}
