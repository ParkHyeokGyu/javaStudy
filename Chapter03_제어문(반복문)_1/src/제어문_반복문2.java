/*
	1차 for
	for(시적점;어디까지;몇씩증가)
		초기값  조건식  ++,+=
	예)1~100
	int i=1 i<=100 i++
	-----------------------
	문자는 정수(문자는 모든 연산 시 => 정수)
	for(int i=...
		----- for문 {} 안에서만 사용 가능
	변수 사용 범위 {} 메모리 해제
	{
		int a=10;
		{
			int b=20;
			{
				int c=30;
			}
		}
	}
 */
public class 제어문_반복문2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i+=2)
			System.out.print(i+" ");
		System.out.println();
		for(int i=2;i<=100;i+=2)
			System.out.print(i+" ");
	}
}
