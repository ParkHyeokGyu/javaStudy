import java.util.Arrays;

public class 문제1 {
	public static void main(String[] args) {
//		5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
		int[] arr=new int[5];
		int[] rank=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("국어 점수 출력");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+rank[i]);
		}
	}
}
