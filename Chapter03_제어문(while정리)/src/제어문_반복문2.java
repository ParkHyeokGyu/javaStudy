// 1~10 => 짝수만 출력
public class 제어문_반복문2 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		i=1;
		do {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);
	}
}
