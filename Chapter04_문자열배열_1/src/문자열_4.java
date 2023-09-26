/*
 	substring() => 문자를 자른다
 	
 	Hello Java
 	0123456789
 	
 	substring(6) => Java
 	substring(0,5) => Hello
 				-- 5번전까지만 잘라온다
 */
public class 문자열_4 {
	public static void main(String[] args) {
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
//		String s1=s.substring(0,5);
//		String s1=s.substring(6);
//		System.out.println(s1);
//		System.out.println(address.indexOf("지번"));
//		String s1=address.substring(0,address.indexOf("지번")-1);
//		System.out.println(s1);
//		s1=address.substring(address.indexOf("지번")+3);
//		System.out.println(s1);
//		int a=address.lastIndexOf(" ");
//		s1=address.substring(a-3,a);
//		System.out.println(s1);
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(s);
	}
}
