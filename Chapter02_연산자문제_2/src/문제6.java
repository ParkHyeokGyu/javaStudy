
public class 문제6 {
	public static void main(String[] args) {
		// 문자형 변수 ch가 영문자이거나 숫자일때 변수 b의 값이 true
		char ch=65;
		boolean b=ch>='A'&&ch<='Z'?true:(ch>='a'&&ch<='z'?true:false);
		System.out.println(b);
	}
}
