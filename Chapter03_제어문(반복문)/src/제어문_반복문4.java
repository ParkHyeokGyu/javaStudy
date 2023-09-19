// 1~100 => 루프변수
// 총합,짝수합,홀수합
public class 제어문_반복문4 {
	public static void main(String[] args) {
		int tot=0,even=0,odd=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.printf("총합:%d, 짝수합:%d, 홀수합:%d",tot,even,odd);
	}
}
