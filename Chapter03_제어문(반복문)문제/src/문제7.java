
public class 문제7 {
	public static void main(String[] args) {
//		7) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
		for(int i=1;i<=10;i++) {
			if(i%3==0) continue;
			System.out.print(i+"\t");
		}
	}
}
