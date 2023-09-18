// 사칙연산
// 정수 2개 => 연산자(문자열)
// 정수 3개 => 1개 결과값
import java.util.Scanner;

public class 선택문_2 {
	public static void main(String[] args) {
		int num1,num2;
		int result=0;
		Scanner sc=new Scanner(System.in);
		// 초기화
		System.out.print("첫번째 정수 입력:");
		num1=sc.nextInt();
		System.out.print("두번째 정수 입력:");
		num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		
		switch(sc.next()) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
				break;
			}else {
				result=num1/num2;
				break;
			}
		default:
			System.out.println("잘못된 연산자 입니다");
		}
		
		System.out.println("계산결과값:"+result);
	}
}
