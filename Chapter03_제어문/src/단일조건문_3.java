/*
 * 1~100사이의 난수를 3개 발생
 * 발생된 난수를 출력
 * max,min 출력
 */
public class 단일조건문_3 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		System.out.println(num1+", "+num2+", "+num3);
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("max:"+max);
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("min:"+min);
	}
}
