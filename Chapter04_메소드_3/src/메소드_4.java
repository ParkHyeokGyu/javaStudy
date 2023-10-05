// 로또 => 6개의 정수, 중복없이 추출(1~45) => 출력

import java.util.Arrays;

public class 메소드_4 {
	static int[] getRand() {
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	static void print(int[] arr) {
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	static void proess() {
		int[] lotto=getRand();
		print(lotto);
	}
	public static void main(String[] args) {
		proess();
	}
}
