
public class 문제8 {
	public static void main(String[] args) {
//		8)100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
		int seven=0;
		int sum=0;
		for(int i=100;i<=999;i++) {
			if(i%7==0) {
				seven++;
				sum+=i;
			}
		}
		System.out.println("7의 배수의 갯수:"+seven);
		System.out.println("7의 배수 합:"+sum);
	}
}
