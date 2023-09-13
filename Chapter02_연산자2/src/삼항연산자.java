/*
 *	삼항연산자
 *		(조건)?값1:값2
 *			true:값1
 *			false:값2
 *	
 *		int a=10;
 *		(a%2==0)?"짝수":"홀수";
 */
public class 삼항연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		System.out.println("a:"+a+","+((a%2==0)?"짝수":"홀수"));
		
		int b=(int)(Math.random()*4)+1;
		System.out.println("b:"+b+","+((b%2==1)?"남자":"여자"));
	}
}
