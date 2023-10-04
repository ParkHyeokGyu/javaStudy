import java.util.Arrays;

public class 문제6 {
	public static void main(String[] args) {
//		10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(i==3) continue;
			System.out.print(arr[i]+" ");
		}
	}
}
