import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
//		7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
//	   	(switch~case 사용) 
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		char op=' ';
		System.out.print("첫번쨰 정수 입력:");
		num1=sc.nextInt();
		System.out.print("연산자 입력:");
		op=sc.next().charAt(0);
		System.out.print("두번쨰 정수 입력:");
		num2=sc.nextInt();
		
		switch(op) {
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		default:
			System.out.println("잘못된 연산자 입니다");
		}
	}
}
