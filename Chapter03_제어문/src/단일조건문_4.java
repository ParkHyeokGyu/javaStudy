/*
 * 정수 2개를 난수로 받아 최대값,최소값을 구한다
 */
public class 단일조건문_4 {
	public static void main(String[] args) {
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		System.out.println(num1+", "+num2);
//		System.out.println("max:"+Math.max(num1, num2));
//		System.out.println("min:"+Math.min(num1, num2));
		int max=num1;
		int min=num2;
		if(max<num2) {
			max=num2;
			min=num1;
		}
		System.out.println("max:"+max+", min:"+min);
	}
}
